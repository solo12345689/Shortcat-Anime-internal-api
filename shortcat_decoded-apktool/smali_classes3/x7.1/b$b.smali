.class public final Lx7/b$b;
.super Lx7/j;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx7/b;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx7/b;


# direct methods
.method constructor <init>(Lx7/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx7/b$b;->a:Lx7/b;

    .line 2
    .line 3
    invoke-direct {p0}, Lx7/j;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;Lx7/k;)V
    .locals 3

    .line 1
    const-string v0, "responder"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx7/b$b;->a:Lx7/b;

    .line 7
    .line 8
    invoke-static {v0}, Lx7/b;->c(Lx7/b;)Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lx7/b$b;->a:Lx7/b;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    instance-of v2, p1, Ljava/lang/Number;

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-static {v1}, Lx7/b;->c(Lx7/b;)Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lx7/b$e;

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-static {v1}, Lx7/b;->c(Lx7/b;)Ljava/util/Map;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Lkotlin/jvm/internal/V;->c(Ljava/lang/Object;)Ljava/util/Map;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Lx7/b$e;->a()V

    .line 43
    .line 44
    .line 45
    const-string p1, ""

    .line 46
    .line 47
    invoke-interface {p2, p1}, Lx7/k;->a(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_2

    .line 53
    :catch_0
    move-exception p1

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    .line 56
    .line 57
    const-string v1, "invalid file handle, it might have timed out"

    .line 58
    .line 59
    invoke-direct {p1, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_1
    new-instance p1, Ljava/lang/Exception;

    .line 64
    .line 65
    const-string v1, "params must be a file handle"

    .line 66
    .line 67
    invoke-direct {p1, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    :goto_0
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-interface {p2, p1}, Lx7/k;->b(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :goto_1
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    .line 80
    monitor-exit v0

    .line 81
    return-void

    .line 82
    :goto_2
    monitor-exit v0

    .line 83
    throw p1
.end method
