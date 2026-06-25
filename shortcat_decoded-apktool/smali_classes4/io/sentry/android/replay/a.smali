.class public Lio/sentry/android/replay/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/y1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/android/replay/a$b;,
        Lio/sentry/android/replay/a$c;
    }
.end annotation


# static fields
.field public static final d:Lio/sentry/android/replay/a$b;

.field public static final e:I

.field private static final f:Lkotlin/Lazy;

.field private static final g:Ljava/util/HashSet;


# instance fields
.field private a:Lio/sentry/z3;

.field private b:Ljava/lang/String;

.field private final c:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/android/replay/a$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lio/sentry/android/replay/a$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lio/sentry/android/replay/a;->d:Lio/sentry/android/replay/a$b;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lio/sentry/android/replay/a;->e:I

    .line 12
    .line 13
    sget-object v0, LTd/q;->c:LTd/q;

    .line 14
    .line 15
    sget-object v1, Lio/sentry/android/replay/a$a;->a:Lio/sentry/android/replay/a$a;

    .line 16
    .line 17
    invoke-static {v0, v1}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lio/sentry/android/replay/a;->f:Lkotlin/Lazy;

    .line 22
    .line 23
    new-instance v0, Ljava/util/HashSet;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v1, "status_code"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    const-string v1, "method"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    const-string v1, "response_content_length"

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    const-string v1, "request_content_length"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    const-string v1, "http.response_content_length"

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    const-string v1, "http.request_content_length"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    sput-object v0, Lio/sentry/android/replay/a;->g:Ljava/util/HashSet;

    .line 59
    .line 60
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lio/sentry/android/replay/a$d;

    invoke-direct {v0}, Lio/sentry/android/replay/a$d;-><init>()V

    .line 3
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/android/replay/a;->c:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lio/sentry/z3;)V
    .locals 2

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Lio/sentry/android/replay/a;-><init>()V

    .line 5
    iput-object p1, p0, Lio/sentry/android/replay/a;->a:Lio/sentry/z3;

    if-nez p1, :cond_0

    return-void

    .line 6
    :cond_0
    new-instance v0, Lio/sentry/android/replay/a$c;

    invoke-virtual {p1}, Lio/sentry/z3;->getBeforeBreadcrumb()Lio/sentry/z3$a;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lio/sentry/android/replay/a$c;-><init>(Lio/sentry/android/replay/a;Lio/sentry/z3$a;)V

    invoke-virtual {p1, v0}, Lio/sentry/z3;->setBeforeBreadcrumb(Lio/sentry/z3$a;)V

    return-void
.end method

.method public static final synthetic b()Lkotlin/Lazy;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/android/replay/a;->f:Lkotlin/Lazy;

    .line 2
    .line 3
    return-object v0
.end method

