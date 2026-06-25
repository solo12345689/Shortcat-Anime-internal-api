.class public final Lv7/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Lv7/f;

.field private static b:Ldg/A;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lv7/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lv7/f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lv7/f;->a:Lv7/f;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final a()Ldg/A;
    .locals 1

    .line 1
    invoke-static {}, Lv7/f;->c()Ldg/A$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ldg/A$a;->c()Ldg/A;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static final b(Landroid/content/Context;)Ldg/A;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lv7/f;->d(Landroid/content/Context;)Ldg/A$a;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ldg/A$a;->c()Ldg/A;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static final c()Ldg/A$a;
    .locals 4

    .line 1
    new-instance v0, Ldg/A$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ldg/A$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    invoke-virtual {v0, v2, v3, v1}, Ldg/A$a;->f(JLjava/util/concurrent/TimeUnit;)Ldg/A$a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, v2, v3, v1}, Ldg/A$a;->P(JLjava/util/concurrent/TimeUnit;)Ldg/A$a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, v2, v3, v1}, Ldg/A$a;->Q(JLjava/util/concurrent/TimeUnit;)Ldg/A$a;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Lv7/k;

    .line 23
    .line 24
    invoke-direct {v1}, Lv7/k;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ldg/A$a;->g(Ldg/n;)Ldg/A$a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method

.method public static final d(Landroid/content/Context;)Ldg/A$a;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/high16 v0, 0xa00000

    .line 7
    .line 8
    invoke-static {p0, v0}, Lv7/f;->e(Landroid/content/Context;I)Ldg/A$a;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static final e(Landroid/content/Context;I)Ldg/A$a;
    .locals 4

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lv7/f;->c()Ldg/A$a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    new-instance v1, Ljava/io/File;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string v2, "http-cache"

    .line 20
    .line 21
    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    new-instance p0, Ldg/c;

    .line 25
    .line 26
    int-to-long v2, p1

    .line 27
    invoke-direct {p0, v1, v2, v3}, Ldg/c;-><init>(Ljava/io/File;J)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ldg/A$a;->d(Ldg/c;)Ldg/A$a;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static final f()Ldg/A;
    .locals 1

    .line 1
    sget-object v0, Lv7/f;->b:Ldg/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lv7/f;->a()Ldg/A;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lv7/f;->b:Ldg/A;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method
