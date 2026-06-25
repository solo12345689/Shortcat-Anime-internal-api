.class final LF/D;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lh0/p;
.implements Lh0/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF/D$b;
    }
.end annotation


# static fields
.field public static final d:LF/D$b;


# instance fields
.field private final a:Lh0/p;

.field private final b:LY/C0;

.field private final c:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LF/D$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LF/D$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LF/D;->d:LF/D$b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lh0/p;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LF/D;->a:Lh0/p;

    const/4 p1, 0x0

    const/4 v0, 0x2

    .line 3
    invoke-static {p1, p1, v0, p1}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object p1

    iput-object p1, p0, LF/D;->b:LY/C0;

    .line 4
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, LF/D;->c:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lh0/p;Ljava/util/Map;)V
    .locals 1

    .line 5
    new-instance v0, LF/D$a;

    invoke-direct {v0, p1}, LF/D$a;-><init>(Lh0/p;)V

    invoke-static {p2, v0}, Lh0/s;->c(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Lh0/p;

    move-result-object p1

    .line 6
    invoke-direct {p0, p1}, LF/D;-><init>(Lh0/p;)V

    return-void
.end method

.method public static final synthetic g(LF/D;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, LF/D;->c:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LF/D;->a:Lh0/p;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lh0/p;->a(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LF/D;->h()Lh0/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lh0/g;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    const-string v0, "null wrappedHolder"

    .line 14
    .line 15
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1
.end method

.method public c(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)V
    .locals 4

    .line 1
    const v0, -0x298e20f1

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    and-int/lit8 v1, p4, 0x6

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p3, p1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x2

    .line 21
    :goto_0
    or-int/2addr v1, p4

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v1, p4

    .line 24
    :goto_1
    and-int/lit8 v2, p4, 0x30

    .line 25
    .line 26
    if-nez v2, :cond_3

    .line 27
    .line 28
    invoke-interface {p3, p2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    const/16 v2, 0x20

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v2, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr v1, v2

    .line 40
    :cond_3
    and-int/lit16 v2, p4, 0x180

    .line 41
    .line 42
    if-nez v2, :cond_5

    .line 43
    .line 44
    invoke-interface {p3, p0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_4

    .line 49
    .line 50
    const/16 v2, 0x100

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    const/16 v2, 0x80

    .line 54
    .line 55
    :goto_3
    or-int/2addr v1, v2

    .line 56
    :cond_5
    and-int/lit16 v2, v1, 0x93

    .line 57
    .line 58
    const/16 v3, 0x92

    .line 59
    .line 60
    if-ne v2, v3, :cond_7

    .line 61
    .line 62
    invoke-interface {p3}, LY/m;->i()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_6

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_6
    invoke-interface {p3}, LY/m;->K()V

    .line 70
    .line 71
    .line 72
    goto :goto_5

    .line 73
    :cond_7
    :goto_4
    invoke-static {}, LY/w;->L()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_8

    .line 78
    .line 79
    const/4 v2, -0x1

    .line 80
    const-string v3, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)"

    .line 81
    .line 82
    invoke-static {v0, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_8
    invoke-virtual {p0}, LF/D;->h()Lh0/g;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-eqz v0, :cond_d

    .line 90
    .line 91
    and-int/lit8 v2, v1, 0xe

    .line 92
    .line 93
    and-int/lit8 v1, v1, 0x7e

    .line 94
    .line 95
    invoke-interface {v0, p1, p2, p3, v1}, Lh0/g;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 96
    .line 97
    .line 98
    invoke-interface {p3, p0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    invoke-interface {p3, p1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    or-int/2addr v0, v1

    .line 107
    invoke-interface {p3}, LY/m;->D()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    if-nez v0, :cond_9

    .line 112
    .line 113
    sget-object v0, LY/m;->a:LY/m$a;

    .line 114
    .line 115
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    if-ne v1, v0, :cond_a

    .line 120
    .line 121
    :cond_9
    new-instance v1, LF/D$c;

    .line 122
    .line 123
    invoke-direct {v1, p0, p1}, LF/D$c;-><init>(LF/D;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-interface {p3, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_a
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 130
    .line 131
    invoke-static {p1, v1, p3, v2}, LY/b0;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LY/m;I)V

    .line 132
    .line 133
    .line 134
    invoke-static {}, LY/w;->L()Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_b

    .line 139
    .line 140
    invoke-static {}, LY/w;->T()V

    .line 141
    .line 142
    .line 143
    :cond_b
    :goto_5
    invoke-interface {p3}, LY/m;->k()LY/B1;

    .line 144
    .line 145
    .line 146
    move-result-object p3

    .line 147
    if-eqz p3, :cond_c

    .line 148
    .line 149
    new-instance v0, LF/D$d;

    .line 150
    .line 151
    invoke-direct {v0, p0, p1, p2, p4}, LF/D$d;-><init>(LF/D;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;I)V

    .line 152
    .line 153
    .line 154
    invoke-interface {p3, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 155
    .line 156
    .line 157
    :cond_c
    return-void

    .line 158
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 159
    .line 160
    const-string p2, "null wrappedHolder"

    .line 161
    .line 162
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw p1
.end method

.method public d()Ljava/util/Map;
    .locals 3

    .line 1
    invoke-virtual {p0}, LF/D;->h()Lh0/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, LF/D;->c:Ljava/util/Set;

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Iterable;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v0, v2}, Lh0/g;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, p0, LF/D;->a:Lh0/p;

    .line 30
    .line 31
    invoke-interface {v0}, Lh0/p;->d()Ljava/util/Map;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method

.method public e(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LF/D;->a:Lh0/p;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lh0/p;->e(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public f(Ljava/lang/String;Lie/a;)Lh0/p$a;
    .locals 1

    .line 1
    iget-object v0, p0, LF/D;->a:Lh0/p;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lh0/p;->f(Ljava/lang/String;Lie/a;)Lh0/p$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final h()Lh0/g;
    .locals 1

    .line 1
    iget-object v0, p0, LF/D;->b:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lh0/g;

    .line 8
    .line 9
    return-object v0
.end method

.method public final i(Lh0/g;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF/D;->b:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
