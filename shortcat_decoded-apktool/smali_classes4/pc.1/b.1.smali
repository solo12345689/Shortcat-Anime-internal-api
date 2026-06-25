.class public final Lpc/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lpe/q;

.field private final b:Lpc/X;

.field private final c:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Lpe/q;Lpc/X;)V
    .locals 1

    const-string v0, "kType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lpc/b;->a:Lpe/q;

    .line 3
    iput-object p2, p0, Lpc/b;->b:Lpc/X;

    .line 4
    new-instance p1, Lpc/a;

    invoke-direct {p1, p0}, Lpc/a;-><init>(Lpc/b;)V

    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lpc/b;->c:Lkotlin/Lazy;

    return-void
.end method

.method public synthetic constructor <init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    return-void
.end method

.method public static synthetic a(Lpc/b;)Lexpo/modules/kotlin/types/b;
    .locals 0

    .line 1
    invoke-static {p0}, Lpc/b;->d(Lpc/b;)Lexpo/modules/kotlin/types/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Lpc/b;Ljava/lang/Object;LUb/d;ZILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 7
    .line 8
    if-eqz p4, :cond_1

    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lpc/b;->b(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method private static final d(Lpc/b;)Lexpo/modules/kotlin/types/b;
    .locals 2

    .line 1
    iget-object v0, p0, Lpc/b;->b:Lpc/X;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lpc/b;->a:Lpe/q;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Lpc/X;->a(Lpe/q;)Lexpo/modules/kotlin/types/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object v0

    .line 15
    :cond_1
    :goto_0
    sget-object v0, Lpc/a0;->a:Lpc/a0;

    .line 16
    .line 17
    iget-object p0, p0, Lpc/b;->a:Lpe/q;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Lpc/a0;->a(Lpe/q;)Lexpo/modules/kotlin/types/b;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method private final e()Lexpo/modules/kotlin/types/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lpc/b;->c:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lexpo/modules/kotlin/types/b;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final b(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;
    .locals 1

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, Lpc/b;->e()Lexpo/modules/kotlin/types/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lexpo/modules/kotlin/types/b;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    instance-of v0, p1, Lcom/facebook/react/bridge/Dynamic;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    invoke-direct {p0}, Lpc/b;->e()Lexpo/modules/kotlin/types/b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0, p1, p2, p3}, Lexpo/modules/kotlin/types/b;->a(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method public final f()Lexpo/modules/kotlin/jni/ExpectedType;
    .locals 1

    .line 1
    invoke-direct {p0}, Lpc/b;->e()Lexpo/modules/kotlin/types/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lexpo/modules/kotlin/types/b;->c()Lexpo/modules/kotlin/jni/ExpectedType;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final g()Lpe/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lpc/b;->a:Lpe/q;

    .line 2
    .line 3
    return-object v0
.end method
