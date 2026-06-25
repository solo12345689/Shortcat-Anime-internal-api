.class public Lz6/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LC5/a$c;


# direct methods
.method public constructor <init>(LB6/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lz6/a$a;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1}, Lz6/a$a;-><init>(Lz6/a;LB6/a;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lz6/a;->a:LC5/a$c;

    .line 10
    .line 11
    return-void
.end method

.method static bridge synthetic a(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lz6/a;->d(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static d(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public b(Ljava/io/Closeable;)LC5/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lz6/a;->a:LC5/a$c;

    .line 2
    .line 3
    invoke-static {p1, v0}, LC5/a;->O(Ljava/io/Closeable;LC5/a$c;)LC5/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Ljava/lang/Object;LC5/h;)LC5/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lz6/a;->a:LC5/a$c;

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, LC5/a;->Y(Ljava/lang/Object;LC5/h;LC5/a$c;)LC5/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
