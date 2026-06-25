.class public final LCd/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LCd/g$a;
    }
.end annotation


# static fields
.field public static final g:LCd/g$a;

.field private static final h:Ljava/util/Map;

.field private static final i:Ljava/util/Map;


# instance fields
.field private final a:Lxd/g;

.field private final b:Lud/a;

.field private final c:Ljava/util/Set;

.field private final d:Lzd/k;

.field private e:LCd/h;

.field private f:LCd/b;


# direct methods
.method static constructor <clinit>()V
    .locals 30

    .line 1
    new-instance v0, LCd/g$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LCd/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LCd/g;->g:LCd/g$a;

    .line 8
    .line 9
    sget-object v0, LCd/h;->b:LCd/h;

    .line 10
    .line 11
    sget-object v1, LCd/f;->b:LCd/f;

    .line 12
    .line 13
    sget-object v2, LCd/f;->c:LCd/f;

    .line 14
    .line 15
    sget-object v3, LCd/f;->d:LCd/f;

    .line 16
    .line 17
    sget-object v4, LCd/f;->h:LCd/f;

    .line 18
    .line 19
    sget-object v5, LCd/f;->l:LCd/f;

    .line 20
    .line 21
    filled-new-array {v1, v2, v3, v4, v5}, [LCd/f;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    invoke-static {v6}, LUd/a0;->h([Ljava/lang/Object;)Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-static {v0, v6}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    sget-object v7, LCd/h;->c:LCd/h;

    .line 34
    .line 35
    sget-object v8, LCd/f;->f:LCd/f;

    .line 36
    .line 37
    sget-object v9, LCd/f;->e:LCd/f;

    .line 38
    .line 39
    sget-object v10, LCd/f;->g:LCd/f;

    .line 40
    .line 41
    filled-new-array {v8, v9, v10}, [LCd/f;

    .line 42
    .line 43
    .line 44
    move-result-object v11

    .line 45
    invoke-static {v11}, LUd/a0;->h([Ljava/lang/Object;)Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object v11

    .line 49
    invoke-static {v7, v11}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 50
    .line 51
    .line 52
    move-result-object v11

    .line 53
    sget-object v12, LCd/h;->d:LCd/h;

    .line 54
    .line 55
    sget-object v13, LCd/f;->j:LCd/f;

    .line 56
    .line 57
    sget-object v14, LCd/f;->k:LCd/f;

    .line 58
    .line 59
    sget-object v15, LCd/f;->i:LCd/f;

    .line 60
    .line 61
    filled-new-array {v13, v14, v15}, [LCd/f;

    .line 62
    .line 63
    .line 64
    move-result-object v16

    .line 65
    move-object/from16 v17, v5

    .line 66
    .line 67
    invoke-static/range {v16 .. v16}, LUd/a0;->h([Ljava/lang/Object;)Ljava/util/Set;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-static {v12, v5}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    move-object/from16 v16, v14

    .line 76
    .line 77
    sget-object v14, LCd/h;->e:LCd/h;

    .line 78
    .line 79
    move-object/from16 v18, v13

    .line 80
    .line 81
    invoke-static {}, LUd/a0;->d()Ljava/util/Set;

    .line 82
    .line 83
    .line 84
    move-result-object v13

    .line 85
    invoke-static {v14, v13}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 86
    .line 87
    .line 88
    move-result-object v13

    .line 89
    filled-new-array {v6, v11, v5, v13}, [Lkotlin/Pair;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-static {v5}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    sput-object v5, LCd/g;->h:Ljava/util/Map;

    .line 98
    .line 99
    invoke-static {v1, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 100
    .line 101
    .line 102
    move-result-object v19

    .line 103
    invoke-static {v2, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 104
    .line 105
    .line 106
    move-result-object v20

    .line 107
    invoke-static {v3, v7}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 108
    .line 109
    .line 110
    move-result-object v21

    .line 111
    invoke-static {v8, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 112
    .line 113
    .line 114
    move-result-object v22

    .line 115
    invoke-static {v9, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 116
    .line 117
    .line 118
    move-result-object v23

    .line 119
    invoke-static {v10, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 120
    .line 121
    .line 122
    move-result-object v24

    .line 123
    invoke-static {v4, v12}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 124
    .line 125
    .line 126
    move-result-object v25

    .line 127
    invoke-static {v15, v12}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 128
    .line 129
    .line 130
    move-result-object v26

    .line 131
    move-object/from16 v1, v18

    .line 132
    .line 133
    invoke-static {v1, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 134
    .line 135
    .line 136
    move-result-object v27

    .line 137
    move-object/from16 v1, v16

    .line 138
    .line 139
    invoke-static {v1, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 140
    .line 141
    .line 142
    move-result-object v28

    .line 143
    move-object/from16 v0, v17

    .line 144
    .line 145
    invoke-static {v0, v14}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 146
    .line 147
    .line 148
    move-result-object v29

    .line 149
    filled-new-array/range {v19 .. v29}, [Lkotlin/Pair;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-static {v0}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    sput-object v0, LCd/g;->i:Ljava/util/Map;

    .line 158
    .line 159
    return-void
.end method

.method public constructor <init>(Lxd/g;Lud/a;Ljava/util/Set;LGf/O;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    const-string v5, "logger"

    .line 12
    .line 13
    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v5, "eventManager"

    .line 17
    .line 18
    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v5, "validUpdatesStateValues"

    .line 22
    .line 23
    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v5, "scope"

    .line 27
    .line 28
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v1, v0, LCd/g;->a:Lxd/g;

    .line 35
    .line 36
    iput-object v2, v0, LCd/g;->b:Lud/a;

    .line 37
    .line 38
    iput-object v3, v0, LCd/g;->c:Ljava/util/Set;

    .line 39
    .line 40
    new-instance v2, Lzd/k;

    .line 41
    .line 42
    new-instance v3, LCd/g$b;

    .line 43
    .line 44
    invoke-direct {v3, v0}, LCd/g$b;-><init>(LCd/g;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v2, v1, v3, v4}, Lzd/k;-><init>(Lxd/a;Lzd/j$b;LGf/O;)V

    .line 48
    .line 49
    .line 50
    iput-object v2, v0, LCd/g;->d:Lzd/k;

    .line 51
    .line 52
    sget-object v1, LCd/h;->b:LCd/h;

    .line 53
    .line 54
    iput-object v1, v0, LCd/g;->e:LCd/h;

    .line 55
    .line 56
    new-instance v2, LCd/b;

    .line 57
    .line 58
    const v20, 0xffff

    .line 59
    .line 60
    .line 61
    const/16 v21, 0x0

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    const/4 v4, 0x0

    .line 65
    const/4 v5, 0x0

    .line 66
    const/4 v6, 0x0

    .line 67
    const/4 v7, 0x0

    .line 68
    const/4 v8, 0x0

    .line 69
    const/4 v9, 0x0

    .line 70
    const/4 v10, 0x0

    .line 71
    const/4 v11, 0x0

    .line 72
    const/4 v12, 0x0

    .line 73
    const/4 v13, 0x0

    .line 74
    const/4 v14, 0x0

    .line 75
    const-wide/16 v15, 0x0

    .line 76
    .line 77
    const/16 v17, 0x0

    .line 78
    .line 79
    const/16 v18, 0x0

    .line 80
    .line 81
    const/16 v19, 0x0

    .line 82
    .line 83
    invoke-direct/range {v2 .. v21}, LCd/b;-><init>(ZZZZZZILorg/json/JSONObject;Lorg/json/JSONObject;LCd/c;LCd/d;LCd/d;DLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 84
    .line 85
    .line 86
    iput-object v2, v0, LCd/g;->f:LCd/b;

    .line 87
    .line 88
    return-void
.end method

.method public static final synthetic a(LCd/g;)LCd/h;
    .locals 0

    .line 1
    iget-object p0, p0, LCd/g;->e:LCd/h;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(LCd/g;LCd/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LCd/g;->e(LCd/e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic c(LCd/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LCd/g;->g()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final e(LCd/e;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, LCd/g;->i(LCd/e;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    sget-object v0, LCd/g;->g:LCd/g$a;

    .line 8
    .line 9
    iget-object v1, p0, LCd/g;->f:LCd/b;

    .line 10
    .line 11
    invoke-static {v0, v1, p1}, LCd/g$a;->a(LCd/g$a;LCd/b;LCd/e;)LCd/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LCd/g;->f:LCd/b;

    .line 16
    .line 17
    instance-of v0, p1, LCd/e$k;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, LCd/g;->a:Lxd/g;

    .line 22
    .line 23
    invoke-virtual {p1}, LCd/e;->a()LCd/f;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object v1, p0, LCd/g;->f:LCd/b;

    .line 28
    .line 29
    invoke-virtual {v1}, LCd/b;->g()Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    new-instance v2, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v3, "Updates state change: "

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p1, ", context = "

    .line 47
    .line 48
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const/4 v1, 0x2

    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-static {v0, p1, v2, v1, v2}, Lxd/g;->k(Lxd/g;Ljava/lang/String;Lxd/b;ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    sget-object p1, LEd/a;->a:LEd/a;

    .line 64
    .line 65
    invoke-virtual {p1}, LEd/a;->a()Ljava/lang/ref/WeakReference;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, LEd/b;

    .line 76
    .line 77
    if-eqz p1, :cond_1

    .line 78
    .line 79
    instance-of v0, p1, Lexpo/modules/updates/b;

    .line 80
    .line 81
    if-eqz v0, :cond_1

    .line 82
    .line 83
    check-cast p1, Lexpo/modules/updates/b;

    .line 84
    .line 85
    invoke-virtual {p1}, Lexpo/modules/updates/b;->O()Ljava/util/Map;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Ljava/lang/Iterable;

    .line 94
    .line 95
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_1

    .line 104
    .line 105
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {p1}, Lexpo/modules/updates/b;->O()Ljava/util/Map;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-static {v1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_1
    invoke-virtual {p0}, LCd/g;->h()V

    .line 124
    .line 125
    .line 126
    :cond_2
    return-void
.end method

.method private final g()V
    .locals 4

    .line 1
    sget-object v0, LCd/h;->b:LCd/h;

    .line 2
    .line 3
    iput-object v0, p0, LCd/g;->e:LCd/h;

    .line 4
    .line 5
    iget-object v0, p0, LCd/g;->f:LCd/b;

    .line 6
    .line 7
    invoke-virtual {v0}, LCd/b;->h()LCd/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, LCd/g;->f:LCd/b;

    .line 12
    .line 13
    iget-object v1, p0, LCd/g;->a:Lxd/g;

    .line 14
    .line 15
    invoke-virtual {v0}, LCd/b;->g()Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v3, "Updates state change: reset, context = "

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v2, 0x0

    .line 37
    const/4 v3, 0x2

    .line 38
    invoke-static {v1, v0, v2, v3, v2}, Lxd/g;->k(Lxd/g;Ljava/lang/String;Lxd/b;ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, LCd/g;->h()V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method private final i(LCd/e;)Z
    .locals 2

    .line 1
    sget-object v0, LCd/g;->h:Ljava/util/Map;

    .line 2
    .line 3
    iget-object v1, p0, LCd/g;->e:LCd/h;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/Set;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, LUd/a0;->d()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_0
    invoke-virtual {p1}, LCd/e;->a()LCd/f;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    return v1

    .line 29
    :cond_1
    sget-object v0, LCd/g;->i:Ljava/util/Map;

    .line 30
    .line 31
    invoke-virtual {p1}, LCd/e;->a()LCd/f;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, LCd/h;

    .line 40
    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    sget-object p1, LCd/h;->b:LCd/h;

    .line 44
    .line 45
    :cond_2
    iget-object v0, p0, LCd/g;->c:Ljava/util/Set;

    .line 46
    .line 47
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    return v1

    .line 54
    :cond_3
    iput-object p1, p0, LCd/g;->e:LCd/h;

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    return p1
.end method


# virtual methods
.method public final d()LCd/b;
    .locals 1

    .line 1
    iget-object v0, p0, LCd/g;->f:LCd/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(Lzd/j;)V
    .locals 1

    .line 1
    const-string v0, "stateMachineProcedure"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LCd/g;->d:Lzd/k;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lzd/k;->f(Lzd/j;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final h()V
    .locals 2

    .line 1
    iget-object v0, p0, LCd/g;->b:Lud/a;

    .line 2
    .line 3
    iget-object v1, p0, LCd/g;->f:LCd/b;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lud/a;->b(LCd/b;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
