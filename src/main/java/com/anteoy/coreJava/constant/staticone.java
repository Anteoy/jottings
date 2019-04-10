package com.anteoy.coreJava.constant;

/**
 * Created by zhoudazhuang
 * Date: 17-2-7
 * Time: 下午3:49
 * Description :
 */
public class staticone {
//    static int a = 1;
    String a = "---\n" +
            "id: 75\n" +
            "date: 2016-10-02 09:57:36\n" +
            "title: [转]RDB和AOF持久化对比\n" +
            "categories:\n" +
            "    - 转载\n" +
            "tags:\n" +
            "    - linux service chkconfig systemctl\n" +
            "---\n" +
            "转自：[http://www.cnblogs.com/rollenholt/p/3874443.html](http://www.cnblogs.com/rollenholt/p/3874443.html)\n" +
            "\n" +
            "Redis提供了RDB持久化和AOF持久化，本篇文章中将会对这两种机制进行一些对比\n" +
            "\n" +
            "RDB机制的优势和略施\n" +
            "RDB持久化是指在指定的时间间隔内将内存中的数据集快照写入磁盘。 也是默认的持久化方式，这种方式是就是将内存中数据以快照的方式写入到二进制文件中,默认的文件名为dump.rdb（/var/lib/redis）。\n" +
            "\n" +
            "可以通过配置(/etc/redis/redis.conf)设置自动做快照持久化的方式。我们可以配置redis在n秒内如果超过m个key被修改就自动做快照，下面是默认的快照保存配置\n" +
            "\n" +
            "   save 900 1  #900秒内如果超过1个key被修改，则发起快照保存\n" +
            "   save 300 10 #300秒内容如超过10个key被修改，则发起快照保存\n" +
            "   save 60 10000\n" +
            "RDB文件保存过程\n" +
            "redis调用fork,现在有了子进程和父进程。\n" +
            "父进程继续处理client请求，子进程负责将内存内容写入到临时文件。由于os的写时复制机制（copy on write)父子进程会共享相同的物理页面，当父进程处理写请求时os会为父进程要修改的页面创建副本，而不是写共享的页面。所以子进程的地址空间内的数 据是fork时刻整个数据库的一个快照。\n" +
            "当子进程将快照写入临时文件完毕后，用临时文件替换原来的快照文件，然后子进程退出。\n" +
            "client 也可以使用save或者bgsave命令通知redis做一次快照持久化。save操作是在主线程中保存快照的，由于redis是用一个主线程来处理所有 client的请求，这种方式会阻塞所有client请求。所以不推荐使用。\n" +
            "\n" +
            "另一点需要注意的是，每次快照持久化都是将内存数据完整写入到磁盘一次，并不 是增量的只同步脏数据。如果数据量大的话，而且写操作比较多，必然会引起大量的磁盘io操作，可能会严重影响性能。\n" +
            "\n" +
            "优势\n" +
            "一旦采用该方式，那么你的整个Redis数据库将只包含一个文件，这样非常方便进行备份。比如你可能打算没1天归档一些数据。\n" +
            "方便备份，我们可以很容易的将一个一个RDB文件移动到其他的存储介质上\n" +
            "RDB 在恢复大数据集时的速度比 AOF 的恢复速度要快。\n" +
            "RDB 可以最大化 Redis 的性能：父进程在保存 RDB 文件时唯一要做的就是 fork 出一个子进程，然后这个子进程就会处理接下来的所有保存工作，父进程无须执行任何磁盘 I/O 操作。\n" +
            "劣势\n" +
            "如果你需要尽量避免在服务器故障时丢失数据，那么 RDB 不适合你。 虽然 Redis 允许你设置不同的保存点（save point）来控制保存 RDB 文件的频率， 但是， 因为RDB 文件需要保存整个数据集的状态， 所以它并不是一个轻松的操作。 因此你可能会至少 5 分钟才保存一次 RDB 文件。 在这种情况下， 一旦发生故障停机， 你就可能会丢失好几分钟的数据。\n" +
            "每次保存 RDB 的时候，Redis 都要 fork() 出一个子进程，并由子进程来进行实际的持久化工作。 在数据集比较庞大时， fork() 可能会非常耗时，造成服务器在某某毫秒内停止处理客户端； 如果数据集非常巨大，并且 CPU 时间非常紧张的话，那么这种停止时间甚至可能会长达整整一秒。 虽然 AOF 重写也需要进行 fork() ，但无论 AOF 重写的执行间隔有多长，数据的耐久性都不会有任何损失。\n" +
            "AOF文件保存过程\n" +
            "redis会将每一个收到的写命令都通过write函数追加到文件中(默认是 appendonly.aof)。\n" +
            "\n" +
            "当redis重启时会通过重新执行文件中保存的写命令来在内存中重建整个数据库的内容。当然由于os会在内核中缓存 write做的修改，所以可能不是立即写到磁盘上。这样aof方式的持久化也还是有可能会丢失部分修改。不过我们可以通过配置文件告诉redis我们想要 通过fsync函数强制os写入到磁盘的时机。有三种方式如下（默认是：每秒fsync一次）\n" +
            "\n" +
            "appendonly yes              //启用aof持久化方式\n" +
            "# appendfsync always      //每次收到写命令就立即强制写入磁盘，最慢的，但是保证完全的持久化，不推荐使用\n" +
            "appendfsync everysec     //每秒钟强制写入磁盘一次，在性能和持久化方面做了很好的折中，推荐\n" +
            "# appendfsync no    //完全依赖os，性能最好,持久化没保证\n" +
            "aof 的方式也同时带来了另一个问题。持久化文件会变的越来越大。例如我们调用incr test命令100次，文件中必须保存全部的100条命令，其实有99条都是多余的。因为要恢复数据库的状态其实文件中保存一条set test 100就够了。\n" +
            "\n" +
            "为了压缩aof的持久化文件。redis提供了bgrewriteaof命令。收到此命令redis将使用与快照类似的方式将内存中的数据 以命令的方式保存到临时文件中，最后替换原来的文件。具体过程如下\n" +
            "\n" +
            "redis调用fork ，现在有父子两个进程\n" +
            "子进程根据内存中的数据库快照，往临时文件中写入重建数据库状态的命令\n" +
            "父进程继续处理client请求，除了把写命令写入到原来的aof文件中。同时把收到的写命令缓存起来。这样就能保证如果子进程重写失败的话并不会出问题。\n" +
            "当子进程把快照内容写入已命令方式写到临时文件中后，子进程发信号通知父进程。然后父进程把缓存的写命令也写入到临时文件。\n" +
            "现在父进程可以使用临时文件替换老的aof文件，并重命名，后面收到的写命令也开始往新的aof文件中追加。\n" +
            "需要注意到是重写aof文件的操作，并没有读取旧的aof文件，而是将整个内存中的数据库内容用命令的方式重写了一个新的aof文件,这点和快照有点类似。\n" +
            "\n" +
            "优势\n" +
            "使用 AOF 持久化会让 Redis 变得非常耐久（much more durable）：你可以设置不同的 fsync 策略，比如无 fsync ，每秒钟一次 fsync ，或者每次执行写入命令时 fsync 。 AOF 的默认策略为每秒钟 fsync 一次，在这种配置下，Redis 仍然可以保持良好的性能，并且就算发生故障停机，也最多只会丢失一秒钟的数据（ fsync 会在后台线程执行，所以主线程可以继续努力地处理命令请求）。\n" +
            "\n" +
            "AOF 文件是一个只进行追加操作的日志文件（append only log）， 因此对 AOF 文件的写入不需要进行 seek ， 即使日志因为某些原因而包含了未写入完整的命令（比如写入时磁盘已满，写入中途停机，等等）， redis-check-aof 工具也可以轻易地修复这种问题。\n" +
            "Redis 可以在 AOF 文件体积变得过大时，自动地在后台对 AOF 进行重写： 重写后的新 AOF 文件包含了恢复当前数据集所需的最小命令集合。 整个重写操作是绝对安全的，因为 Redis 在创建新 AOF 文件的过程中，会继续将命令追加到现有的 AOF 文件里面，即使重写过程中发生停机，现有的 AOF 文件也不会丢失。 而一旦新 AOF 文件创建完毕，Redis 就会从旧 AOF 文件切换到新 AOF 文件，并开始对新 AOF 文件进行追加操作。\n" +
            "\n" +
            "AOF 文件有序地保存了对数据库执行的所有写入操作， 这些写入操作以 Redis 协议的格式保存， 因此 AOF 文件的内容非常容易被人读懂， 对文件进行分析（parse）也很轻松。 导出（export） AOF 文件也非常简单： 举个例子， 如果你不小心执行了 FLUSHALL 命令， 但只要 AOF 文件未被重写， 那么只要停止服务器， 移除 AOF 文件末尾的 FLUSHALL 命令， 并重启 Redis ， 就可以将数据集恢复到 FLUSHALL 执行之前的状态。\n" +
            "\n" +
            "劣势\n" +
            "对于相同的数据集来说，AOF 文件的体积通常要大于 RDB 文件的体积。\n" +
            "\n" +
            "根据所使用的 fsync 策略，AOF 的速度可能会慢于 RDB 。 在一般情况下， 每秒 fsync 的性能依然非常高， 而关闭 fsync 可以让 AOF 的速度和 RDB 一样快， 即使在高负荷之下也是如此。 不过在处理巨大的写入载入时，RDB 可以提供更有保证的最大延迟时间（latency）。\n" +
            "\n" +
            "AOF 在过去曾经发生过这样的 bug ： 因为个别命令的原因，导致 AOF 文件在重新载入时，无法将数据集恢复成保存时的原样。 （举个例子，阻塞命令 BRPOPLPUSH 就曾经引起过这样的 bug 。） 测试套件里为这种情况添加了测试： 它们会自动生成随机的、复杂的数据集， 并通过重新载入这些数据来确保一切正常。 虽然这种 bug 在 AOF 文件中并不常见， 但是对比来说， RDB 几乎是不可能出现这种 bug 的。\n" +
            "\n" +
            "抉择\n" +
            "一般来说， 如果想达到足以媲美 PostgreSQL 的数据安全性， 你应该同时使用两种持久化功能。\n" +
            "\n" +
            "如果你非常关心你的数据， 但仍然可以承受数分钟以内的数据丢失， 那么你可以只使用 RDB 持久化。\n" +
            "\n" +
            "其余情况我个人喜好选择AOF\n" +
            "\n";

