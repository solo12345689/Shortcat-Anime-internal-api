.class final Lz/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lz/x;


# instance fields
.field private final a:Lkotlin/jvm/functions/Function1;

.field private final b:Lz/u;

.field private final c:Lx/N;

.field private final d:LY/C0;

.field private final e:LY/C0;

.field private final f:LY/C0;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz/i;->a:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    new-instance p1, Lz/i$b;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Lz/i$b;-><init>(Lz/i;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lz/i;->b:Lz/u;

    .line 12
    .line 13
    new-instance p1, Lx/N;

    .line 14
    .line 15
    invoke-direct {p1}, Lx/N;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lz/i;->c:Lx/N;

    .line 19
    .line 20
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    const/4 v1, 0x2

    .line 24
    invoke-static {p1, v0, v1, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iput-object v2, p0, Lz/i;->d:LY/C0;

    .line 29
    .line 30
    invoke-static {p1, v0, v1, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iput-object v2, p0, Lz/i;->e:LY/C0;

    .line 35
    .line 36
    invoke-static {p1, v0, v1, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lz/i;->f:LY/C0;

    .line 41
    .line 42
    return-void
.end method

.method public static final synthetic g(Lz/i;)Lx/N;
    .locals 0

    .line 1
    iget-object p0, p0, Lz/i;->c:Lx/N;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lz/i;)Lz/u;
    .locals 0

    .line 1
    iget-object p0, p0, Lz/i;->b:Lz/u;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(Lz/i;)LY/C0;
    .locals 0

    .line 1
    iget-object p0, p0, Lz/i;->f:LY/C0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic j(Lz/i;)LY/C0;
    .locals 0

    .line 1
    iget-object p0, p0, Lz/i;->e:LY/C0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic k(Lz/i;)LY/C0;
    .locals 0

    .line 1
    iget-object p0, p0, Lz/i;->d:LY/C0;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lz/i;->d:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/C0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public b(Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lz/i$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, p2, v1}, Lz/i$a;-><init>(Lz/i;Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p3}, LGf/P;->e(Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-ne p1, p2, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 19
    .line 20
    return-object p1
.end method

.method public f(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lz/i;->a:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Number;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public final l()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    iget-object v0, p0, Lz/i;->a:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method
