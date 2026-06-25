.class public final LBe/T;
.super LBe/s;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LBe/Q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LBe/T$a;
    }
.end annotation


# static fields
.field public static final I:LBe/T$a;

.field static final synthetic X:[Lpe/m;


# instance fields
.field private final E:Lpf/n;

.field private final F:Lye/l0;

.field private final G:Lpf/j;

.field private H:Lye/d;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lkotlin/jvm/internal/F;

    .line 2
    .line 3
    const-class v1, LBe/T;

    .line 4
    .line 5
    const-string v2, "withDispatchReceiver"

    .line 6
    .line 7
    const-string v3, "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/O;->k(Lkotlin/jvm/internal/E;)Lpe/o;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    new-array v1, v1, [Lpe/m;

    .line 19
    .line 20
    aput-object v0, v1, v4

    .line 21
    .line 22
    sput-object v1, LBe/T;->X:[Lpe/m;

    .line 23
    .line 24
    new-instance v0, LBe/T$a;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {v0, v1}, LBe/T$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 28
    .line 29
    .line 30
    sput-object v0, LBe/T;->I:LBe/T$a;

    .line 31
    .line 32
    return-void
.end method

.method private constructor <init>(Lpf/n;Lye/l0;Lye/d;LBe/Q;Lze/h;Lye/b$a;Lye/h0;)V
    .locals 7

    .line 2
    sget-object v4, LXe/h;->j:LXe/f;

    move-object v0, p0

    move-object v1, p2

    move-object v2, p4

    move-object v3, p5

    move-object v5, p6

    move-object v6, p7

    invoke-direct/range {v0 .. v6}, LBe/s;-><init>(Lye/m;Lye/z;Lze/h;LXe/f;Lye/b$a;Lye/h0;)V

    .line 3
    iput-object p1, v0, LBe/T;->E:Lpf/n;

    .line 4
    iput-object v1, v0, LBe/T;->F:Lye/l0;

    .line 5
    invoke-virtual {p0}, LBe/T;->p1()Lye/l0;

    move-result-object p2

    invoke-interface {p2}, Lye/D;->Y()Z

    move-result p2

    invoke-virtual {p0, p2}, LBe/s;->V0(Z)V

    .line 6
    new-instance p2, LBe/S;

    invoke-direct {p2, p0, p3}, LBe/S;-><init>(LBe/T;Lye/d;)V

    invoke-interface {p1, p2}, Lpf/n;->g(Lie/a;)Lpf/j;

    move-result-object p1

    iput-object p1, v0, LBe/T;->G:Lpf/j;

    .line 7
    iput-object p3, v0, LBe/T;->H:Lye/d;

    return-void
.end method

.method public synthetic constructor <init>(Lpf/n;Lye/l0;Lye/d;LBe/Q;Lze/h;Lye/b$a;Lye/h0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, LBe/T;-><init>(Lpf/n;Lye/l0;Lye/d;LBe/Q;Lze/h;Lye/b$a;Lye/h0;)V

    return-void
.end method

.method static synthetic k1(LBe/T;Lye/d;)LBe/T;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LBe/T;->r1(LBe/T;Lye/d;)LBe/T;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final r1(LBe/T;Lye/d;)LBe/T;
    .locals 9

    .line 1
    new-instance v0, LBe/T;

    .line 2
    .line 3
    iget-object v1, p0, LBe/T;->E:Lpf/n;

    .line 4
    .line 5
    invoke-virtual {p0}, LBe/T;->p1()Lye/l0;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {p1}, Lze/a;->getAnnotations()Lze/h;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    invoke-interface {p1}, Lye/b;->h()Lye/b$a;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    const-string v3, "getKind(...)"

    .line 18
    .line 19
    invoke-static {v6, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, LBe/T;->p1()Lye/l0;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-interface {v3}, Lye/p;->k()Lye/h0;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    const-string v3, "getSource(...)"

    .line 31
    .line 32
    invoke-static {v7, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    move-object v4, p0

    .line 36
    move-object v3, p1

    .line 37
    invoke-direct/range {v0 .. v7}, LBe/T;-><init>(Lpf/n;Lye/l0;Lye/d;LBe/Q;Lze/h;Lye/b$a;Lye/h0;)V

    .line 38
    .line 39
    .line 40
    sget-object p0, LBe/T;->I:LBe/T$a;

    .line 41
    .line 42
    invoke-virtual {v4}, LBe/T;->p1()Lye/l0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p0, p1}, LBe/T$a;->a(LBe/T$a;Lye/l0;)Lqf/G0;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const/4 p1, 0x0

    .line 51
    if-nez p0, :cond_0

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_0
    invoke-interface {v3}, Lye/a;->K()Lye/c0;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    invoke-interface {v1, p0}, Lye/c0;->c(Lqf/G0;)Lye/c0;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :cond_1
    move-object v2, p1

    .line 65
    invoke-interface {v3}, Lye/a;->y0()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const-string v1, "getContextReceiverParameters(...)"

    .line 70
    .line 71
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance v3, Ljava/util/ArrayList;

    .line 75
    .line 76
    const/16 v1, 0xa

    .line 77
    .line 78
    invoke-static {p1, v1}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    .line 84
    .line 85
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_2

    .line 94
    .line 95
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Lye/c0;

    .line 100
    .line 101
    invoke-interface {v1, p0}, Lye/c0;->c(Lqf/G0;)Lye/c0;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_2
    invoke-virtual {v4}, LBe/T;->p1()Lye/l0;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-interface {p0}, Lye/i;->q()Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {v4}, LBe/s;->j()Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-virtual {v4}, LBe/T;->getReturnType()Lqf/S;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    sget-object v7, Lye/E;->b:Lye/E;

    .line 126
    .line 127
    invoke-virtual {v4}, LBe/T;->p1()Lye/l0;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-interface {p1}, Lye/D;->getVisibility()Lye/u;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    const/4 v1, 0x0

    .line 136
    move-object v4, p0

    .line 137
    invoke-virtual/range {v0 .. v8}, LBe/s;->R0(Lye/c0;Lye/c0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lqf/S;Lye/E;Lye/u;)LBe/s;

    .line 138
    .line 139
    .line 140
    return-object v0
.end method


# virtual methods
.method public bridge synthetic F0()Lye/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LBe/T;->o1()LBe/Q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic L0(Lye/m;Lye/z;Lye/b$a;LXe/f;Lze/h;Lye/h0;)LBe/s;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, LBe/T;->m1(Lye/m;Lye/z;Lye/b$a;LXe/f;Lze/h;Lye/h0;)LBe/T;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public R()Lye/d;
    .locals 1

    .line 1
    iget-object v0, p0, LBe/T;->H:Lye/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic a()Lye/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LBe/T;->o1()LBe/Q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lye/b;
    .locals 1

    .line 2
    invoke-virtual {p0}, LBe/T;->o1()LBe/Q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lye/m;
    .locals 1

    .line 3
    invoke-virtual {p0}, LBe/T;->o1()LBe/Q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lye/z;
    .locals 1

    .line 4
    invoke-virtual {p0}, LBe/T;->o1()LBe/Q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Lye/i;
    .locals 1

    .line 1
    invoke-virtual {p0}, LBe/T;->n1()Lye/l0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Lye/m;
    .locals 1

    .line 2
    invoke-virtual {p0}, LBe/T;->n1()Lye/l0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Lqf/G0;)Lye/l;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LBe/T;->q1(Lqf/G0;)LBe/Q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Lqf/G0;)Lye/n;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, LBe/T;->q1(Lqf/G0;)LBe/Q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Lqf/G0;)Lye/z;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, LBe/T;->q1(Lqf/G0;)LBe/Q;

    move-result-object p1

    return-object p1
.end method

.method public e0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LBe/T;->R()Lye/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lye/l;->e0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public f0()Lye/e;
    .locals 2

    .line 1
    invoke-virtual {p0}, LBe/T;->R()Lye/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lye/l;->f0()Lye/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "getConstructedClass(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public getReturnType()Lqf/S;
    .locals 1

    .line 1
    invoke-super {p0}, LBe/s;->getReturnType()Lqf/S;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public bridge synthetic l0(Lye/m;Lye/E;Lye/u;Lye/b$a;Z)Lye/b;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, LBe/T;->l1(Lye/m;Lye/E;Lye/u;Lye/b$a;Z)LBe/Q;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public l1(Lye/m;Lye/E;Lye/u;Lye/b$a;Z)LBe/Q;
    .locals 1

    .line 1
    const-string v0, "newOwner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "modality"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "visibility"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "kind"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, LBe/s;->v()Lye/z$a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0, p1}, Lye/z$a;->n(Lye/m;)Lye/z$a;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p1, p2}, Lye/z$a;->g(Lye/E;)Lye/z$a;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {p1, p3}, Lye/z$a;->h(Lye/u;)Lye/z$a;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p1, p4}, Lye/z$a;->i(Lye/b$a;)Lye/z$a;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-interface {p1, p5}, Lye/z$a;->m(Z)Lye/z$a;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-interface {p1}, Lye/z$a;->build()Lye/z;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string p2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor"

    .line 50
    .line 51
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    check-cast p1, LBe/Q;

    .line 55
    .line 56
    return-object p1
.end method

.method protected m1(Lye/m;Lye/z;Lye/b$a;LXe/f;Lze/h;Lye/h0;)LBe/T;
    .locals 8

    .line 1
    const-string p2, "newOwner"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "kind"

    .line 7
    .line 8
    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "annotations"

    .line 12
    .line 13
    invoke-static {p5, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p1, "source"

    .line 17
    .line 18
    invoke-static {p6, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object v6, Lye/b$a;->a:Lye/b$a;

    .line 22
    .line 23
    if-eq p3, v6, :cond_0

    .line 24
    .line 25
    sget-object p1, Lye/b$a;->d:Lye/b$a;

    .line 26
    .line 27
    :cond_0
    new-instance v0, LBe/T;

    .line 28
    .line 29
    iget-object v1, p0, LBe/T;->E:Lpf/n;

    .line 30
    .line 31
    invoke-virtual {p0}, LBe/T;->p1()Lye/l0;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {p0}, LBe/T;->R()Lye/d;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    move-object v4, p0

    .line 40
    move-object v5, p5

    .line 41
    move-object v7, p6

    .line 42
    invoke-direct/range {v0 .. v7}, LBe/T;-><init>(Lpf/n;Lye/l0;Lye/d;LBe/Q;Lze/h;Lye/b$a;Lye/h0;)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method

.method public n1()Lye/l0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LBe/T;->p1()Lye/l0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public o1()LBe/Q;
    .locals 2

    .line 1
    invoke-super {p0}, LBe/s;->a()Lye/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast v0, LBe/Q;

    .line 11
    .line 12
    return-object v0
.end method

.method public p1()Lye/l0;
    .locals 1

    .line 1
    iget-object v0, p0, LBe/T;->F:Lye/l0;

    .line 2
    .line 3
    return-object v0
.end method

.method public q1(Lqf/G0;)LBe/Q;
    .locals 2

    .line 1
    const-string v0, "substitutor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, LBe/s;->c(Lqf/G0;)Lye/z;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast p1, LBe/T;

    .line 16
    .line 17
    invoke-virtual {p1}, LBe/T;->getReturnType()Lqf/S;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lqf/G0;->f(Lqf/S;)Lqf/G0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "create(...)"

    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, LBe/T;->R()Lye/d;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, Lye/d;->a()Lye/d;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {v1, v0}, Lye/d;->c(Lqf/G0;)Lye/d;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    return-object p1

    .line 46
    :cond_0
    iput-object v0, p1, LBe/T;->H:Lye/d;

    .line 47
    .line 48
    return-object p1
.end method