    String b  = "{\n" +
            "  \"query\": {\n" +
            "    \"dis_max\": {\n" +
            "      \"queries\": [\n" +
            "        {\n" +
            "          \"match\": {\n" +
            "            \"title\": {\n" +
            "              \"query\": \"芝麻\",\n" +
            "              \"minimum_should_match\": \"50%\",\n" +
            "              \"boost\": 4\n" +
            "            }\n" +
            "          }\n" +
            "        },\n" +
            "        {\n" +
            "          \"match\": {\n" +
            "            \"content\": {\n" +
            "              \"query\": \"芝麻\",\n" +
            "              \"minimum_should_match\": \"75%\",\n" +
            "              \"boost\": 4\n" +
            "            }\n" +
            "          }\n" +
            "        },\n" +
            "        {\n" +
            "          \"match\": {\n" +
            "            \"author\": {\n" +
            "              \"query\": \"芝麻\",\n" +
            "              \"minimum_should_match\": \"100%\",\n" +
            "              \"boost\": 2\n" +
            "            }\n" +
            "          }\n" +
            "        }\n" +
            "      ],\n" +
            "      \"tie_breaker\": 0.3\n" +
            "    }\n" +
            "  },\n" +
            "  \"highlight\" : {\n" +
            "            \"fields\" : {\n" +
            "                \"title\" : {},\n" +
            "                \"content\": {}\n" +
            "            }\n" +
            "        }\n" +
            "}";
}
