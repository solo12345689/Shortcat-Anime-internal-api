.class Lq5/g$E;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq5/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "E"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq5/g$E$e;,
        Lq5/g$E$i;,
        Lq5/g$E$h;,
        Lq5/g$E$g;,
        Lq5/g$E$f;,
        Lq5/g$E$b;,
        Lq5/g$E$d;,
        Lq5/g$E$c;,
        Lq5/g$E$a;
    }
.end annotation


# instance fields
.field A:Ljava/lang/Boolean;

.field B:Ljava/lang/Boolean;

.field C:Lq5/g$O;

.field D:Ljava/lang/Float;

.field E:Ljava/lang/String;

.field F:Lq5/g$E$a;

.field G:Ljava/lang/String;

.field H:Lq5/g$O;

.field I:Ljava/lang/Float;

.field X:Lq5/g$O;

.field Y:Ljava/lang/Float;

.field Z:Lq5/g$E$i;

.field a:J

.field b:Lq5/g$O;

.field c:Lq5/g$E$a;

.field d:Ljava/lang/Float;

.field e:Lq5/g$O;

.field f:Ljava/lang/Float;

.field g:Lq5/g$p;

.field h:Lq5/g$E$c;

.field i:Lq5/g$E$d;

.field j:Ljava/lang/Float;

