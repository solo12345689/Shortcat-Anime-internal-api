.class public final Lexpo/modules/kotlin/types/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lexpo/modules/kotlin/types/b;


# instance fields
.field private final a:Lexpo/modules/kotlin/types/b;


# direct methods
.method public constructor <init>(Lpc/X;Lpe/q;)V
    .locals 1

    .line 1
    const-string v0, "converterProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "innerType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p2}, Lpe/q;->e()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-static {p2}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    check-cast p2, Lpe/s;

    .line 23
    .line 24
    invoke-virtual {p2}, Lpe/s;->c()Lpe/q;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    invoke-interface {p1, p2}, Lpc/X;->a(Lpe/q;)Lexpo/modules/kotlin/types/b;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lexpo/modules/kotlin/types/d;->a:Lexpo/modules/kotlin/types/b;

    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 38
    .line 39
    const-string p2, "The ValueOrUndefined type should contain the argument type."

    .line 40
    .line 41
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lexpo/modules/kotlin/types/d;->d(Ljava/lang/Object;LUb/d;Z)Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
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
    sget-object v2, Lec/a;->y:Lec/a;

    .line 6
    .line 7
    iget-object v3, p0, Lexpo/modules/kotlin/types/d;->a:Lexpo/modules/kotlin/types/b;

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

.method public d(Ljava/lang/Object;LUb/d;Z)Lexpo/modules/kotlin/types/ValueOrUndefined;
    .locals 6

    .line 1
    instance-of p3, p1, Lexpo/modules/kotlin/types/ValueOrUndefined$b;

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p1, Lexpo/modules/kotlin/types/ValueOrUndefined$b;->b:Lexpo/modules/kotlin/types/ValueOrUndefined$b;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object v0, p0, Lexpo/modules/kotlin/types/d;->a:Lexpo/modules/kotlin/types/b;

    .line 9
    .line 10
    const/4 v4, 0x4

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    move-object v1, p1

    .line 14
    move-object v2, p2

    .line 15
    invoke-static/range {v0 .. v5}, Lexpo/modules/kotlin/types/b$a;->a(Lexpo/modules/kotlin/types/b;Ljava/lang/Object;LUb/d;ZILjava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance p2, Lexpo/modules/kotlin/types/ValueOrUndefined$c;

    .line 20
    .line 21
    invoke-direct {p2, p1}, Lexpo/modules/kotlin/types/ValueOrUndefined$c;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object p2
.end method
