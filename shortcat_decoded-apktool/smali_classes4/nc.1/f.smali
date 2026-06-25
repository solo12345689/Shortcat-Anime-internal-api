.class public final Lnc/f;
.super Lexpo/modules/kotlin/types/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lpe/q;


# direct methods
.method public constructor <init>(Lpe/q;)V
    .locals 1

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lexpo/modules/kotlin/types/a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lnc/f;->a:Lpe/q;

    .line 10
    .line 11
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
    .locals 3

    .line 1
    new-instance v0, Lexpo/modules/kotlin/jni/ExpectedType;

    .line 2
    .line 3
    sget-object v1, Lec/a;->u:Lec/a;

    .line 4
    .line 5
    sget-object v2, Lec/a;->e:Lec/a;

    .line 6
    .line 7
    filled-new-array {v1, v2}, [Lec/a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lec/a;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public bridge synthetic d(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lnc/f;->e(Ljava/lang/Object;LUb/d;Z)Lexpo/modules/kotlin/sharedobjects/SharedObject;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public e(Ljava/lang/Object;LUb/d;Z)Lexpo/modules/kotlin/sharedobjects/SharedObject;
    .locals 0

    .line 1
    const-string p3, "value"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of p3, p1, Lcom/facebook/react/bridge/Dynamic;

    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    check-cast p1, Lcom/facebook/react/bridge/Dynamic;

    .line 11
    .line 12
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->asInt()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    check-cast p1, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    :goto_0
    invoke-static {p1}, Lnc/c;->b(I)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p2}, LUb/d;->D()Llc/a;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-static {p1, p2}, Lnc/c;->f(ILlc/b;)Lexpo/modules/kotlin/sharedobjects/SharedObject;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string p2, "null cannot be cast to non-null type T of expo.modules.kotlin.sharedobjects.SharedObjectTypeConverter"

    .line 38
    .line 39
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_1
    new-instance p1, Lcc/e;

    .line 44
    .line 45
    invoke-direct {p1}, Lcc/e;-><init>()V

    .line 46
    .line 47
    .line 48
    throw p1
.end method