.field k:[Lq5/g$p;

.field l:Lq5/g$p;

.field l0:Lq5/g$E$e;

.field m:Ljava/lang/Float;

.field n:Lq5/g$f;

.field o:Ljava/util/List;

.field p:Lq5/g$p;

.field q:Ljava/lang/Integer;

.field r:Lq5/g$E$b;

.field s:Lq5/g$E$g;

.field t:Lq5/g$E$h;

.field u:Lq5/g$E$f;

.field v:Ljava/lang/Boolean;

.field w:Lq5/g$c;

.field x:Ljava/lang/String;

.field y:Ljava/lang/String;

.field z:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lq5/g$E;->a:J

    .line 7
    .line 8
    return-void
.end method

.method static a()Lq5/g$E;
    .locals 8

    .line 1
    new-instance v0, Lq5/g$E;

    .line 2
    .line 3
    invoke-direct {v0}, Lq5/g$E;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, -0x1

    .line 7
    .line 8
    iput-wide v1, v0, Lq5/g$E;->a:J

    .line 9
    .line 10
    sget-object v1, Lq5/g$f;->b:Lq5/g$f;

    .line 11
    .line 12
    iput-object v1, v0, Lq5/g$E;->b:Lq5/g$O;

    .line 13
    .line 14
    sget-object v2, Lq5/g$E$a;->a:Lq5/g$E$a;

    .line 15
    .line 16
    iput-object v2, v0, Lq5/g$E;->c:Lq5/g$E$a;

    .line 17
    .line 18
    const/high16 v3, 0x3f800000    # 1.0f

    .line 19
    .line 20
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    iput-object v4, v0, Lq5/g$E;->d:Ljava/lang/Float;

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    iput-object v5, v0, Lq5/g$E;->e:Lq5/g$O;

    .line 28
    .line 29
    iput-object v4, v0, Lq5/g$E;->f:Ljava/lang/Float;

    .line 30
    .line 31
    new-instance v6, Lq5/g$p;

    .line 32
    .line 33
    invoke-direct {v6, v3}, Lq5/g$p;-><init>(F)V

    .line 34
    .line 35
    .line 36
    iput-object v6, v0, Lq5/g$E;->g:Lq5/g$p;

    .line 37
    .line 38
    sget-object v3, Lq5/g$E$c;->a:Lq5/g$E$c;

    .line 39
    .line 40
    iput-object v3, v0, Lq5/g$E;->h:Lq5/g$E$c;

    .line 41
    .line 42
    sget-object v3, Lq5/g$E$d;->a:Lq5/g$E$d;

    .line 43
    .line 44
    iput-object v3, v0, Lq5/g$E;->i:Lq5/g$E$d;

    .line 45
    .line 46
    const/high16 v3, 0x40800000    # 4.0f

    .line 47
    .line 48
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    iput-object v3, v0, Lq5/g$E;->j:Ljava/lang/Float;

    .line 53
    .line 54
    iput-object v5, v0, Lq5/g$E;->k:[Lq5/g$p;

    .line 55
    .line 56
    new-instance v3, Lq5/g$p;

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    invoke-direct {v3, v6}, Lq5/g$p;-><init>(F)V

    .line 60
    .line 61
    .line 62
    iput-object v3, v0, Lq5/g$E;->l:Lq5/g$p;

    .line 63
    .line 64
    iput-object v4, v0, Lq5/g$E;->m:Ljava/lang/Float;

    .line 65
    .line 66
    iput-object v1, v0, Lq5/g$E;->n:Lq5/g$f;

    .line 67
    .line 68
    iput-object v5, v0, Lq5/g$E;->o:Ljava/util/List;

    .line 69
    .line 70
    new-instance v3, Lq5/g$p;

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    sget-object v7, Lq5/g$d0;->g:Lq5/g$d0;

    .line 75
    .line 76
    invoke-direct {v3, v6, v7}, Lq5/g$p;-><init>(FLq5/g$d0;)V

    .line 77
    .line 78
    .line 79
    iput-object v3, v0, Lq5/g$E;->p:Lq5/g$p;

    .line 80
    .line 81
    const/16 v3, 0x190

    .line 82
    .line 83
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    iput-object v3, v0, Lq5/g$E;->q:Ljava/lang/Integer;

    .line 88
    .line 89
    sget-object v3, Lq5/g$E$b;->a:Lq5/g$E$b;

    .line 90
    .line 91
    iput-object v3, v0, Lq5/g$E;->r:Lq5/g$E$b;

    .line 92
    .line 93
    sget-object v3, Lq5/g$E$g;->a:Lq5/g$E$g;

    .line 94
    .line 95
    iput-object v3, v0, Lq5/g$E;->s:Lq5/g$E$g;

    .line 96
    .line 97
    sget-object v3, Lq5/g$E$h;->a:Lq5/g$E$h;

    .line 98
    .line 99
    iput-object v3, v0, Lq5/g$E;->t:Lq5/g$E$h;

    .line 100
    .line 101
    sget-object v3, Lq5/g$E$f;->a:Lq5/g$E$f;

    .line 102
    .line 103
    iput-object v3, v0, Lq5/g$E;->u:Lq5/g$E$f;

    .line 104
    .line 105
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 106
    .line 107
    iput-object v3, v0, Lq5/g$E;->v:Ljava/lang/Boolean;

    .line 108
    .line 109
    iput-object v5, v0, Lq5/g$E;->w:Lq5/g$c;

    .line 110
    .line 111
    iput-object v5, v0, Lq5/g$E;->x:Ljava/lang/String;

    .line 112
    .line 113
    iput-object v5, v0, Lq5/g$E;->y:Ljava/lang/String;

    .line 114
    .line 115
    iput-object v5, v0, Lq5/g$E;->z:Ljava/lang/String;

    .line 116
    .line 117
    iput-object v3, v0, Lq5/g$E;->A:Ljava/lang/Boolean;

    .line 118
    .line 119
    iput-object v3, v0, Lq5/g$E;->B:Ljava/lang/Boolean;

    .line 120
    .line 121
    iput-object v1, v0, Lq5/g$E;->C:Lq5/g$O;

    .line 122
    .line 123
    iput-object v4, v0, Lq5/g$E;->D:Ljava/lang/Float;

    .line 124
    .line 125
    iput-object v5, v0, Lq5/g$E;->E:Ljava/lang/String;

    .line 126
    .line 127
    iput-object v2, v0, Lq5/g$E;->F:Lq5/g$E$a;

    .line 128
    .line 129
    iput-object v5, v0, Lq5/g$E;->G:Ljava/lang/String;

    .line 130
    .line 131
    iput-object v5, v0, Lq5/g$E;->H:Lq5/g$O;

    .line 132
    .line 133
    iput-object v4, v0, Lq5/g$E;->I:Ljava/lang/Float;

    .line 134
    .line 135
    iput-object v5, v0, Lq5/g$E;->X:Lq5/g$O;

    .line 136
    .line 137
    iput-object v4, v0, Lq5/g$E;->Y:Ljava/lang/Float;

    .line 138
    .line 139
    sget-object v1, Lq5/g$E$i;->a:Lq5/g$E$i;

    .line 140
    .line 141
    iput-object v1, v0, Lq5/g$E;->Z:Lq5/g$E$i;

    .line 142
    .line 143
    sget-object v1, Lq5/g$E$e;->a:Lq5/g$E$e;

    .line 144
    .line 145
    iput-object v1, v0, Lq5/g$E;->l0:Lq5/g$E$e;

    .line 146
    .line 147
    return-object v0
.end method


# virtual methods
.method c(Z)V
    .locals 2

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 8
    .line 9
    iput-object v1, p0, Lq5/g$E;->A:Ljava/lang/Boolean;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 15
    .line 16
    :goto_0
    iput-object v1, p0, Lq5/g$E;->v:Ljava/lang/Boolean;

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput-object p1, p0, Lq5/g$E;->w:Lq5/g$c;

    .line 20
    .line 21
    iput-object p1, p0, Lq5/g$E;->E:Ljava/lang/String;

    .line 22
    .line 23
    iput-object v0, p0, Lq5/g$E;->m:Ljava/lang/Float;

    .line 24
    .line 25
    sget-object v1, Lq5/g$f;->b:Lq5/g$f;

    .line 26
    .line 27
    iput-object v1, p0, Lq5/g$E;->C:Lq5/g$O;

    .line 28
    .line 29
    iput-object v0, p0, Lq5/g$E;->D:Ljava/lang/Float;

    .line 30
    .line 31
    iput-object p1, p0, Lq5/g$E;->G:Ljava/lang/String;

    .line 32
    .line 33
    iput-object p1, p0, Lq5/g$E;->H:Lq5/g$O;

    .line 34
    .line 35
    iput-object v0, p0, Lq5/g$E;->I:Ljava/lang/Float;

    .line 36
    .line 37
    iput-object p1, p0, Lq5/g$E;->X:Lq5/g$O;

    .line 38
    .line 39
    iput-object v0, p0, Lq5/g$E;->Y:Ljava/lang/Float;

    .line 40
    .line 41
    sget-object p1, Lq5/g$E$i;->a:Lq5/g$E$i;

    .line 42
    .line 43
    iput-object p1, p0, Lq5/g$E;->Z:Lq5/g$E$i;

    .line 44
    .line 45
    return-void
.end method

.method protected clone()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lq5/g$E;

    .line 6
    .line 7
    iget-object v1, p0, Lq5/g$E;->k:[Lq5/g$p;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, [Lq5/g$p;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, [Lq5/g$p;

    .line 16
    .line 17
    iput-object v1, v0, Lq5/g$E;->k:[Lq5/g$p;

    .line 18
    .line 19
    :cond_0
    return-object v0
.end method
