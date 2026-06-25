.class public final Landroidx/compose/ui/layout/x;
.super LK0/J$f;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final b:Landroidx/compose/ui/layout/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/ui/layout/x;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/ui/layout/x;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/ui/layout/x;->b:Landroidx/compose/ui/layout/x;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "Undefined intrinsics block and it is required"

    .line 2
    .line 3
    invoke-direct {p0, v0}, LK0/J$f;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;
    .locals 15

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-wide/from16 v1, p3

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    if-eqz v3, :cond_2

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    const/4 v5, 0x0

    .line 13
    if-eq v3, v4, :cond_1

    .line 14
    .line 15
    new-instance v3, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    move v6, v5

    .line 29
    move v7, v6

    .line 30
    :goto_0
    if-ge v5, v4, :cond_0

    .line 31
    .line 32
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    check-cast v8, LI0/A;

    .line 37
    .line 38
    invoke-interface {v8, v1, v2}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    invoke-virtual {v8}, Landroidx/compose/ui/layout/s;->W0()I

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    invoke-static {v9, v6}, Ljava/lang/Math;->max(II)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    invoke-virtual {v8}, Landroidx/compose/ui/layout/s;->P0()I

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    invoke-static {v9, v7}, Ljava/lang/Math;->max(II)I

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    invoke-interface {v3, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    add-int/lit8 v5, v5, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-static {v1, v2, v6}, Li1/c;->g(JI)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    invoke-static {v1, v2, v7}, Li1/c;->f(JI)I

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    new-instance v12, Landroidx/compose/ui/layout/x$c;

    .line 73
    .line 74
    invoke-direct {v12, v3}, Landroidx/compose/ui/layout/x$c;-><init>(Ljava/util/List;)V

    .line 75
    .line 76
    .line 77
    const/4 v13, 0x4

    .line 78
    const/4 v14, 0x0

    .line 79
    const/4 v11, 0x0

    .line 80
    move-object/from16 v8, p1

    .line 81
    .line 82
    invoke-static/range {v8 .. v14}, Landroidx/compose/ui/layout/l;->u0(Landroidx/compose/ui/layout/l;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LI0/C;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0

    .line 87
    :cond_1
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, LI0/A;

    .line 92
    .line 93
    invoke-interface {v0, v1, v2}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Landroidx/compose/ui/layout/s;->W0()I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    invoke-static {v1, v2, v3}, Li1/c;->g(JI)I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    invoke-virtual {v0}, Landroidx/compose/ui/layout/s;->P0()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    invoke-static {v1, v2, v4}, Li1/c;->f(JI)I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    new-instance v5, Landroidx/compose/ui/layout/x$b;

    .line 114
    .line 115
    invoke-direct {v5, v0}, Landroidx/compose/ui/layout/x$b;-><init>(Landroidx/compose/ui/layout/s;)V

    .line 116
    .line 117
    .line 118
    const/4 v6, 0x4

    .line 119
    const/4 v7, 0x0

    .line 120
    const/4 v4, 0x0

    .line 121
    move v2, v3

    .line 122
    move v3, v1

    .line 123
    move-object/from16 v1, p1

    .line 124
    .line 125
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/l;->u0(Landroidx/compose/ui/layout/l;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LI0/C;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    return-object v0

    .line 130
    :cond_2
    invoke-static/range {p3 .. p4}, Li1/b;->n(J)I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    invoke-static/range {p3 .. p4}, Li1/b;->m(J)I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    sget-object v5, Landroidx/compose/ui/layout/x$a;->a:Landroidx/compose/ui/layout/x$a;

    .line 139
    .line 140
    const/4 v6, 0x4

    .line 141
    const/4 v7, 0x0

    .line 142
    const/4 v4, 0x0

    .line 143
    move-object/from16 v1, p1

    .line 144
    .line 145
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/l;->u0(Landroidx/compose/ui/layout/l;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LI0/C;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    return-object v0
.end method
