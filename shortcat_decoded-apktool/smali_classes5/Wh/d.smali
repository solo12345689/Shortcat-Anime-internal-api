.class public LWh/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LWh/h;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(LWh/i;)LWh/j;
    .locals 6

    .line 1
    invoke-interface {p1}, LWh/i;->a()LWh/m;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, LWh/m;->o()LWh/l;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/16 v1, 0x60

    .line 10
    .line 11
    invoke-virtual {p1, v1}, LWh/m;->g(C)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {p1}, LWh/m;->o()LWh/l;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    :cond_0
    invoke-virtual {p1, v1}, LWh/m;->b(C)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-lez v4, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1}, LWh/m;->o()LWh/l;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {p1, v1}, LWh/m;->g(C)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-ne v5, v2, :cond_0

    .line 34
    .line 35
    new-instance v0, LYh/d;

    .line 36
    .line 37
    invoke-direct {v0}, LYh/d;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v3, v4}, LWh/m;->d(LWh/l;LWh/l;)LZh/g;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, LZh/g;->c()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const/16 v2, 0xa

    .line 49
    .line 50
    const/16 v3, 0x20

    .line 51
    .line 52
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    const/4 v4, 0x3

    .line 61
    if-lt v2, v4, :cond_1

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-ne v2, v3, :cond_1

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    const/4 v4, 0x1

    .line 75
    sub-int/2addr v2, v4

    .line 76
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-ne v2, v3, :cond_1

    .line 81
    .line 82
    invoke-static {v1}, LXh/f;->e(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_1

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    sub-int/2addr v2, v4

    .line 93
    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    :cond_1
    invoke-virtual {v0, v1}, LYh/d;->o(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, LWh/m;->o()LWh/l;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {v0, p1}, LWh/j;->b(LYh/s;LWh/l;)LWh/j;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    return-object p1

    .line 109
    :cond_2
    invoke-virtual {p1, v0, v3}, LWh/m;->d(LWh/l;LWh/l;)LZh/g;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    new-instance v0, LYh/A;

    .line 114
    .line 115
    invoke-virtual {p1}, LZh/g;->c()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-direct {v0, p1}, LYh/A;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-static {v0, v3}, LWh/j;->b(LYh/s;LWh/l;)LWh/j;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    return-object p1
.end method
