.class public final Lwe/b;
.super LBe/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwe/b$a;,
        Lwe/b$b;
    }
.end annotation


# static fields
.field public static final n:Lwe/b$a;

.field private static final o:LXe/b;

.field private static final p:LXe/b;


# instance fields
.field private final f:Lpf/n;

.field private final g:Lye/N;

.field private final h:Lwe/f;

.field private final i:I

.field private final j:Lwe/b$b;

.field private final k:Lwe/d;

.field private final l:Ljava/util/List;

.field private final m:Lwe/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lwe/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lwe/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lwe/b;->n:Lwe/b$a;

    .line 8
    .line 9
    new-instance v0, LXe/b;

    .line 10
    .line 11
    sget-object v1, Lve/o;->A:LXe/c;

    .line 12
    .line 13
    const-string v2, "Function"

    .line 14
    .line 15
    invoke-static {v2}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "identifier(...)"

    .line 20
    .line 21
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, LXe/b;-><init>(LXe/c;LXe/f;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lwe/b;->o:LXe/b;

    .line 28
    .line 29
    new-instance v0, LXe/b;

    .line 30
    .line 31
    sget-object v1, Lve/o;->x:LXe/c;

    .line 32
    .line 33
    const-string v2, "KFunction"

    .line 34
    .line 35
    invoke-static {v2}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, v1, v2}, LXe/b;-><init>(LXe/c;LXe/f;)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lwe/b;->p:LXe/b;

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(Lpf/n;Lye/N;Lwe/f;I)V
    .locals 3

    .line 1
    const-string v0, "storageManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "containingDeclaration"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "functionTypeKind"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p3, p4}, Lwe/f;->c(I)LXe/f;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {p0, p1, v0}, LBe/a;-><init>(Lpf/n;LXe/f;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lwe/b;->f:Lpf/n;

    .line 24
    .line 25
    iput-object p2, p0, Lwe/b;->g:Lye/N;

    .line 26
    .line 27
    iput-object p3, p0, Lwe/b;->h:Lwe/f;

    .line 28
    .line 29
    iput p4, p0, Lwe/b;->i:I

    .line 30
    .line 31
    new-instance p2, Lwe/b$b;

    .line 32
    .line 33
    invoke-direct {p2, p0}, Lwe/b$b;-><init>(Lwe/b;)V

    .line 34
    .line 35
    .line 36
    iput-object p2, p0, Lwe/b;->j:Lwe/b$b;

    .line 37
    .line 38
    new-instance p2, Lwe/d;

    .line 39
    .line 40
    invoke-direct {p2, p1, p0}, Lwe/d;-><init>(Lpf/n;Lwe/b;)V

    .line 41
    .line 42
    .line 43
    iput-object p2, p0, Lwe/b;->k:Lwe/d;

    .line 44
    .line 45
    new-instance p1, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance p2, Loe/f;

    .line 51
    .line 52
    const/4 p3, 0x1

    .line 53
    invoke-direct {p2, p3, p4}, Loe/f;-><init>(II)V

    .line 54
    .line 55
    .line 56
    new-instance p3, Ljava/util/ArrayList;

    .line 57
    .line 58
    const/16 p4, 0xa

    .line 59
    .line 60
    invoke-static {p2, p4}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 61
    .line 62
    .line 63
    move-result p4

    .line 64
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result p4

    .line 75
    if-eqz p4, :cond_0

    .line 76
    .line 77
    move-object p4, p2

    .line 78
    check-cast p4, LUd/O;

    .line 79
    .line 80
    invoke-virtual {p4}, LUd/O;->nextInt()I

    .line 81
    .line 82
    .line 83
    move-result p4

    .line 84
    sget-object v0, Lqf/N0;->f:Lqf/N0;

    .line 85
    .line 86
    new-instance v1, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    const/16 v2, 0x50

    .line 92
    .line 93
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p4

    .line 103
    invoke-static {p1, p0, v0, p4}, Lwe/b;->K0(Ljava/util/ArrayList;Lwe/b;Lqf/N0;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    sget-object p4, LTd/L;->a:LTd/L;

    .line 107
    .line 108
    invoke-interface {p3, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_0
    sget-object p2, Lqf/N0;->g:Lqf/N0;

    .line 113
    .line 114
    const-string p3, "R"

    .line 115
    .line 116
    invoke-static {p1, p0, p2, p3}, Lwe/b;->K0(Ljava/util/ArrayList;Lwe/b;Lqf/N0;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-static {p1}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    iput-object p1, p0, Lwe/b;->l:Ljava/util/List;

    .line 124
    .line 125
    sget-object p1, Lwe/c;->a:Lwe/c$a;

    .line 126
    .line 127
    iget-object p2, p0, Lwe/b;->h:Lwe/f;

    .line 128
    .line 129
    invoke-virtual {p1, p2}, Lwe/c$a;->a(Lwe/f;)Lwe/c;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    iput-object p1, p0, Lwe/b;->m:Lwe/c;

    .line 134
    .line 135
    return-void
.end method

.method private static final K0(Ljava/util/ArrayList;Lwe/b;Lqf/N0;Ljava/lang/String;)V
    .locals 8

    .line 1
    sget-object v0, Lze/h;->k0:Lze/h$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lze/h$a;->b()Lze/h;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-static {p3}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 8
    .line 9
    .line 10
    move-result-object v5

    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v6

    .line 15
    iget-object v7, p1, Lwe/b;->f:Lpf/n;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    move-object v1, p1

    .line 19
    move-object v4, p2

    .line 20
    invoke-static/range {v1 .. v7}, LBe/U;->R0(Lye/m;Lze/h;ZLqf/N0;LXe/f;ILpf/n;)Lye/m0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static final synthetic L0(Lwe/b;)Lye/N;
    .locals 0

    .line 1
    iget-object p0, p0, Lwe/b;->g:Lye/N;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic M0()LXe/b;
    .locals 1

    .line 1
    sget-object v0, Lwe/b;->o:LXe/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic N0()LXe/b;
    .locals 1

    .line 1
    sget-object v0, Lwe/b;->p:LXe/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic O0(Lwe/b;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lwe/b;->l:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic P0(Lwe/b;)Lpf/n;
    .locals 0

    .line 1
    iget-object p0, p0, Lwe/b;->f:Lpf/n;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public A()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public bridge synthetic D()Lye/d;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwe/b;->Y0()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lye/d;

    .line 6
    .line 7
    return-object v0
.end method

.method public I0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final Q0()I
    .locals 1

    .line 1
    iget v0, p0, Lwe/b;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public R0()Ljava/lang/Void;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public S0()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public T0()Lye/N;
    .locals 1

    .line 1
    iget-object v0, p0, Lwe/b;->g:Lye/N;

    .line 2
    .line 3
    return-object v0
.end method

.method public final U0()Lwe/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lwe/b;->h:Lwe/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public V()Lye/r0;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public V0()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public W0()Ljf/k$b;
    .locals 1

    .line 1
    sget-object v0, Ljf/k$b;->b:Ljf/k$b;

    .line 2
    .line 3
    return-object v0
.end method

.method protected X0(Lrf/g;)Lwe/d;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lwe/b;->k:Lwe/d;

    .line 7
    .line 8
    return-object p1
.end method

.method public Y()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public Y0()Ljava/lang/Void;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public bridge synthetic b()Lye/m;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwe/b;->T0()Lye/N;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public g0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public getAnnotations()Lze/h;
    .locals 1

    .line 1
    sget-object v0, Lze/h;->k0:Lze/h$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lze/h$a;->b()Lze/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getVisibility()Lye/u;
    .locals 2

    .line 1
    sget-object v0, Lye/t;->e:Lye/u;

    .line 2
    .line 3
    const-string v1, "PUBLIC"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public h()Lye/f;
    .locals 1

    .line 1
    sget-object v0, Lye/f;->c:Lye/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic i()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwe/b;->S0()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public isExternal()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public isInline()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public bridge synthetic j0(Lrf/g;)Ljf/k;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lwe/b;->X0(Lrf/g;)Lwe/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public k()Lye/h0;
    .locals 2

    .line 1
    sget-object v0, Lye/h0;->a:Lye/h0;

    .line 2
    .line 3
    const-string v1, "NO_SOURCE"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public l()Lqf/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lwe/b;->j:Lwe/b$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public m0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public bridge synthetic o0()Ljf/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwe/b;->W0()Ljf/k$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic p0()Lye/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwe/b;->R0()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lye/e;

    .line 6
    .line 7
    return-object v0
.end method

.method public q()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lwe/b;->l:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public r()Lye/E;
    .locals 1

    .line 1
    sget-object v0, Lye/E;->e:Lye/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public s()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, LBe/a;->getName()LXe/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LXe/f;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "asString(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public bridge synthetic z()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwe/b;->V0()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
