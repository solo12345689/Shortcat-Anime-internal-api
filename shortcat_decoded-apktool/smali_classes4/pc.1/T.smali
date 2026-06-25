.class public final Lpc/T;
.super Lpc/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lpc/u;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public c()Lexpo/modules/kotlin/jni/ExpectedType;
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/kotlin/jni/ExpectedType;

    .line 2
    .line 3
    sget-object v1, Lec/a;->m:Lec/a;

    .line 4
    .line 5
    filled-new-array {v1}, [Lec/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lec/a;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic e(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lpc/T;->g(Ljava/lang/Object;LUb/d;Z)Lqb/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic f(Lcom/facebook/react/bridge/Dynamic;LUb/d;Z)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lpc/T;->h(Lcom/facebook/react/bridge/Dynamic;LUb/d;Z)Lqb/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public g(Ljava/lang/Object;LUb/d;Z)Lqb/b;
    .locals 0

    .line 1
    const-string p2, "value"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lqb/a;

    .line 7
    .line 8
    check-cast p1, Lcom/facebook/react/bridge/ReadableMap;

    .line 9
    .line 10
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableMap;->toHashMap()Ljava/util/HashMap;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {p2, p1}, Lqb/a;-><init>(Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    return-object p2
.end method

.method public h(Lcom/facebook/react/bridge/Dynamic;LUb/d;Z)Lqb/b;
    .locals 0

    .line 1
    const-string p2, "value"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lqb/a;

    .line 7
    .line 8
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->asMap()Lcom/facebook/react/bridge/ReadableMap;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableMap;->toHashMap()Ljava/util/HashMap;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {p2, p1}, Lqb/a;-><init>(Ljava/util/Map;)V

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :cond_0
    new-instance p1, Lexpo/modules/kotlin/exception/DynamicCastException;

    .line 23
    .line 24
    const-class p2, Lcom/facebook/react/bridge/ReadableMap;

    .line 25
    .line 26
    invoke-static {p2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-direct {p1, p2}, Lexpo/modules/kotlin/exception/DynamicCastException;-><init>(Lpe/d;)V

    .line 31
    .line 32
    .line 33
    throw p1
.end method
