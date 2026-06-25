.class public final Lb7/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Lb7/a;

.field private static final b:Ldg/A;

.field private static final c:Ldg/A;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lb7/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lb7/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lb7/a;->a:Lb7/a;

    .line 7
    .line 8
    invoke-static {}, Lv7/f;->f()Ldg/A;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ldg/A;->F()Ldg/A$a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 17
    .line 18
    const-wide/16 v2, 0x5

    .line 19
    .line 20
    invoke-virtual {v0, v2, v3, v1}, Ldg/A$a;->f(JLjava/util/concurrent/TimeUnit;)Ldg/A$a;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 25
    .line 26
    const-wide/16 v3, 0x0

    .line 27
    .line 28
    invoke-virtual {v0, v3, v4, v2}, Ldg/A$a;->Q(JLjava/util/concurrent/TimeUnit;)Ldg/A$a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 33
    .line 34
    invoke-virtual {v0, v3, v4, v2}, Ldg/A$a;->P(JLjava/util/concurrent/TimeUnit;)Ldg/A$a;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ldg/A$a;->c()Ldg/A;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, Lb7/a;->b:Ldg/A;

    .line 43
    .line 44
    invoke-virtual {v0}, Ldg/A;->F()Ldg/A$a;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-wide/16 v2, 0xa

    .line 49
    .line 50
    invoke-virtual {v0, v2, v3, v1}, Ldg/A$a;->f(JLjava/util/concurrent/TimeUnit;)Ldg/A$a;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0, v2, v3, v1}, Ldg/A$a;->Q(JLjava/util/concurrent/TimeUnit;)Ldg/A$a;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ldg/A$a;->c()Ldg/A;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, Lb7/a;->c:Ldg/A;

    .line 63
    .line 64
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


# virtual methods
.method public final a()Ldg/A;
    .locals 1

    .line 1
    sget-object v0, Lb7/a;->b:Ldg/A;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ldg/A;
    .locals 1

    .line 1
    sget-object v0, Lb7/a;->c:Ldg/A;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "host"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, ":443"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v2, v3, v0, v1}, LDf/r;->A(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const-string p1, "https"

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    const-string p1, "http"

    .line 21
    .line 22
    return-object p1
.end method

.method public final d(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "host"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, ":443"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v2, v3, v0, v1}, LDf/r;->A(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const-string p1, "wss"

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    const-string p1, "ws"

    .line 21
    .line 22
    return-object p1
.end method