.method private final c(Lio/sentry/e;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "url"

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast v0, Ljava/lang/String;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "getData(...)"

    .line 33
    .line 34
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v2, "http.start_timestamp"

    .line 38
    .line 39
    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-string v0, "http.end_timestamp"

    .line 53
    .line 54
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    const/4 p1, 0x1

    .line 61
    return p1

    .line 62
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 63
    return p1
.end method

.method private final d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lio/sentry/android/replay/a;->d:Lio/sentry/android/replay/a$b;

    .line 2
    .line 3
    invoke-static {v0}, Lio/sentry/android/replay/a$b;->a(Lio/sentry/android/replay/a$b;)LDf/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lio/sentry/android/replay/a$e;->a:Lio/sentry/android/replay/a$e;

    .line 8
    .line 9
    invoke-virtual {v0, p1, v1}, LDf/p;->j(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method private final e(Lio/sentry/e;)Lio/sentry/rrweb/i;
    .locals 10

    .line 1
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "http.start_timestamp"

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "http.end_timestamp"

    .line 16
    .line 17
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, Lio/sentry/rrweb/i;

    .line 22
    .line 23
    invoke-direct {v2}, Lio/sentry/rrweb/i;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lio/sentry/e;->x()Ljava/util/Date;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    invoke-virtual {v2, v3, v4}, Lio/sentry/rrweb/b;->f(J)V

    .line 35
    .line 36
    .line 37
    const-string v3, "resource.http"

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Lio/sentry/rrweb/i;->s(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    const-string v4, "url"

    .line 47
    .line 48
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 53
    .line 54
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    check-cast v3, Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Lio/sentry/rrweb/i;->q(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    instance-of v3, v0, Ljava/lang/Double;

    .line 63
    .line 64
    const-string v4, "null cannot be cast to non-null type kotlin.Long"

    .line 65
    .line 66
    const-wide v5, 0x408f400000000000L    # 1000.0

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    if-eqz v3, :cond_0

    .line 72
    .line 73
    check-cast v0, Ljava/lang/Number;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 76
    .line 77
    .line 78
    move-result-wide v7

    .line 79
    :goto_0
    div-double/2addr v7, v5

    .line 80
    goto :goto_1

    .line 81
    :cond_0
    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    check-cast v0, Ljava/lang/Long;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 87
    .line 88
    .line 89
    move-result-wide v7

    .line 90
    long-to-double v7, v7

    .line 91
    goto :goto_0

    .line 92
    :goto_1
    invoke-virtual {v2, v7, v8}, Lio/sentry/rrweb/i;->u(D)V

    .line 93
    .line 94
    .line 95
    instance-of v0, v1, Ljava/lang/Double;

    .line 96
    .line 97
    if-eqz v0, :cond_1

    .line 98
    .line 99
    check-cast v1, Ljava/lang/Number;

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 102
    .line 103
    .line 104
    move-result-wide v0

    .line 105
    :goto_2
    div-double/2addr v0, v5

    .line 106
    goto :goto_3

    .line 107
    :cond_1
    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    check-cast v1, Ljava/lang/Long;

    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 113
    .line 114
    .line 115
    move-result-wide v0

    .line 116
    long-to-double v0, v0

    .line 117
    goto :goto_2

    .line 118
    :goto_3
    invoke-virtual {v2, v0, v1}, Lio/sentry/rrweb/i;->r(D)V

    .line 119
    .line 120
    .line 121
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 122
    .line 123
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 124
    .line 125
    .line 126
    iget-object v1, p0, Lio/sentry/android/replay/a;->c:Ljava/util/Map;

    .line 127
    .line 128
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-static {v1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    const-string v1, "getData(...)"

    .line 140
    .line 141
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    :cond_2
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-eqz v1, :cond_3

    .line 157
    .line 158
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    check-cast v1, Ljava/util/Map$Entry;

    .line 163
    .line 164
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    move-object v4, v3

    .line 169
    check-cast v4, Ljava/lang/String;

    .line 170
    .line 171
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    sget-object v3, Lio/sentry/android/replay/a;->g:Ljava/util/HashSet;

    .line 176
    .line 177
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    if-eqz v3, :cond_2

    .line 182
    .line 183
    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    const/4 v8, 0x4

    .line 187
    const/4 v9, 0x0

    .line 188
    const-string v5, "content_length"

    .line 189
    .line 190
    const-string v6, "body_size"

    .line 191
    .line 192
    const/4 v7, 0x0

    .line 193
    invoke-static/range {v4 .. v9}, LDf/r;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    const-string v4, "."

    .line 198
    .line 199
    const/4 v5, 0x2

    .line 200
    const/4 v6, 0x0

    .line 201
    invoke-static {v3, v4, v6, v5, v6}, LDf/r;->W0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    invoke-direct {p0, v3}, Lio/sentry/android/replay/a;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_3
    invoke-virtual {v2, v0}, Lio/sentry/rrweb/i;->o(Ljava/util/Map;)V

    .line 214
    .line 215
    .line 216
    return-object v2
.end method


# virtual methods
.method public a(Lio/sentry/e;)Lio/sentry/rrweb/b;
    .locals 9

    .line 1
    const-string v0, "breadcrumb"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lio/sentry/e;->r()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "http"

    .line 16
    .line 17
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-direct {p0, p1}, Lio/sentry/android/replay/a;->c(Lio/sentry/e;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-direct {p0, p1}, Lio/sentry/android/replay/a;->e(Lio/sentry/e;)Lio/sentry/rrweb/i;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :cond_0
    return-object v2

    .line 36
    :cond_1
    invoke-virtual {p1}, Lio/sentry/e;->y()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-string v3, "navigation"

    .line 41
    .line 42
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const-string v4, "state"

    .line 47
    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    invoke-virtual {p1}, Lio/sentry/e;->r()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-string v5, "app.lifecycle"

    .line 55
    .line 56
    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    new-instance v1, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v3, "app."

    .line 68
    .line 69
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    :goto_0
    move-object v1, v2

    .line 88
    move-object v4, v1

    .line 89
    goto/16 :goto_a

    .line 90
    .line 91
    :cond_2
    invoke-virtual {p1}, Lio/sentry/e;->y()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_5

    .line 100
    .line 101
    invoke-virtual {p1}, Lio/sentry/e;->r()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    const-string v5, "device.orientation"

    .line 106
    .line 107
    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_5

    .line 112
    .line 113
    invoke-virtual {p1}, Lio/sentry/e;->r()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    const-string v4, "position"

    .line 125
    .line 126
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    const-string v5, "landscape"

    .line 131
    .line 132
    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    if-nez v5, :cond_4

    .line 137
    .line 138
    const-string v5, "portrait"

    .line 139
    .line 140
    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-eqz v5, :cond_3

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_3
    return-object v2

    .line 148
    :cond_4
    :goto_1
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_5
    invoke-virtual {p1}, Lio/sentry/e;->y()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    const-string v5, "getData(...)"

    .line 161
    .line 162
    if-eqz v1, :cond_a

    .line 163
    .line 164
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    const-string v4, "resumed"

    .line 173
    .line 174
    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    const-string v4, "to"

    .line 179
    .line 180
    if-eqz v1, :cond_8

    .line 181
    .line 182
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    const-string v5, "screen"

    .line 187
    .line 188
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    instance-of v5, v1, Ljava/lang/String;

    .line 193
    .line 194
    if-eqz v5, :cond_6

    .line 195
    .line 196
    check-cast v1, Ljava/lang/String;

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_6
    move-object v1, v2

    .line 200
    :goto_2
    if-eqz v1, :cond_7

    .line 201
    .line 202
    const/16 v5, 0x2e

    .line 203
    .line 204
    const/4 v6, 0x2

    .line 205
    invoke-static {v1, v5, v2, v6, v2}, LDf/r;->Z0(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    goto :goto_3

    .line 210
    :cond_7
    move-object v1, v2

    .line 211
    goto :goto_3

    .line 212
    :cond_8
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-interface {v1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    if-eqz v1, :cond_7

    .line 224
    .line 225
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    instance-of v5, v1, Ljava/lang/String;

    .line 234
    .line 235
    if-eqz v5, :cond_7

    .line 236
    .line 237
    check-cast v1, Ljava/lang/String;

    .line 238
    .line 239
    :goto_3
    if-nez v1, :cond_9

    .line 240
    .line 241
    return-object v2

    .line 242
    :cond_9
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    goto/16 :goto_0

    .line 246
    .line 247
    :cond_a
    invoke-virtual {p1}, Lio/sentry/e;->r()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    const-string v3, "ui.click"

    .line 252
    .line 253
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    if-eqz v1, :cond_e

    .line 258
    .line 259
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    const-string v3, "view.id"

    .line 264
    .line 265
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    if-nez v1, :cond_b

    .line 270
    .line 271
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    const-string v3, "view.tag"

    .line 276
    .line 277
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    if-nez v1, :cond_b

    .line 282
    .line 283
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    const-string v3, "view.class"

    .line 288
    .line 289
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    :cond_b
    instance-of v3, v1, Ljava/lang/String;

    .line 294
    .line 295
    if-eqz v3, :cond_c

    .line 296
    .line 297
    check-cast v1, Ljava/lang/String;

    .line 298
    .line 299
    goto :goto_4

    .line 300
    :cond_c
    move-object v1, v2

    .line 301
    :goto_4
    if-nez v1, :cond_d

    .line 302
    .line 303
    return-object v2

    .line 304
    :cond_d
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    invoke-interface {v0, v3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 312
    .line 313
    .line 314
    const-string v3, "ui.tap"

    .line 315
    .line 316
    move-object v4, v2

    .line 317
    goto/16 :goto_a

    .line 318
    .line 319
    :cond_e
    invoke-virtual {p1}, Lio/sentry/e;->y()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    const-string v3, "system"

    .line 324
    .line 325
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v1

    .line 329
    const-string v3, "action"

    .line 330
    .line 331
    if-eqz v1, :cond_15

    .line 332
    .line 333
    invoke-virtual {p1}, Lio/sentry/e;->r()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    const-string v6, "network.event"

    .line 338
    .line 339
    invoke-static {v1, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v1

    .line 343
    if-eqz v1, :cond_15

    .line 344
    .line 345
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    const-string v3, "NETWORK_LOST"

    .line 354
    .line 355
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    if-eqz v1, :cond_f

    .line 360
    .line 361
    const-string v1, "offline"

    .line 362
    .line 363
    goto :goto_6

    .line 364
    :cond_f
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    const-string v3, "network_type"

    .line 372
    .line 373
    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    if-eqz v1, :cond_14

    .line 378
    .line 379
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    instance-of v5, v1, Ljava/lang/String;

    .line 388
    .line 389
    if-eqz v5, :cond_10

    .line 390
    .line 391
    check-cast v1, Ljava/lang/String;

    .line 392
    .line 393
    goto :goto_5

    .line 394
    :cond_10
    move-object v1, v2

    .line 395
    :goto_5
    if-eqz v1, :cond_14

    .line 396
    .line 397
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    if-nez v1, :cond_11

    .line 402
    .line 403
    goto :goto_8

    .line 404
    :cond_11
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    :goto_6
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    iget-object v1, p0, Lio/sentry/android/replay/a;->b:Ljava/lang/String;

    .line 416
    .line 417
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v1

    .line 425
    if-eqz v1, :cond_12

    .line 426
    .line 427
    return-object v2

    .line 428
    :cond_12
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    instance-of v3, v1, Ljava/lang/String;

    .line 433
    .line 434
    if-eqz v3, :cond_13

    .line 435
    .line 436
    check-cast v1, Ljava/lang/String;

    .line 437
    .line 438
    goto :goto_7

    .line 439
    :cond_13
    move-object v1, v2

    .line 440
    :goto_7
    iput-object v1, p0, Lio/sentry/android/replay/a;->b:Ljava/lang/String;

    .line 441
    .line 442
    const-string v3, "device.connectivity"

    .line 443
    .line 444
    goto/16 :goto_0

    .line 445
    .line 446
    :cond_14
    :goto_8
    return-object v2

    .line 447
    :cond_15
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    const-string v3, "BATTERY_CHANGED"

    .line 456
    .line 457
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result v1

    .line 461
    if-eqz v1, :cond_19

    .line 462
    .line 463
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 471
    .line 472
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 473
    .line 474
    .line 475
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    :cond_16
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 484
    .line 485
    .line 486
    move-result v4

    .line 487
    if-eqz v4, :cond_18

    .line 488
    .line 489
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v4

    .line 493
    check-cast v4, Ljava/util/Map$Entry;

    .line 494
    .line 495
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v5

    .line 499
    check-cast v5, Ljava/lang/String;

    .line 500
    .line 501
    const-string v6, "level"

    .line 502
    .line 503
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v6

    .line 507
    if-nez v6, :cond_17

    .line 508
    .line 509
    const-string v6, "charging"

    .line 510
    .line 511
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    move-result v5

    .line 515
    if-eqz v5, :cond_16

    .line 516
    .line 517
    :cond_17
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v5

    .line 521
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v4

    .line 525
    invoke-virtual {v3, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    goto :goto_9

    .line 529
    :cond_18
    invoke-interface {v0, v3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 530
    .line 531
    .line 532
    const-string v3, "device.battery"

    .line 533
    .line 534
    goto/16 :goto_0

    .line 535
    .line 536
    :cond_19
    invoke-virtual {p1}, Lio/sentry/e;->r()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v3

    .line 540
    invoke-virtual {p1}, Lio/sentry/e;->v()Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    invoke-virtual {p1}, Lio/sentry/e;->u()Lio/sentry/i3;

    .line 545
    .line 546
    .line 547
    move-result-object v4

    .line 548
    invoke-virtual {p1}, Lio/sentry/e;->t()Ljava/util/Map;

    .line 549
    .line 550
    .line 551
    move-result-object v6

    .line 552
    invoke-static {v6, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    invoke-interface {v0, v6}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 556
    .line 557
    .line 558
    :goto_a
    if-eqz v3, :cond_1b

    .line 559
    .line 560
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 561
    .line 562
    .line 563
    move-result v5

    .line 564
    if-nez v5, :cond_1a

    .line 565
    .line 566
    goto :goto_b

    .line 567
    :cond_1a
    new-instance v2, Lio/sentry/rrweb/a;

    .line 568
    .line 569
    invoke-direct {v2}, Lio/sentry/rrweb/a;-><init>()V

    .line 570
    .line 571
    .line 572
    invoke-virtual {p1}, Lio/sentry/e;->x()Ljava/util/Date;

    .line 573
    .line 574
    .line 575
    move-result-object v5

    .line 576
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    .line 577
    .line 578
    .line 579
    move-result-wide v5

    .line 580
    invoke-virtual {v2, v5, v6}, Lio/sentry/rrweb/b;->f(J)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {p1}, Lio/sentry/e;->x()Ljava/util/Date;

    .line 584
    .line 585
    .line 586
    move-result-object p1

    .line 587
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 588
    .line 589
    .line 590
    move-result-wide v5

    .line 591
    long-to-double v5, v5

    .line 592
    const-wide v7, 0x408f400000000000L    # 1000.0

    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    div-double/2addr v5, v7

    .line 598
    invoke-virtual {v2, v5, v6}, Lio/sentry/rrweb/a;->r(D)V

    .line 599
    .line 600
    .line 601
    const-string p1, "default"

    .line 602
    .line 603
    invoke-virtual {v2, p1}, Lio/sentry/rrweb/a;->s(Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v2, v3}, Lio/sentry/rrweb/a;->t(Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v2, v1}, Lio/sentry/rrweb/a;->x(Ljava/lang/String;)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v2, v4}, Lio/sentry/rrweb/a;->w(Lio/sentry/i3;)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v2, v0}, Lio/sentry/rrweb/a;->u(Ljava/util/Map;)V

    .line 616
    .line 617
    .line 618
    :cond_1b
    :goto_b
    return-object v2
.end method
