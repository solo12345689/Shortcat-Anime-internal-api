.class public final Lpc/Q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lexpo/modules/kotlin/types/b;


# instance fields
.field private final a:Lexpo/modules/kotlin/types/b;


# direct methods
.method public constructor <init>(Lexpo/modules/kotlin/types/b;)V
    .locals 1

    .line 1
    const-string v0, "innerConverter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lpc/Q;->a:Lexpo/modules/kotlin/types/b;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    instance-of v0, p1, Lcom/facebook/react/bridge/Dynamic;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Lcom/facebook/react/bridge/Dynamic;

    .line 9
    .line 10
    invoke-interface {v1}, Lcom/facebook/react/bridge/Dynamic;->isNull()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v1, p0, Lpc/Q;->a:Lexpo/modules/kotlin/types/b;

    .line 18
    .line 19
    invoke-interface {v1}, Lexpo/modules/kotlin/types/b;->b()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    if-nez p3, :cond_1

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_1
    iget-object v0, p0, Lpc/Q;->a:Lexpo/modules/kotlin/types/b;

    .line 31
    .line 32
    invoke-interface {v0, p1, p2, p3}, Lexpo/modules/kotlin/types/b;->a(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 38
    return-object p1
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lpc/Q;->a:Lexpo/modules/kotlin/types/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lexpo/modules/kotlin/types/b;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public c()Lexpo/modules/kotlin/jni/ExpectedType;
    .locals 4

    .line 1
    new-instance v0, Lexpo/modules/kotlin/jni/ExpectedType;

    .line 2
    .line 3
    new-instance v1, Lexpo/modules/kotlin/jni/SingleType;

    .line 4
    .line 5
    sget-object v2, Lec/a;->x:Lec/a;

    .line 6
    .line 7
    iget-object v3, p0, Lpc/Q;->a:Lexpo/modules/kotlin/types/b;

    .line 8
    .line 9
    invoke-interface {v3}, Lexpo/modules/kotlin/types/b;->c()Lexpo/modules/kotlin/jni/ExpectedType;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    filled-new-array {v3}, [Lexpo/modules/kotlin/jni/ExpectedType;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-direct {v1, v2, v3}, Lexpo/modules/kotlin/jni/SingleType;-><init>(Lec/a;[Lexpo/modules/kotlin/jni/ExpectedType;)V

    .line 18
    .line 19
    .line 20
    filled-new-array {v1}, [Lexpo/modules/kotlin/jni/SingleType;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, v1}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lexpo/modules/kotlin/jni/SingleType;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method
