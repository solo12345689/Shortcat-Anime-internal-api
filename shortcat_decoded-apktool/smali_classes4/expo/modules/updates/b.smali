.class public final Lexpo/modules/updates/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lexpo/modules/updates/c;
.implements LEd/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/updates/b$a;
    }
.end annotation


# static fields
.field public static final v:Lexpo/modules/updates/b$a;

.field private static final w:Ljava/lang/String;


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Lexpo/modules/updates/d;

.field private final c:Ljava/io/File;

.field private d:Ljava/lang/ref/WeakReference;

.field private final e:Lxd/g;

.field private final f:Lud/a;

.field private final g:LGf/O;

.field private final h:LCd/g;

.field private final i:Lpd/c;

.field private final j:LGf/x;

.field private final k:LPf/a;

.field private final l:LAd/d;

.field private m:Ljava/lang/ref/WeakReference;

.field private final n:Ljava/util/Map;

.field private o:Z

.field private p:Z

.field private q:Ljava/lang/Long;

.field private r:Ljava/lang/Long;

.field private final s:Lzd/h;

.field private final t:Z

.field private final u:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/updates/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/updates/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/updates/b;->v:Lexpo/modules/updates/b$a;

    .line 8
    .line 9
    const-class v0, Lexpo/modules/updates/b;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lexpo/modules/updates/b;->w:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lexpo/modules/updates/d;Ljava/io/File;)V
    .locals 11

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "updatesConfiguration"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "updatesDirectory"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lexpo/modules/updates/b;->a:Landroid/content/Context;

    .line 20
    .line 21
    iput-object p2, p0, Lexpo/modules/updates/b;->b:Lexpo/modules/updates/d;

    .line 22
    .line 23
    iput-object p3, p0, Lexpo/modules/updates/b;->c:Ljava/io/File;

    .line 24
    .line 25
    new-instance v8, Lxd/g;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    const-string p3, "getFilesDir(...)"

    .line 32
    .line 33
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v8, p2}, Lxd/g;-><init>(Ljava/io/File;)V

    .line 37
    .line 38
    .line 39
    iput-object v8, p0, Lexpo/modules/updates/b;->e:Lxd/g;

    .line 40
    .line 41
    new-instance p2, Lud/c;

    .line 42
    .line 43
    invoke-direct {p2, v8}, Lud/c;-><init>(Lxd/g;)V

    .line 44
    .line 45
    .line 46
    iput-object p2, p0, Lexpo/modules/updates/b;->f:Lud/a;

    .line 47
    .line 48
    const/4 p2, 0x0

    .line 49
    const/4 p3, 0x1

    .line 50
    invoke-static {p2, p3, p2}, LGf/X0;->b(LGf/C0;ILjava/lang/Object;)LGf/A;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {}, LGf/f0;->b()LGf/K;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v0, v1}, LZd/i;->w(LZd/i;)LZd/i;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0}, LGf/P;->a(LZd/i;)LGf/O;

    .line 63
    .line 64
    .line 65
    move-result-object v10

    .line 66
    iput-object v10, p0, Lexpo/modules/updates/b;->g:LGf/O;

    .line 67
    .line 68
    new-instance v0, LCd/g;

    .line 69
    .line 70
    invoke-virtual {p0}, Lexpo/modules/updates/b;->d()Lud/a;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {}, LCd/h;->b()Lkotlin/enums/EnumEntries;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-static {v2}, LUd/u;->f1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-direct {v0, v8, v1, v2, v10}, LCd/g;-><init>(Lxd/g;Lud/a;Ljava/util/Set;LGf/O;)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, Lexpo/modules/updates/b;->h:LCd/g;

    .line 86
    .line 87
    new-instance v4, Lpd/c;

    .line 88
    .line 89
    sget-object v0, Lexpo/modules/updates/db/UpdatesDatabase;->p:Lexpo/modules/updates/db/UpdatesDatabase$j;

    .line 90
    .line 91
    invoke-static {}, LGf/f0;->b()LGf/K;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v0, p1, v1}, Lexpo/modules/updates/db/UpdatesDatabase$j;->c(Landroid/content/Context;LGf/K;)Lexpo/modules/updates/db/UpdatesDatabase;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-direct {v4, v0}, Lpd/c;-><init>(Lexpo/modules/updates/db/UpdatesDatabase;)V

    .line 100
    .line 101
    .line 102
    iput-object v4, p0, Lexpo/modules/updates/b;->i:Lpd/c;

    .line 103
    .line 104
    invoke-static {p2, p3, p2}, LGf/z;->b(LGf/C0;ILjava/lang/Object;)LGf/x;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iput-object v0, p0, Lexpo/modules/updates/b;->j:LGf/x;

    .line 109
    .line 110
    const/4 v0, 0x0

    .line 111
    invoke-static {v0, p3, p2}, LPf/g;->b(ZILjava/lang/Object;)LPf/a;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iput-object v0, p0, Lexpo/modules/updates/b;->k:LPf/a;

    .line 116
    .line 117
    new-instance v0, LAd/d;

    .line 118
    .line 119
    invoke-direct {v0}, LAd/d;-><init>()V

    .line 120
    .line 121
    .line 122
    iput-object v0, p0, Lexpo/modules/updates/b;->l:LAd/d;

    .line 123
    .line 124
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 125
    .line 126
    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iput-object v0, p0, Lexpo/modules/updates/b;->m:Ljava/lang/ref/WeakReference;

    .line 130
    .line 131
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 132
    .line 133
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 134
    .line 135
    .line 136
    iput-object p2, p0, Lexpo/modules/updates/b;->n:Ljava/util/Map;

    .line 137
    .line 138
    new-instance v1, Lzd/h;

    .line 139
    .line 140
    iget-object v3, p0, Lexpo/modules/updates/b;->b:Lexpo/modules/updates/d;

    .line 141
    .line 142
    invoke-virtual {p0}, Lexpo/modules/updates/b;->P()Ljava/io/File;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    invoke-direct {p0}, Lexpo/modules/updates/b;->J()Lwd/g;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-direct {p0}, Lexpo/modules/updates/b;->N()LBd/h;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    new-instance v9, Lexpo/modules/updates/b$j;

    .line 155
    .line 156
    invoke-direct {v9, p0}, Lexpo/modules/updates/b$j;-><init>(Lexpo/modules/updates/b;)V

    .line 157
    .line 158
    .line 159
    move-object v2, p1

    .line 160
    invoke-direct/range {v1 .. v10}, Lzd/h;-><init>(Landroid/content/Context;Lexpo/modules/updates/d;Lpd/c;Ljava/io/File;Lwd/g;LBd/h;Lxd/g;Lzd/h$a;LGf/O;)V

    .line 161
    .line 162
    .line 163
    iput-object v1, p0, Lexpo/modules/updates/b;->s:Lzd/h;

    .line 164
    .line 165
    iput-boolean p3, p0, Lexpo/modules/updates/b;->t:Z

    .line 166
    .line 167
    iput-boolean p3, p0, Lexpo/modules/updates/b;->u:Z

    .line 168
    .line 169
    return-void
