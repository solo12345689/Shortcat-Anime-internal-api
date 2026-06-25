.class public final Lexpo/modules/kotlin/views/u;
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
    iput-object p1, p0, Lexpo/modules/kotlin/views/u;->a:Lpe/q;

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
    sget-object v1, Lec/a;->e:Lec/a;

    .line 4
    .line 5
    sget-object v2, Lec/a;->t:Lec/a;

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
    invoke-virtual {p0, p1, p2, p3}, Lexpo/modules/kotlin/views/u;->e(Ljava/lang/Object;LUb/d;Z)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public e(Ljava/lang/Object;LUb/d;Z)Landroid/view/View;
    .locals 1

    .line 1
    const-string p3, "value"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_1

    .line 7
    .line 8
    invoke-virtual {p2}, LUb/d;->g()V

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {p2, p1}, LUb/d;->k(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    return-object p2

    .line 24
    :cond_0
    new-instance p2, Lcc/j;

    .line 25
    .line 26
    iget-object p3, p0, Lexpo/modules/kotlin/views/u;->a:Lpe/q;

    .line 27
    .line 28
    invoke-interface {p3}, Lpe/q;->c()Lpe/f;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    const-string v0, "null cannot be cast to non-null type kotlin.reflect.KClass<*>"

    .line 33
    .line 34
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    check-cast p3, Lpe/d;

    .line 38
    .line 39
    invoke-direct {p2, p3, p1}, Lcc/j;-><init>(Lpe/d;I)V

    .line 40
    .line 41
    .line 42
    throw p2

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
