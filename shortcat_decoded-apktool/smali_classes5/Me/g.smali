.class public final LMe/g;
.super Lqf/F;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LMe/g$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lqf/F;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lye/m0;Lqf/G;Lqf/A0;Lqf/S;)Lqf/B0;
    .locals 1

    .line 1
    const-string v0, "parameter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "typeAttr"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "typeParameterUpperBoundEraser"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "erasedUpperBound"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    instance-of v0, p2, LMe/a;

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    invoke-super {p0, p1, p2, p3, p4}, Lqf/F;->a(Lye/m0;Lqf/G;Lqf/A0;Lqf/S;)Lqf/B0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_0
    check-cast p2, LMe/a;

    .line 31
    .line 32
    invoke-virtual {p2}, LMe/a;->i()Z

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    if-eqz p3, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    sget-object p3, LMe/c;->a:LMe/c;

    .line 40
    .line 41
    invoke-virtual {p2, p3}, LMe/a;->l(LMe/c;)LMe/a;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    :goto_0
    invoke-virtual {p2}, LMe/a;->g()LMe/c;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    sget-object v0, LMe/g$a;->a:[I

    .line 50
    .line 51
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    aget p3, v0, p3

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    if-eq p3, v0, :cond_6

    .line 59
    .line 60
    const/4 v0, 0x2

    .line 61
    if-eq p3, v0, :cond_3

    .line 62
    .line 63
    const/4 v0, 0x3

    .line 64
    if-ne p3, v0, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    new-instance p1, LTd/r;

    .line 68
    .line 69
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 70
    .line 71
    .line 72
    throw p1

    .line 73
    :cond_3
    :goto_1
    invoke-interface {p1}, Lye/m0;->m()Lqf/N0;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    invoke-virtual {p3}, Lqf/N0;->b()Z

    .line 78
    .line 79
    .line 80
    move-result p3

    .line 81
    if-nez p3, :cond_4

    .line 82
    .line 83
    new-instance p2, Lqf/D0;

    .line 84
    .line 85
    sget-object p3, Lqf/N0;->e:Lqf/N0;

    .line 86
    .line 87
    invoke-static {p1}, Lff/e;->m(Lye/m;)Lve/i;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Lve/i;->I()Lqf/d0;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-direct {p2, p3, p1}, Lqf/D0;-><init>(Lqf/N0;Lqf/S;)V

    .line 96
    .line 97
    .line 98
    return-object p2

    .line 99
    :cond_4
    invoke-virtual {p4}, Lqf/S;->N0()Lqf/v0;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    invoke-interface {p3}, Lqf/v0;->getParameters()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    const-string v0, "getParameters(...)"

    .line 108
    .line 109
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result p3

    .line 116
    if-nez p3, :cond_5

    .line 117
    .line 118
    new-instance p1, Lqf/D0;

    .line 119
    .line 120
    sget-object p2, Lqf/N0;->g:Lqf/N0;

    .line 121
    .line 122
    invoke-direct {p1, p2, p4}, Lqf/D0;-><init>(Lqf/N0;Lqf/S;)V

    .line 123
    .line 124
    .line 125
    return-object p1

    .line 126
    :cond_5
    invoke-static {p1, p2}, Lqf/J0;->t(Lye/m0;Lqf/G;)Lqf/B0;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    return-object p1

    .line 134
    :cond_6
    new-instance p1, Lqf/D0;

    .line 135
    .line 136
    sget-object p2, Lqf/N0;->e:Lqf/N0;

    .line 137
    .line 138
    invoke-direct {p1, p2, p4}, Lqf/D0;-><init>(Lqf/N0;Lqf/S;)V

    .line 139
    .line 140
    .line 141
    return-object p1
.end method
