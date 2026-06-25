.class final Lr8/e;
.super Lr8/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr8/e$b;
    }
.end annotation


# instance fields
.field private a:Ljavax/inject/Provider;

.field private b:Ljavax/inject/Provider;

.field private c:Ljavax/inject/Provider;

.field private d:Ljavax/inject/Provider;

.field private e:Ljavax/inject/Provider;

.field private f:Ljavax/inject/Provider;

.field private g:Ljavax/inject/Provider;

.field private h:Ljavax/inject/Provider;

.field private i:Ljavax/inject/Provider;

.field private j:Ljavax/inject/Provider;

.field private k:Ljavax/inject/Provider;

.field private l:Ljavax/inject/Provider;

.field private m:Ljavax/inject/Provider;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lr8/u;-><init>()V

    .line 3
    invoke-direct {p0, p1}, Lr8/e;->h(Landroid/content/Context;)V

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lr8/e$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lr8/e;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static g()Lr8/u$a;
    .locals 2

    .line 1
    new-instance v0, Lr8/e$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lr8/e$b;-><init>(Lr8/e$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method private h(Landroid/content/Context;)V
    .locals 9

    .line 1
    invoke-static {}, Lr8/k;->a()Lr8/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lt8/a;->a(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lr8/e;->a:Ljavax/inject/Provider;

    .line 10
    .line 11
    invoke-static {p1}, Lt8/c;->a(Ljava/lang/Object;)Lt8/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lr8/e;->b:Ljavax/inject/Provider;

    .line 16
    .line 17
    invoke-static {}, LB8/c;->a()LB8/c;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {}, LB8/d;->a()LB8/d;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {p1, v0, v1}, Ls8/j;->a(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ls8/j;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lr8/e;->c:Ljavax/inject/Provider;

    .line 30
    .line 31
    iget-object v0, p0, Lr8/e;->b:Ljavax/inject/Provider;

    .line 32
    .line 33
    invoke-static {v0, p1}, Ls8/l;->a(Ljavax/inject/Provider;Ljavax/inject/Provider;)Ls8/l;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, Lt8/a;->a(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lr8/e;->d:Ljavax/inject/Provider;

    .line 42
    .line 43
    iget-object p1, p0, Lr8/e;->b:Ljavax/inject/Provider;

    .line 44
    .line 45
    invoke-static {}, Lz8/g;->a()Lz8/g;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {}, Lz8/i;->a()Lz8/i;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {p1, v0, v1}, Lz8/V;->a(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lz8/V;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, Lr8/e;->e:Ljavax/inject/Provider;

    .line 58
    .line 59
    iget-object p1, p0, Lr8/e;->b:Ljavax/inject/Provider;

    .line 60
    .line 61
    invoke-static {p1}, Lz8/h;->a(Ljavax/inject/Provider;)Lz8/h;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p1}, Lt8/a;->a(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, Lr8/e;->f:Ljavax/inject/Provider;

    .line 70
    .line 71
    invoke-static {}, LB8/c;->a()LB8/c;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {}, LB8/d;->a()LB8/d;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {}, Lz8/j;->a()Lz8/j;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iget-object v2, p0, Lr8/e;->e:Ljavax/inject/Provider;

    .line 84
    .line 85
    iget-object v3, p0, Lr8/e;->f:Ljavax/inject/Provider;

    .line 86
    .line 87
    invoke-static {p1, v0, v1, v2, v3}, Lz8/N;->a(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lz8/N;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {p1}, Lt8/a;->a(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iput-object p1, p0, Lr8/e;->g:Ljavax/inject/Provider;

    .line 96
    .line 97
    invoke-static {}, LB8/c;->a()LB8/c;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {p1}, Lx8/g;->b(Ljavax/inject/Provider;)Lx8/g;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iput-object p1, p0, Lr8/e;->h:Ljavax/inject/Provider;

    .line 106
    .line 107
    iget-object v0, p0, Lr8/e;->b:Ljavax/inject/Provider;

    .line 108
    .line 109
    iget-object v1, p0, Lr8/e;->g:Ljavax/inject/Provider;

    .line 110
    .line 111
    invoke-static {}, LB8/d;->a()LB8/d;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-static {v0, v1, p1, v2}, Lx8/i;->a(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lx8/i;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    iput-object p1, p0, Lr8/e;->i:Ljavax/inject/Provider;

    .line 120
    .line 121
    iget-object v0, p0, Lr8/e;->a:Ljavax/inject/Provider;

    .line 122
    .line 123
    iget-object v1, p0, Lr8/e;->d:Ljavax/inject/Provider;

    .line 124
    .line 125
    iget-object v2, p0, Lr8/e;->g:Ljavax/inject/Provider;

    .line 126
    .line 127
    invoke-static {v0, v1, p1, v2, v2}, Lx8/d;->a(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lx8/d;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    iput-object p1, p0, Lr8/e;->j:Ljavax/inject/Provider;

    .line 132
    .line 133
    iget-object v0, p0, Lr8/e;->b:Ljavax/inject/Provider;

    .line 134
    .line 135
    iget-object v1, p0, Lr8/e;->d:Ljavax/inject/Provider;

    .line 136
    .line 137
    iget-object v2, p0, Lr8/e;->g:Ljavax/inject/Provider;

    .line 138
    .line 139
    iget-object v3, p0, Lr8/e;->i:Ljavax/inject/Provider;

    .line 140
    .line 141
    iget-object v4, p0, Lr8/e;->a:Ljavax/inject/Provider;

    .line 142
    .line 143
    invoke-static {}, LB8/c;->a()LB8/c;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    invoke-static {}, LB8/d;->a()LB8/d;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    iget-object v8, p0, Lr8/e;->g:Ljavax/inject/Provider;

    .line 152
    .line 153
    move-object v5, v2

    .line 154
    invoke-static/range {v0 .. v8}, Ly8/s;->a(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ly8/s;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    iput-object p1, p0, Lr8/e;->k:Ljavax/inject/Provider;

    .line 159
    .line 160
    iget-object p1, p0, Lr8/e;->a:Ljavax/inject/Provider;

    .line 161
    .line 162
    iget-object v0, p0, Lr8/e;->g:Ljavax/inject/Provider;

    .line 163
    .line 164
    iget-object v1, p0, Lr8/e;->i:Ljavax/inject/Provider;

    .line 165
    .line 166
    invoke-static {p1, v0, v1, v0}, Ly8/w;->a(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ly8/w;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    iput-object p1, p0, Lr8/e;->l:Ljavax/inject/Provider;

    .line 171
    .line 172
    invoke-static {}, LB8/c;->a()LB8/c;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-static {}, LB8/d;->a()LB8/d;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    iget-object v1, p0, Lr8/e;->j:Ljavax/inject/Provider;

    .line 181
    .line 182
    iget-object v2, p0, Lr8/e;->k:Ljavax/inject/Provider;

    .line 183
    .line 184
    iget-object v3, p0, Lr8/e;->l:Ljavax/inject/Provider;

    .line 185
    .line 186
    invoke-static {p1, v0, v1, v2, v3}, Lr8/v;->a(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lr8/v;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-static {p1}, Lt8/a;->a(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    iput-object p1, p0, Lr8/e;->m:Ljavax/inject/Provider;

    .line 195
    .line 196
    return-void
.end method


# virtual methods
.method a()Lz8/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lr8/e;->g:Ljavax/inject/Provider;

    .line 2
    .line 3
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lz8/d;

    .line 8
    .line 9
    return-object v0
.end method

.method b()Lr8/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lr8/e;->m:Ljavax/inject/Provider;

    .line 2
    .line 3
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lr8/t;

    .line 8
    .line 9
    return-object v0
.end method