.end method

.method public static final synthetic A(Lexpo/modules/updates/b;)Lxd/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/updates/b;->e:Lxd/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic B(Lexpo/modules/updates/b;)LBd/h;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/updates/b;->N()LBd/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic C(Lexpo/modules/updates/b;)LGf/x;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/updates/b;->j:LGf/x;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic D(Lexpo/modules/updates/b;)LPf/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/updates/b;->k:LPf/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic E(Lexpo/modules/updates/b;)LCd/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/updates/b;->h:LCd/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic F(Lexpo/modules/updates/b;)Lexpo/modules/updates/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/updates/b;->b:Lexpo/modules/updates/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic G(Lexpo/modules/updates/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/updates/b;->R()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic H(Lexpo/modules/updates/b;ZLvd/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lexpo/modules/updates/b;->U(ZLvd/b$a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final I()Lrd/d;
    .locals 3

    .line 1
    sget-object v0, Lyd/a;->a:Lyd/a;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/updates/b;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/updates/b;->b:Lexpo/modules/updates/d;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lyd/a;->b(Landroid/content/Context;Lexpo/modules/updates/d;)Lyd/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lyd/d;->c()Lrd/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return-object v0
.end method

.method private final J()Lwd/g;
    .locals 6

    .line 1
    new-instance v0, Lwd/g;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/updates/b;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "getFilesDir(...)"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v2, LAb/b;

    .line 15
    .line 16
    iget-object v3, p0, Lexpo/modules/updates/b;->a:Landroid/content/Context;

    .line 17
    .line 18
    invoke-direct {v2, v3}, LAb/b;-><init>(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, LAb/b;->b()Ljava/util/UUID;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "toString(...)"

    .line 30
    .line 31
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v3, p0, Lexpo/modules/updates/b;->b:Lexpo/modules/updates/d;

    .line 35
    .line 36
    iget-object v4, p0, Lexpo/modules/updates/b;->e:Lxd/g;

    .line 37
    .line 38
    iget-object v5, p0, Lexpo/modules/updates/b;->i:Lpd/c;

    .line 39
    .line 40
    invoke-virtual {v5}, Lpd/c;->c()Lexpo/modules/updates/db/UpdatesDatabase;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-direct/range {v0 .. v5}, Lwd/g;-><init>(Ljava/io/File;Ljava/lang/String;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;)V

    .line 45
    .line 46
    .line 47
    return-object v0
.end method

.method private final K()LEf/a;
    .locals 4

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/b;->q:Ljava/lang/Long;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    iget-object v0, p0, Lexpo/modules/updates/b;->r:Ljava/lang/Long;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    sub-long/2addr v0, v2

    .line 19
    sget-object v2, LEf/d;->d:LEf/d;

    .line 20
    .line 21
    invoke-static {v0, v1, v2}, LEf/c;->t(JLEf/d;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    invoke-static {v0, v1}, LEf/a;->k(J)LEf/a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :cond_0
    return-object v1
.end method

.method private final L()Lrd/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/b;->s:Lzd/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lzd/h;->x()Lrd/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private final M()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/b;->s:Lzd/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lzd/h;->z()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private final N()LBd/h;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/b;->b:Lexpo/modules/updates/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/updates/d;->q()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lexpo/modules/updates/b;->b:Lexpo/modules/updates/d;

    .line 8
    .line 9
    invoke-static {v0, v1}, LBd/i;->a(Ljava/lang/String;Lexpo/modules/updates/d;)LBd/h;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method private final Q()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/b;->s:Lzd/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lzd/h;->B()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method private final declared-synchronized R()V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lexpo/modules/updates/b;->g:LGf/O;

    .line 3
    .line 4
    new-instance v3, Lexpo/modules/updates/b$f;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v3, p0, v1}, Lexpo/modules/updates/b$f;-><init>(Lexpo/modules/updates/b;LZd/e;)V

    .line 8
    .line 9
    .line 10
    const/4 v4, 0x3

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lexpo/modules/updates/b;->p:Z

    .line 19
    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lexpo/modules/updates/b;->r:Ljava/lang/Long;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw v0
.end method

.method private final S()V
    .locals 4

    .line 1
    new-instance v0, Lxd/e;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/updates/b;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "getFilesDir(...)"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Lxd/e;-><init>(Ljava/io/File;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lnd/a;

    .line 18
    .line 19
    invoke-direct {v1, p0}, Lnd/a;-><init>(Lexpo/modules/updates/b;)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static {v0, v3, v1, v2, v3}, Lxd/e;->f(Lxd/e;Ljava/util/Date;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private static final T(Lexpo/modules/updates/b;Ljava/lang/Exception;)LTd/L;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lexpo/modules/updates/b;->e:Lxd/g;

    .line 4
    .line 5
    const-string v0, "UpdatesLogReader: error in purgeLogEntries"

    .line 6
    .line 7
    sget-object v1, Lxd/b;->l:Lxd/b;

    .line 8
    .line 9
    invoke-virtual {p0, v0, p1, v1}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    sget-object p0, LTd/L;->a:LTd/L;

    .line 13
    .line 14
    return-object p0
.end method

.method private final U(ZLvd/b$a;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lzd/f;

    .line 4
    .line 5
    iget-object v2, v0, Lexpo/modules/updates/b;->a:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v3, v0, Lexpo/modules/updates/b;->d:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    iget-object v4, v0, Lexpo/modules/updates/b;->b:Lexpo/modules/updates/d;

    .line 10
    .line 11
    iget-object v5, v0, Lexpo/modules/updates/b;->e:Lxd/g;

    .line 12
    .line 13
    iget-object v6, v0, Lexpo/modules/updates/b;->i:Lpd/c;

    .line 14
    .line 15
    invoke-virtual {v0}, Lexpo/modules/updates/b;->P()Ljava/io/File;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    invoke-direct {v0}, Lexpo/modules/updates/b;->J()Lwd/g;

    .line 20
    .line 21
    .line 22
    move-result-object v8

    .line 23
    invoke-direct {v0}, Lexpo/modules/updates/b;->N()LBd/h;

    .line 24
    .line 25
    .line 26
    move-result-object v9

    .line 27
    new-instance v10, Lnd/b;

    .line 28
    .line 29
    invoke-direct {v10, v0}, Lnd/b;-><init>(Lexpo/modules/updates/b;)V

    .line 30
    .line 31
    .line 32
    new-instance v11, Lnd/c;

    .line 33
    .line 34
    invoke-direct {v11, v0}, Lnd/c;-><init>(Lexpo/modules/updates/b;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lexpo/modules/updates/b;->k()LAd/d;

    .line 38
    .line 39
    .line 40
    move-result-object v13

    .line 41
    iget-object v15, v0, Lexpo/modules/updates/b;->g:LGf/O;

    .line 42
    .line 43
    move/from16 v12, p1

    .line 44
    .line 45
    move-object/from16 v14, p2

    .line 46
    .line 47
    invoke-direct/range {v1 .. v15}, Lzd/f;-><init>(Landroid/content/Context;Ljava/lang/ref/WeakReference;Lexpo/modules/updates/d;Lxd/g;Lpd/c;Ljava/io/File;Lwd/g;LBd/h;Lie/a;Lkotlin/jvm/functions/Function1;ZLAd/d;Lvd/b$a;LGf/O;)V

    .line 48
    .line 49
    .line 50
    iget-object v2, v0, Lexpo/modules/updates/b;->h:LCd/g;

    .line 51
    .line 52
    invoke-virtual {v2, v1}, LCd/g;->f(Lzd/j;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method private static final V(Lexpo/modules/updates/b;)Lvd/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/updates/b;->s:Lzd/h;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzd/h;->y()Lvd/b;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method private static final W(Lexpo/modules/updates/b;Lvd/b;)LTd/L;
    .locals 1

    .line 1
    const-string v0, "currentLauncher"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lexpo/modules/updates/b;->s:Lzd/h;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lzd/h;->F(Lvd/b;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, LTd/L;->a:LTd/L;

    .line 12
    .line 13
    return-object p0
.end method

.method public static synthetic s(Lexpo/modules/updates/b;)Lvd/b;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/updates/b;->V(Lexpo/modules/updates/b;)Lvd/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic t(Lexpo/modules/updates/b;Lvd/b;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/updates/b;->W(Lexpo/modules/updates/b;Lvd/b;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic u(Lexpo/modules/updates/b;Ljava/lang/Exception;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/updates/b;->T(Lexpo/modules/updates/b;Ljava/lang/Exception;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic v(Lexpo/modules/updates/b;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/updates/b;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic w(Lexpo/modules/updates/b;)LGf/O;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/updates/b;->g:LGf/O;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic x(Lexpo/modules/updates/b;)Lpd/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/updates/b;->i:Lpd/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic y(Lexpo/modules/updates/b;)Lwd/g;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/updates/b;->J()Lwd/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic z(Lexpo/modules/updates/b;)Lrd/d;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/updates/b;->L()Lrd/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final O()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/b;->n:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public P()Ljava/io/File;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/b;->c:Ljava/io/File;

    .line 2
    .line 3
    return-object v0
.end method

.method public a(Lc7/f;)V
    .locals 1

    .line 1
    const-string v0, "devSupportManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/updates/b;->s:Lzd/h;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lzd/h;->D(Lc7/f;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Lexpo/modules/updates/b$e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lexpo/modules/updates/b$e;-><init>(Lexpo/modules/updates/b;LZd/e;)V

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-static {v1, v0, v2, v1}, LGf/i;->f(LZd/i;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lexpo/modules/updates/b;->s:Lzd/h;

    .line 12
    .line 13
    invoke-virtual {v0}, Lzd/h;->w()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/b;->s:Lzd/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lzd/h;->u()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public d()Lud/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/b;->f:Lud/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public e(LZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, LGf/p;

    .line 2
    .line 3
    invoke-static {p1}, Lae/b;->c(LZd/e;)LZd/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, LGf/p;-><init>(LZd/e;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LGf/p;->C()V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lexpo/modules/updates/b;->z(Lexpo/modules/updates/b;)Lrd/d;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    new-instance v1, Lexpo/modules/updates/b$h;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Lexpo/modules/updates/b$h;-><init>(LGf/n;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0, v2, v1}, Lexpo/modules/updates/b;->H(Lexpo/modules/updates/b;ZLvd/b$a;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget-object v1, LTd/u;->b:LTd/u$a;

    .line 30
    .line 31
    new-instance v1, Lexpo/modules/updates/b$g;

    .line 32
    .line 33
    invoke-direct {v1}, Lexpo/modules/updates/b$g;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-static {v1}, LTd/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {v0, v1}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-virtual {v0}, LGf/p;->v()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-ne v0, v1, :cond_1

    .line 56
    .line 57
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne v0, p1, :cond_2

    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_2
    sget-object p1, LTd/L;->a:LTd/L;

    .line 68
    .line 69
    return-object p1
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/updates/b;->t:Z

    .line 2
    .line 3
    return v0
.end method

.method public g(Ljava/util/Map;)V
    .locals 3

    .line 1
    sget-object v0, Lexpo/modules/updates/d;->u:Lexpo/modules/updates/d$b;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/updates/b;->b:Lexpo/modules/updates/d;

    .line 4
    .line 5
    invoke-virtual {v1}, Lexpo/modules/updates/d;->m()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1, p1}, Lexpo/modules/updates/d$b;->u(Ljava/util/Map;Ljava/util/Map;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    sget-object v1, Lexpo/modules/updates/e;->c:Lexpo/modules/updates/e$a;

    .line 16
    .line 17
    iget-object v2, p0, Lexpo/modules/updates/b;->a:Landroid/content/Context;

    .line 18
    .line 19
    invoke-virtual {v1, v2, p1}, Lexpo/modules/updates/e$a;->d(Landroid/content/Context;Ljava/util/Map;)Lexpo/modules/updates/e;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v1, p0, Lexpo/modules/updates/b;->a:Landroid/content/Context;

    .line 24
    .line 25
    iget-object v2, p0, Lexpo/modules/updates/b;->b:Lexpo/modules/updates/d;

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2, p1}, Lexpo/modules/updates/d$b;->i(Landroid/content/Context;Lexpo/modules/updates/d;Lexpo/modules/updates/e;)Lexpo/modules/updates/d;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lexpo/modules/updates/b;->b:Lexpo/modules/updates/d;

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    new-instance v0, Lexpo/modules/kotlin/exception/CodedException;

    .line 35
    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v2, "Invalid update requestHeaders override: "

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const/4 v1, 0x0

    .line 54
    const-string v2, "ERR_UPDATES_RUNTIME_OVERRIDE"

    .line 55
    .line 56
    invoke-direct {v0, v2, p1, v1}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    throw v0
.end method

.method public getReactHost()Ljava/lang/ref/WeakReference;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/b;->m:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    return-object v0
.end method

.method public h(Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;
    .locals 11

    .line 1
    new-instance v4, LGf/p;

    .line 2
    .line 3
    invoke-static {p3}, Lae/b;->c(LZd/e;)LZd/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v4, v0, v1}, LGf/p;-><init>(LZd/e;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v4}, LGf/p;->C()V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lexpo/modules/updates/b;->w(Lexpo/modules/updates/b;)LGf/O;

    .line 15
    .line 16
    .line 17
    move-result-object v6

    .line 18
    new-instance v0, Lexpo/modules/updates/b$i;

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    move-object v1, p0

    .line 22
    move-object v2, p1

    .line 23
    move-object v3, p2

    .line 24
    invoke-direct/range {v0 .. v5}, Lexpo/modules/updates/b$i;-><init>(Lexpo/modules/updates/b;Ljava/lang/String;Ljava/lang/String;LGf/n;LZd/e;)V

    .line 25
    .line 26
    .line 27
    const/4 v9, 0x3

    .line 28
    const/4 v10, 0x0

    .line 29
    move-object v5, v6

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v7, 0x0

    .line 32
    move-object v8, v0

    .line 33
    invoke-static/range {v5 .. v10}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4}, LGf/p;->v()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    if-ne p1, p2, :cond_0

    .line 45
    .line 46
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    if-ne p1, p2, :cond_1

    .line 54
    .line 55
    return-object p1

    .line 56
    :cond_1
    sget-object p1, LTd/L;->a:LTd/L;

    .line 57
    .line 58
    return-object p1
.end method

.method public i(LZd/e;)Ljava/lang/Object;
    .locals 12

    .line 1
    new-instance v0, LGf/p;

    .line 2
    .line 3
    invoke-static {p1}, Lae/b;->c(LZd/e;)LZd/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, LGf/p;-><init>(LZd/e;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LGf/p;->C()V

    .line 12
    .line 13
    .line 14
    new-instance v3, Lzd/a;

    .line 15
    .line 16
    invoke-static {p0}, Lexpo/modules/updates/b;->v(Lexpo/modules/updates/b;)Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-static {p0}, Lexpo/modules/updates/b;->F(Lexpo/modules/updates/b;)Lexpo/modules/updates/d;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-static {p0}, Lexpo/modules/updates/b;->x(Lexpo/modules/updates/b;)Lpd/c;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    invoke-static {p0}, Lexpo/modules/updates/b;->A(Lexpo/modules/updates/b;)Lxd/g;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    invoke-static {p0}, Lexpo/modules/updates/b;->y(Lexpo/modules/updates/b;)Lwd/g;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    invoke-static {p0}, Lexpo/modules/updates/b;->B(Lexpo/modules/updates/b;)LBd/h;

    .line 37
    .line 38
    .line 39
    move-result-object v9

    .line 40
    invoke-static {p0}, Lexpo/modules/updates/b;->z(Lexpo/modules/updates/b;)Lrd/d;

    .line 41
    .line 42
    .line 43
    move-result-object v10

    .line 44
    new-instance v11, Lexpo/modules/updates/b$b;

    .line 45
    .line 46
    invoke-direct {v11, v0}, Lexpo/modules/updates/b$b;-><init>(LGf/n;)V

    .line 47
    .line 48
    .line 49
    invoke-direct/range {v3 .. v11}, Lzd/a;-><init>(Landroid/content/Context;Lexpo/modules/updates/d;Lpd/c;Lxd/g;Lwd/g;LBd/h;Lrd/d;Lkotlin/jvm/functions/Function1;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, Lexpo/modules/updates/b;->E(Lexpo/modules/updates/b;)LCd/g;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1, v3}, LCd/g;->f(Lzd/j;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, LGf/p;->v()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    if-ne v0, v1, :cond_0

    .line 68
    .line 69
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 70
    .line 71
    .line 72
    :cond_0
    return-object v0
.end method

.method public j()Lexpo/modules/updates/c$c;
    .locals 14

    .line 1
    new-instance v0, Lexpo/modules/updates/c$c;

    .line 2
    .line 3
    invoke-direct {p0}, Lexpo/modules/updates/b;->L()Lrd/d;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {p0}, Lexpo/modules/updates/b;->K()LEf/a;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {p0}, Lexpo/modules/updates/b;->I()Lrd/d;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget-object v4, p0, Lexpo/modules/updates/b;->s:Lzd/h;

    .line 16
    .line 17
    invoke-virtual {v4}, Lzd/h;->v()Ljava/lang/Exception;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-direct {p0}, Lexpo/modules/updates/b;->Q()Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    iget-object v5, p0, Lexpo/modules/updates/b;->b:Lexpo/modules/updates/d;

    .line 26
    .line 27
    invoke-virtual {v5}, Lexpo/modules/updates/d;->r()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    iget-object v5, p0, Lexpo/modules/updates/b;->b:Lexpo/modules/updates/d;

    .line 32
    .line 33
    invoke-virtual {v5}, Lexpo/modules/updates/d;->e()Lexpo/modules/updates/d$a;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    iget-object v5, p0, Lexpo/modules/updates/b;->b:Lexpo/modules/updates/d;

    .line 38
    .line 39
    invoke-virtual {v5}, Lexpo/modules/updates/d;->p()Ljava/util/Map;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    invoke-direct {p0}, Lexpo/modules/updates/b;->M()Ljava/util/Map;

    .line 44
    .line 45
    .line 46
    move-result-object v10

    .line 47
    iget-object v5, p0, Lexpo/modules/updates/b;->h:LCd/g;

    .line 48
    .line 49
    invoke-virtual {v5}, LCd/g;->d()LCd/b;

    .line 50
    .line 51
    .line 52
    move-result-object v12

    .line 53
    const/4 v13, 0x0

    .line 54
    const/4 v5, 0x1

    .line 55
    const/4 v11, 0x0

    .line 56
    invoke-direct/range {v0 .. v13}, Lexpo/modules/updates/c$c;-><init>(Lrd/d;LEf/a;Lrd/d;Ljava/lang/Exception;ZZLjava/lang/String;Lexpo/modules/updates/d$a;Ljava/util/Map;Ljava/util/Map;ZLCd/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 57
    .line 58
    .line 59
    return-object v0
.end method

.method public k()LAd/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/b;->l:LAd/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public l(Ljava/lang/ref/WeakReference;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lexpo/modules/updates/b;->m:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    return-void
.end method

.method public m(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 1

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lexpo/modules/updates/b;->d:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    return-void
.end method

.method public n()V
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/b;->h:LCd/g;

    .line 2
    .line 3
    invoke-virtual {v0}, LCd/g;->h()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public o(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "exception"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/updates/b;->s:Lzd/h;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lzd/h;->E(Ljava/lang/Exception;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public p(LZd/e;)Ljava/lang/Object;
    .locals 9

    .line 1
    new-instance v0, LGf/p;

    .line 2
    .line 3
    invoke-static {p1}, Lae/b;->c(LZd/e;)LZd/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, LGf/p;-><init>(LZd/e;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LGf/p;->C()V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lexpo/modules/updates/b;->w(Lexpo/modules/updates/b;)LGf/O;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    new-instance v6, Lexpo/modules/updates/b$d;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v6, p0, v0, v1}, Lexpo/modules/updates/b$d;-><init>(Lexpo/modules/updates/b;LGf/n;LZd/e;)V

    .line 22
    .line 23
    .line 24
    const/4 v7, 0x3

    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    invoke-static/range {v3 .. v8}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, LGf/p;->v()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-ne v0, v1, :cond_0

    .line 40
    .line 41
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-object v0
.end method

.method public q(LZd/e;)Ljava/lang/Object;
    .locals 13

    .line 1
    new-instance v0, LGf/p;

    .line 2
    .line 3
    invoke-static {p1}, Lae/b;->c(LZd/e;)LZd/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, LGf/p;-><init>(LZd/e;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LGf/p;->C()V

    .line 12
    .line 13
    .line 14
    new-instance v3, Lzd/d;

    .line 15
    .line 16
    invoke-static {p0}, Lexpo/modules/updates/b;->v(Lexpo/modules/updates/b;)Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-static {p0}, Lexpo/modules/updates/b;->F(Lexpo/modules/updates/b;)Lexpo/modules/updates/d;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-static {p0}, Lexpo/modules/updates/b;->A(Lexpo/modules/updates/b;)Lxd/g;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    invoke-static {p0}, Lexpo/modules/updates/b;->x(Lexpo/modules/updates/b;)Lpd/c;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    invoke-virtual {p0}, Lexpo/modules/updates/b;->P()Ljava/io/File;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    invoke-static {p0}, Lexpo/modules/updates/b;->y(Lexpo/modules/updates/b;)Lwd/g;

    .line 37
    .line 38
    .line 39
    move-result-object v9

    .line 40
    invoke-static {p0}, Lexpo/modules/updates/b;->B(Lexpo/modules/updates/b;)LBd/h;

    .line 41
    .line 42
    .line 43
    move-result-object v10

    .line 44
    invoke-static {p0}, Lexpo/modules/updates/b;->z(Lexpo/modules/updates/b;)Lrd/d;

    .line 45
    .line 46
    .line 47
    move-result-object v11

    .line 48
    new-instance v12, Lexpo/modules/updates/b$c;

    .line 49
    .line 50
    invoke-direct {v12, v0}, Lexpo/modules/updates/b$c;-><init>(LGf/n;)V

    .line 51
    .line 52
    .line 53
    invoke-direct/range {v3 .. v12}, Lzd/d;-><init>(Landroid/content/Context;Lexpo/modules/updates/d;Lxd/g;Lpd/c;Ljava/io/File;Lwd/g;LBd/h;Lrd/d;Lkotlin/jvm/functions/Function1;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0}, Lexpo/modules/updates/b;->E(Lexpo/modules/updates/b;)LCd/g;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1, v3}, LCd/g;->f(Lzd/j;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, LGf/p;->v()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    if-ne v0, v1, :cond_0

    .line 72
    .line 73
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 74
    .line 75
    .line 76
    :cond_0
    return-object v0
.end method

.method public r(Lexpo/modules/updates/e;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/b;->b:Lexpo/modules/updates/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/updates/d;->g()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lexpo/modules/updates/e;->c:Lexpo/modules/updates/e$a;

    .line 10
    .line 11
    iget-object v1, p0, Lexpo/modules/updates/b;->a:Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual {v0, v1, p1}, Lexpo/modules/updates/e$a;->c(Landroid/content/Context;Lexpo/modules/updates/e;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lexpo/modules/updates/d;->u:Lexpo/modules/updates/d$b;

    .line 17
    .line 18
    iget-object v1, p0, Lexpo/modules/updates/b;->a:Landroid/content/Context;

    .line 19
    .line 20
    iget-object v2, p0, Lexpo/modules/updates/b;->b:Lexpo/modules/updates/d;

    .line 21
    .line 22
    invoke-virtual {v0, v1, v2, p1}, Lexpo/modules/updates/d$b;->i(Landroid/content/Context;Lexpo/modules/updates/d;Lexpo/modules/updates/e;)Lexpo/modules/updates/d;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lexpo/modules/updates/b;->b:Lexpo/modules/updates/d;

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    new-instance p1, Lexpo/modules/kotlin/exception/CodedException;

    .line 30
    .line 31
    const-string v0, "Must set disableAntiBrickingMeasures configuration to use updates overriding"

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    const-string v2, "ERR_UPDATES_RUNTIME_OVERRIDE"

    .line 35
    .line 36
    invoke-direct {p1, v2, v0, v1}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    throw p1
.end method

.method public declared-synchronized start()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lexpo/modules/updates/b;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :try_start_1
    iput-boolean v0, p0, Lexpo/modules/updates/b;->o:Z

    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lexpo/modules/updates/b;->q:Ljava/lang/Long;

    .line 20
    .line 21
    invoke-direct {p0}, Lexpo/modules/updates/b;->S()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lexpo/modules/updates/b;->b:Lexpo/modules/updates/d;

    .line 25
    .line 26
    invoke-virtual {v0}, Lexpo/modules/updates/d;->k()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    sget-object v0, Lpd/a;->a:Lpd/a;

    .line 33
    .line 34
    iget-object v1, p0, Lexpo/modules/updates/b;->b:Lexpo/modules/updates/d;

    .line 35
    .line 36
    iget-object v2, p0, Lexpo/modules/updates/b;->i:Lpd/c;

    .line 37
    .line 38
    invoke-virtual {v2}, Lpd/c;->c()Lexpo/modules/updates/db/UpdatesDatabase;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v0, v1, v2}, Lpd/a;->c(Lexpo/modules/updates/d;Lexpo/modules/updates/db/UpdatesDatabase;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :goto_0
    iget-object v0, p0, Lexpo/modules/updates/b;->h:LCd/g;

    .line 49
    .line 50
    iget-object v1, p0, Lexpo/modules/updates/b;->s:Lzd/h;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, LCd/g;->f(Lzd/j;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    .line 54
    .line 55
    monitor-exit p0

    .line 56
    return-void

    .line 57
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    throw v0
.end method
