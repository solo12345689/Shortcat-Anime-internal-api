.class public abstract Landroidx/compose/ui/viewinterop/b;
.super Landroid/view/ViewGroup;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/core/view/G;
.implements LY/i;
.implements LK0/q0;
.implements Landroidx/core/view/I;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/viewinterop/b$c;
    }
.end annotation


# static fields
.field public static final A:Landroidx/compose/ui/viewinterop/b$c;

.field public static final B:I

.field private static final C:Lkotlin/jvm/functions/Function1;


# instance fields
.field private final a:I

.field private final b:LD0/b;

.field private final c:Landroid/view/View;

.field private final d:LK0/p0;

.field private e:Lie/a;

.field private f:Z

.field private g:Lie/a;

.field private h:Lie/a;

.field private i:Landroidx/compose/ui/e;

.field private j:Lkotlin/jvm/functions/Function1;

.field private k:Li1/d;

.field private l:Lkotlin/jvm/functions/Function1;

.field private m:Landroidx/lifecycle/r;

.field private n:LP3/i;

.field private final o:[I

.field private p:J

.field private q:Landroidx/core/view/L0;

.field private final r:Lie/a;

.field private final s:Lie/a;

.field private t:Lkotlin/jvm/functions/Function1;

.field private final u:[I

.field private v:I

.field private w:I

.field private final x:Landroidx/core/view/H;

.field private y:Z

.field private final z:LK0/J;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/ui/viewinterop/b$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/ui/viewinterop/b$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/ui/viewinterop/b;->A:Landroidx/compose/ui/viewinterop/b$c;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Landroidx/compose/ui/viewinterop/b;->B:I

    .line 12
    .line 13
    sget-object v0, Landroidx/compose/ui/viewinterop/b$b;->a:Landroidx/compose/ui/viewinterop/b$b;

    .line 14
    .line 15
    sput-object v0, Landroidx/compose/ui/viewinterop/b;->C:Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LY/y;ILD0/b;Landroid/view/View;LK0/p0;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Landroidx/compose/ui/viewinterop/b;->a:I

    .line 5
    .line 6
    iput-object p4, p0, Landroidx/compose/ui/viewinterop/b;->b:LD0/b;

    .line 7
    .line 8
    iput-object p5, p0, Landroidx/compose/ui/viewinterop/b;->c:Landroid/view/View;

    .line 9
    .line 10
    iput-object p6, p0, Landroidx/compose/ui/viewinterop/b;->d:LK0/p0;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    invoke-static {p0, p2}, Landroidx/compose/ui/platform/K1;->i(Landroid/view/View;LY/y;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    invoke-virtual {p0, p1}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    new-instance p2, Landroidx/compose/ui/viewinterop/b$a;

    .line 25
    .line 26
    invoke-direct {p2, p0}, Landroidx/compose/ui/viewinterop/b$a;-><init>(Landroidx/compose/ui/viewinterop/b;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0, p2}, Landroidx/core/view/a0;->C0(Landroid/view/View;Landroidx/core/view/p0$b;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0, p0}, Landroidx/core/view/a0;->w0(Landroid/view/View;Landroidx/core/view/I;)V

    .line 33
    .line 34
    .line 35
    sget-object p2, Landroidx/compose/ui/viewinterop/b$r;->a:Landroidx/compose/ui/viewinterop/b$r;

    .line 36
    .line 37
    iput-object p2, p0, Landroidx/compose/ui/viewinterop/b;->e:Lie/a;

    .line 38
    .line 39
    sget-object p2, Landroidx/compose/ui/viewinterop/b$o;->a:Landroidx/compose/ui/viewinterop/b$o;

    .line 40
    .line 41
    iput-object p2, p0, Landroidx/compose/ui/viewinterop/b;->g:Lie/a;

    .line 42
    .line 43
    sget-object p2, Landroidx/compose/ui/viewinterop/b$n;->a:Landroidx/compose/ui/viewinterop/b$n;

    .line 44
    .line 45
    iput-object p2, p0, Landroidx/compose/ui/viewinterop/b;->h:Lie/a;

    .line 46
    .line 47
    sget-object p2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 48
    .line 49
    iput-object p2, p0, Landroidx/compose/ui/viewinterop/b;->i:Landroidx/compose/ui/e;

    .line 50
    .line 51
    const/high16 p5, 0x3f800000    # 1.0f

    .line 52
    .line 53
    const/4 p6, 0x0

    .line 54
    const/4 v0, 0x2

    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-static {p5, p6, v0, v1}, Li1/f;->b(FFILjava/lang/Object;)Li1/d;

    .line 57
    .line 58
    .line 59
    move-result-object p5

    .line 60
    iput-object p5, p0, Landroidx/compose/ui/viewinterop/b;->k:Li1/d;

    .line 61
    .line 62
    new-array p5, v0, [I

    .line 63
    .line 64
    iput-object p5, p0, Landroidx/compose/ui/viewinterop/b;->o:[I

    .line 65
    .line 66
    sget-object p5, Li1/r;->b:Li1/r$a;

    .line 67
    .line 68
    invoke-virtual {p5}, Li1/r$a;->a()J

    .line 69
    .line 70
    .line 71
    move-result-wide p5

    .line 72
    iput-wide p5, p0, Landroidx/compose/ui/viewinterop/b;->p:J

    .line 73
    .line 74
    new-instance p5, Landroidx/compose/ui/viewinterop/b$q;

    .line 75
    .line 76
    invoke-direct {p5, p0}, Landroidx/compose/ui/viewinterop/b$q;-><init>(Landroidx/compose/ui/viewinterop/b;)V

    .line 77
    .line 78
    .line 79
    iput-object p5, p0, Landroidx/compose/ui/viewinterop/b;->r:Lie/a;

    .line 80
    .line 81
    new-instance p5, Landroidx/compose/ui/viewinterop/b$p;

    .line 82
    .line 83
    invoke-direct {p5, p0}, Landroidx/compose/ui/viewinterop/b$p;-><init>(Landroidx/compose/ui/viewinterop/b;)V

    .line 84
    .line 85
    .line 86
    iput-object p5, p0, Landroidx/compose/ui/viewinterop/b;->s:Lie/a;

    .line 87
    .line 88
    new-array p5, v0, [I

    .line 89
    .line 90
    iput-object p5, p0, Landroidx/compose/ui/viewinterop/b;->u:[I

    .line 91
    .line 92
    const/high16 p5, -0x80000000

    .line 93
    .line 94
    iput p5, p0, Landroidx/compose/ui/viewinterop/b;->v:I

    .line 95
    .line 96
    iput p5, p0, Landroidx/compose/ui/viewinterop/b;->w:I

    .line 97
    .line 98
    new-instance p5, Landroidx/core/view/H;

    .line 99
    .line 100
    invoke-direct {p5, p0}, Landroidx/core/view/H;-><init>(Landroid/view/ViewGroup;)V

    .line 101
    .line 102
    .line 103
    iput-object p5, p0, Landroidx/compose/ui/viewinterop/b;->x:Landroidx/core/view/H;

    .line 104
    .line 105
    new-instance p5, LK0/J;

    .line 106
    .line 107
    const/4 p6, 0x3

    .line 108
    invoke-direct {p5, p1, p1, p6, v1}, LK0/J;-><init>(ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p5, p0}, LK0/J;->Q1(Landroidx/compose/ui/viewinterop/b;)V

    .line 112
    .line 113
    .line 114
    invoke-static {}, Landroidx/compose/ui/viewinterop/d;->a()Landroidx/compose/ui/viewinterop/d$a;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {p2, p1, p4}, Landroidx/compose/ui/input/nestedscroll/a;->a(Landroidx/compose/ui/e;LD0/a;LD0/b;)Landroidx/compose/ui/e;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    const/4 p2, 0x1

    .line 123
    sget-object p4, Landroidx/compose/ui/viewinterop/b$i;->a:Landroidx/compose/ui/viewinterop/b$i;

    .line 124
    .line 125
    invoke-static {p1, p2, p4}, LR0/r;->e(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-static {p1, p0}, LE0/N;->a(Landroidx/compose/ui/e;Landroidx/compose/ui/viewinterop/b;)Landroidx/compose/ui/e;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    new-instance p2, Landroidx/compose/ui/viewinterop/b$j;

    .line 134
    .line 135
    invoke-direct {p2, p0, p5, p0}, Landroidx/compose/ui/viewinterop/b$j;-><init>(Landroidx/compose/ui/viewinterop/b;LK0/J;Landroidx/compose/ui/viewinterop/b;)V

    .line 136
    .line 137
    .line 138
    invoke-static {p1, p2}, Landroidx/compose/ui/draw/b;->b(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    new-instance p2, Landroidx/compose/ui/viewinterop/b$k;

    .line 143
    .line 144
    invoke-direct {p2, p0, p5}, Landroidx/compose/ui/viewinterop/b$k;-><init>(Landroidx/compose/ui/viewinterop/b;LK0/J;)V

    .line 145
    .line 146
    .line 147
    invoke-static {p1, p2}, Landroidx/compose/ui/layout/n;->a(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {p5, p3}, LK0/J;->f(I)V

    .line 152
    .line 153
    .line 154
    iget-object p2, p0, Landroidx/compose/ui/viewinterop/b;->i:Landroidx/compose/ui/e;

    .line 155
    .line 156
    invoke-interface {p2, p1}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-virtual {p5, p2}, LK0/J;->m(Landroidx/compose/ui/e;)V

    .line 161
    .line 162
    .line 163
    new-instance p2, Landroidx/compose/ui/viewinterop/b$d;

    .line 164
    .line 165
    invoke-direct {p2, p5, p1}, Landroidx/compose/ui/viewinterop/b$d;-><init>(LK0/J;Landroidx/compose/ui/e;)V

    .line 166
    .line 167
    .line 168
    iput-object p2, p0, Landroidx/compose/ui/viewinterop/b;->j:Lkotlin/jvm/functions/Function1;

    .line 169
    .line 170
    iget-object p1, p0, Landroidx/compose/ui/viewinterop/b;->k:Li1/d;

    .line 171
    .line 172
    invoke-virtual {p5, p1}, LK0/J;->c(Li1/d;)V

    .line 173
    .line 174
    .line 175
    new-instance p1, Landroidx/compose/ui/viewinterop/b$e;

    .line 176
    .line 177
    invoke-direct {p1, p5}, Landroidx/compose/ui/viewinterop/b$e;-><init>(LK0/J;)V

    .line 178
    .line 179
    .line 180
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/b;->l:Lkotlin/jvm/functions/Function1;

    .line 181
    .line 182
    new-instance p1, Landroidx/compose/ui/viewinterop/b$f;

    .line 183
    .line 184
    invoke-direct {p1, p0, p5}, Landroidx/compose/ui/viewinterop/b$f;-><init>(Landroidx/compose/ui/viewinterop/b;LK0/J;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p5, p1}, LK0/J;->W1(Lkotlin/jvm/functions/Function1;)V

    .line 188
    .line 189
    .line 190
    new-instance p1, Landroidx/compose/ui/viewinterop/b$g;

    .line 191
    .line 192
    invoke-direct {p1, p0}, Landroidx/compose/ui/viewinterop/b$g;-><init>(Landroidx/compose/ui/viewinterop/b;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p5, p1}, LK0/J;->X1(Lkotlin/jvm/functions/Function1;)V

    .line 196
    .line 197
    .line 198
    new-instance p1, Landroidx/compose/ui/viewinterop/b$h;

    .line 199
    .line 200
    invoke-direct {p1, p0, p5}, Landroidx/compose/ui/viewinterop/b$h;-><init>(Landroidx/compose/ui/viewinterop/b;LK0/J;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p5, p1}, LK0/J;->o(LI0/B;)V

    .line 204
    .line 205
    .line 206
    iput-object p5, p0, Landroidx/compose/ui/viewinterop/b;->z:LK0/J;

    .line 207
    .line 208
    return-void
.end method

.method private final A(Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/core/view/L0;->n()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    move-object/from16 v1, p0

    .line 10
    .line 11
    goto/16 :goto_1

    .line 12
    .line 13
    :cond_0
    move-object/from16 v1, p0

    .line 14
    .line 15
    iget-object v2, v1, Landroidx/compose/ui/viewinterop/b;->z:LK0/J;

    .line 16
    .line 17
    invoke-virtual {v2}, LK0/J;->X()LK0/e0;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, LK0/e0;->b()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-static {v2}, LI0/q;->e(LI0/p;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    invoke-static {v3, v4}, Li1/o;->d(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    invoke-static {v3, v4}, Li1/n;->k(J)I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-gez v5, :cond_2

    .line 41
    .line 42
    const/4 v5, 0x0

    .line 43
    :cond_2
    invoke-static {v3, v4}, Li1/n;->l(J)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-gez v3, :cond_3

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    :cond_3
    invoke-static {v2}, LI0/q;->d(LI0/p;)LI0/p;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-interface {v4}, LI0/p;->a()J

    .line 55
    .line 56
    .line 57
    move-result-wide v7

    .line 58
    const/16 v4, 0x20

    .line 59
    .line 60
    shr-long v9, v7, v4

    .line 61
    .line 62
    long-to-int v9, v9

    .line 63
    const-wide v10, 0xffffffffL

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    and-long/2addr v7, v10

    .line 69
    long-to-int v7, v7

    .line 70
    invoke-virtual {v2}, LK0/e0;->a()J

    .line 71
    .line 72
    .line 73
    move-result-wide v12

    .line 74
    shr-long v14, v12, v4

    .line 75
    .line 76
    long-to-int v8, v14

    .line 77
    and-long/2addr v12, v10

    .line 78
    long-to-int v12, v12

    .line 79
    int-to-float v8, v8

    .line 80
    int-to-float v12, v12

    .line 81
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    int-to-long v13, v8

    .line 86
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    move v15, v7

    .line 91
    int-to-long v6, v8

    .line 92
    shl-long/2addr v13, v4

    .line 93
    and-long/2addr v6, v10

    .line 94
    or-long/2addr v6, v13

    .line 95
    invoke-static {v6, v7}, Lr0/f;->e(J)J

    .line 96
    .line 97
    .line 98
    move-result-wide v6

    .line 99
    invoke-virtual {v2, v6, v7}, LK0/e0;->E0(J)J

    .line 100
    .line 101
    .line 102
    move-result-wide v6

    .line 103
    invoke-static {v6, v7}, Li1/o;->d(J)J

    .line 104
    .line 105
    .line 106
    move-result-wide v6

    .line 107
    invoke-static {v6, v7}, Li1/n;->k(J)I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    sub-int/2addr v9, v2

    .line 112
    if-gez v9, :cond_4

    .line 113
    .line 114
    const/4 v9, 0x0

    .line 115
    :cond_4
    invoke-static {v6, v7}, Li1/n;->l(J)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    sub-int v7, v15, v2

    .line 120
    .line 121
    if-gez v7, :cond_5

    .line 122
    .line 123
    const/4 v6, 0x0

    .line 124
    goto :goto_0

    .line 125
    :cond_5
    move v6, v7

    .line 126
    :goto_0
    if-nez v5, :cond_6

    .line 127
    .line 128
    if-nez v3, :cond_6

    .line 129
    .line 130
    if-nez v9, :cond_6

    .line 131
    .line 132
    if-nez v6, :cond_6

    .line 133
    .line 134
    :goto_1
    return-object v0

    .line 135
    :cond_6
    invoke-virtual {v0, v5, v3, v9, v6}, Landroidx/core/view/L0;->o(IIII)Landroidx/core/view/L0;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    return-object v0
.end method

.method private static final C(Lie/a;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final D(III)I
    .locals 2

    .line 1
    const/high16 v0, 0x40000000    # 2.0f

    .line 2
    .line 3
    if-gez p3, :cond_3

    .line 4
    .line 5
    if-ne p1, p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, -0x2

    .line 9
    const v1, 0x7fffffff

    .line 10
    .line 11
    .line 12
    if-ne p3, p1, :cond_1

    .line 13
    .line 14
    if-eq p2, v1, :cond_1

    .line 15
    .line 16
    const/high16 p1, -0x80000000

    .line 17
    .line 18
    invoke-static {p2, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_1
    const/4 p1, -0x1

    .line 24
    if-ne p3, p1, :cond_2

    .line 25
    .line 26
    if-eq p2, v1, :cond_2

    .line 27
    .line 28
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1

    .line 33
    :cond_2
    const/4 p1, 0x0

    .line 34
    invoke-static {p1, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    return p1

    .line 39
    :cond_3
    :goto_0
    invoke-static {p3, p1, p2}, Loe/j;->m(III)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1
.end method

.method public static synthetic b(Lie/a;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/viewinterop/b;->C(Lie/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic c(Landroidx/compose/ui/viewinterop/b;)LD0/b;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/b;->b:LD0/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(Landroidx/compose/ui/viewinterop/b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/compose/ui/viewinterop/b;->f:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic f(Landroidx/compose/ui/viewinterop/b;)Landroidx/core/view/L0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/b;->q:Landroidx/core/view/L0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/viewinterop/b;->C:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method private final getSnapshotObserver()LK0/r0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "Expected AndroidViewHolder to be attached when observing reads."

    .line 8
    .line 9
    invoke-static {v0}, LH0/a;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->d:LK0/p0;

    .line 13
    .line 14
    invoke-interface {v0}, LK0/p0;->getSnapshotObserver()LK0/r0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public static final synthetic l(Landroidx/compose/ui/viewinterop/b;)LK0/p0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/b;->d:LK0/p0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic p(Landroidx/compose/ui/viewinterop/b;)[I
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/b;->o:[I

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic q(Landroidx/compose/ui/viewinterop/b;)Lie/a;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/b;->r:Lie/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic r(Landroidx/compose/ui/viewinterop/b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/viewinterop/b;->p:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic s(Landroidx/compose/ui/viewinterop/b;)LK0/r0;
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/viewinterop/b;->getSnapshotObserver()LK0/r0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic t(Landroidx/compose/ui/viewinterop/b;Landroidx/core/view/p0$a;)Landroidx/core/view/p0$a;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/ui/viewinterop/b;->z(Landroidx/core/view/p0$a;)Landroidx/core/view/p0$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic u(Landroidx/compose/ui/viewinterop/b;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/ui/viewinterop/b;->A(Landroidx/core/view/L0;)Landroidx/core/view/L0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic v(Landroidx/compose/ui/viewinterop/b;III)I
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/viewinterop/b;->D(III)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic w(Landroidx/compose/ui/viewinterop/b;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/ui/viewinterop/b;->y:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic x(Landroidx/compose/ui/viewinterop/b;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/ui/viewinterop/b;->p:J

    .line 2
    .line 3
    return-void
.end method

.method private final y(LA1/b;IIII)LA1/b;
    .locals 2

    .line 1
    iget v0, p1, LA1/b;->a:I

    .line 2
    .line 3
    sub-int/2addr v0, p2

    .line 4
    const/4 p2, 0x0

    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    move v0, p2

    .line 8
    :cond_0
    iget v1, p1, LA1/b;->b:I

    .line 9
    .line 10
    sub-int/2addr v1, p3

    .line 11
    if-gez v1, :cond_1

    .line 12
    .line 13
    move v1, p2

    .line 14
    :cond_1
    iget p3, p1, LA1/b;->c:I

    .line 15
    .line 16
    sub-int/2addr p3, p4

    .line 17
    if-gez p3, :cond_2

    .line 18
    .line 19
    move p3, p2

    .line 20
    :cond_2
    iget p1, p1, LA1/b;->d:I

    .line 21
    .line 22
    sub-int/2addr p1, p5

    .line 23
    if-gez p1, :cond_3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    move p2, p1

    .line 27
    :goto_0
    invoke-static {v0, v1, p3, p2}, LA1/b;->c(IIII)LA1/b;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method private final z(Landroidx/core/view/p0$a;)Landroidx/core/view/p0$a;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/compose/ui/viewinterop/b;->z:LK0/J;

    .line 4
    .line 5
    invoke-virtual {v1}, LK0/J;->X()LK0/e0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, LK0/e0;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_2

    .line 16
    .line 17
    :cond_0
    invoke-static {v1}, LI0/q;->e(LI0/p;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    invoke-static {v2, v3}, Li1/o;->d(J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    invoke-static {v2, v3}, Li1/n;->k(J)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const/4 v5, 0x0

    .line 30
    if-gez v4, :cond_1

    .line 31
    .line 32
    move v4, v5

    .line 33
    :cond_1
    invoke-static {v2, v3}, Li1/n;->l(J)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-gez v2, :cond_2

    .line 38
    .line 39
    move v3, v5

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    move v3, v2

    .line 42
    :goto_0
    invoke-static {v1}, LI0/q;->d(LI0/p;)LI0/p;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-interface {v2}, LI0/p;->a()J

    .line 47
    .line 48
    .line 49
    move-result-wide v6

    .line 50
    const/16 v2, 0x20

    .line 51
    .line 52
    shr-long v8, v6, v2

    .line 53
    .line 54
    long-to-int v8, v8

    .line 55
    const-wide v9, 0xffffffffL

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    and-long/2addr v6, v9

    .line 61
    long-to-int v6, v6

    .line 62
    invoke-virtual {v1}, LK0/e0;->a()J

    .line 63
    .line 64
    .line 65
    move-result-wide v11

    .line 66
    shr-long v13, v11, v2

    .line 67
    .line 68
    long-to-int v7, v13

    .line 69
    and-long/2addr v11, v9

    .line 70
    long-to-int v11, v11

    .line 71
    int-to-float v7, v7

    .line 72
    int-to-float v11, v11

    .line 73
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    int-to-long v12, v7

    .line 78
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    int-to-long v14, v7

    .line 83
    shl-long v11, v12, v2

    .line 84
    .line 85
    and-long/2addr v9, v14

    .line 86
    or-long/2addr v9, v11

    .line 87
    invoke-static {v9, v10}, Lr0/f;->e(J)J

    .line 88
    .line 89
    .line 90
    move-result-wide v9

    .line 91
    invoke-virtual {v1, v9, v10}, LK0/e0;->E0(J)J

    .line 92
    .line 93
    .line 94
    move-result-wide v1

    .line 95
    invoke-static {v1, v2}, Li1/o;->d(J)J

    .line 96
    .line 97
    .line 98
    move-result-wide v1

    .line 99
    invoke-static {v1, v2}, Li1/n;->k(J)I

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    sub-int/2addr v8, v7

    .line 104
    if-gez v8, :cond_3

    .line 105
    .line 106
    move v8, v5

    .line 107
    :cond_3
    invoke-static {v1, v2}, Li1/n;->l(J)I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    sub-int/2addr v6, v1

    .line 112
    if-gez v6, :cond_4

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_4
    move v5, v6

    .line 116
    :goto_1
    if-nez v4, :cond_5

    .line 117
    .line 118
    if-nez v3, :cond_5

    .line 119
    .line 120
    if-nez v8, :cond_5

    .line 121
    .line 122
    if-nez v5, :cond_5

    .line 123
    .line 124
    :goto_2
    return-object p1

    .line 125
    :cond_5
    new-instance v6, Landroidx/core/view/p0$a;

    .line 126
    .line 127
    invoke-virtual/range {p1 .. p1}, Landroidx/core/view/p0$a;->a()LA1/b;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    move v2, v4

    .line 132
    move v4, v8

    .line 133
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/viewinterop/b;->y(LA1/b;IIII)LA1/b;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    invoke-virtual/range {p1 .. p1}, Landroidx/core/view/p0$a;->b()LA1/b;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    move-object/from16 v0, p0

    .line 142
    .line 143
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/viewinterop/b;->y(LA1/b;IIII)LA1/b;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-direct {v6, v7, v1}, Landroidx/core/view/p0$a;-><init>(LA1/b;LA1/b;)V

    .line 148
    .line 149
    .line 150
    return-object v6
.end method


# virtual methods
.method public final B()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/viewinterop/b;->y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->c:Landroid/view/View;

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/b;->s:Lie/a;

    .line 8
    .line 9
    new-instance v2, Landroidx/compose/ui/viewinterop/a;

    .line 10
    .line 11
    invoke-direct {v2, v1}, Landroidx/compose/ui/viewinterop/a;-><init>(Lie/a;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->z:LK0/J;

    .line 19
    .line 20
    invoke-virtual {v0}, LK0/J;->P0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public E()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->c:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eq v0, p0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->c:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->g:Lie/a;

    .line 16
    .line 17
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final F()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/compose/ui/viewinterop/b;->v:I

    .line 2
    .line 3
    const/high16 v1, -0x80000000

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    iget v2, p0, Landroidx/compose/ui/viewinterop/b;->w:I

    .line 8
    .line 9
    if-ne v2, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0, v0, v2}, Landroid/view/View;->measure(II)V

    .line 13
    .line 14
    .line 15
    :cond_1
    :goto_0
    return-void
.end method

.method public J0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->h:Lie/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 0

    .line 1
    new-instance p1, Landroidx/core/view/L0;

    .line 2
    .line 3
    invoke-direct {p1, p2}, Landroidx/core/view/L0;-><init>(Landroidx/core/view/L0;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/b;->q:Landroidx/core/view/L0;

    .line 7
    .line 8
    invoke-direct {p0, p2}, Landroidx/compose/ui/viewinterop/b;->A(Landroidx/core/view/L0;)Landroidx/core/view/L0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public gatherTransparentRegion(Landroid/graphics/Region;)Z
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/b;->u:[I

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/b;->u:[I

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aget v4, v1, v2

    .line 14
    .line 15
    aget v5, v1, v0

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    add-int v6, v4, v1

    .line 22
    .line 23
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/b;->u:[I

    .line 24
    .line 25
    aget v1, v1, v0

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    add-int v7, v1, v2

    .line 32
    .line 33
    sget-object v8, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 34
    .line 35
    move-object v3, p1

    .line 36
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Region;->op(IIIILandroid/graphics/Region$Op;)Z

    .line 37
    .line 38
    .line 39
    return v0
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final getDensity()Li1/d;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->k:Li1/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getInteropView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->c:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLayoutNode()LK0/J;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->z:LK0/J;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->c:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-object v0
.end method

.method public final getLifecycleOwner()Landroidx/lifecycle/r;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->m:Landroidx/lifecycle/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getModifier()Landroidx/compose/ui/e;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->i:Landroidx/compose/ui/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public getNestedScrollAxes()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->x:Landroidx/core/view/H;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/core/view/H;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getOnDensityChanged$ui_release()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->l:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOnModifierChanged$ui_release()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->j:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOnRequestDisallowInterceptTouchEvent$ui_release()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->t:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRelease()Lie/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lie/a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->h:Lie/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getReset()Lie/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lie/a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->g:Lie/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSavedStateRegistryOwner()LP3/i;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->n:LP3/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUpdate()Lie/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lie/a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->e:Lie/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->c:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->g:Lie/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViewsInLayout()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public i(Landroid/view/View;Landroid/view/View;II)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->x:Landroidx/core/view/H;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/core/view/H;->c(Landroid/view/View;Landroid/view/View;II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/b;->B()V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1
.end method

.method public isNestedScrollingEnabled()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->c:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isNestedScrollingEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public j(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->x:Landroidx/core/view/H;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroidx/core/view/H;->e(Landroid/view/View;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k(Landroid/view/View;II[II)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/b;->isNestedScrollingEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/viewinterop/b;->b:LD0/b;

    .line 9
    .line 10
    invoke-static {p2}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    invoke-static {p3}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    int-to-long v0, p2

    .line 23
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    int-to-long p2, p2

    .line 28
    const/16 v2, 0x20

    .line 29
    .line 30
    shl-long/2addr v0, v2

    .line 31
    const-wide v3, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr p2, v3

    .line 37
    or-long/2addr p2, v0

    .line 38
    invoke-static {p2, p3}, Lr0/f;->e(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide p2

    .line 42
    invoke-static {p5}, Landroidx/compose/ui/viewinterop/d;->e(I)I

    .line 43
    .line 44
    .line 45
    move-result p5

    .line 46
    invoke-virtual {p1, p2, p3, p5}, LD0/b;->d(JI)J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    shr-long v0, p1, v2

    .line 51
    .line 52
    long-to-int p3, v0

    .line 53
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    invoke-static {p3}, Landroidx/compose/ui/platform/d1;->b(F)I

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    const/4 p5, 0x0

    .line 62
    aput p3, p4, p5

    .line 63
    .line 64
    and-long/2addr p1, v3

    .line 65
    long-to-int p1, p1

    .line 66
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    invoke-static {p1}, Landroidx/compose/ui/platform/d1;->b(F)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    const/4 p2, 0x1

    .line 75
    aput p1, p4, p2

    .line 76
    .line 77
    return-void
.end method

.method public m(Landroid/view/View;IIIII[I)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/b;->isNestedScrollingEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->b:LD0/b;

    .line 9
    .line 10
    invoke-static {p2}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-static {p3}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    int-to-long v1, p1

    .line 23
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    int-to-long p1, p1

    .line 28
    const/16 p3, 0x20

    .line 29
    .line 30
    shl-long/2addr v1, p3

    .line 31
    const-wide v6, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr p1, v6

    .line 37
    or-long/2addr p1, v1

    .line 38
    invoke-static {p1, p2}, Lr0/f;->e(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    invoke-static {p4}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-static {p5}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    int-to-long p4, p1

    .line 55
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    int-to-long p1, p1

    .line 60
    shl-long/2addr p4, p3

    .line 61
    and-long/2addr p1, v6

    .line 62
    or-long/2addr p1, p4

    .line 63
    invoke-static {p1, p2}, Lr0/f;->e(J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v3

    .line 67
    invoke-static {p6}, Landroidx/compose/ui/viewinterop/d;->e(I)I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    invoke-virtual/range {v0 .. v5}, LD0/b;->b(JJI)J

    .line 72
    .line 73
    .line 74
    move-result-wide p1

    .line 75
    shr-long p3, p1, p3

    .line 76
    .line 77
    long-to-int p3, p3

    .line 78
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    invoke-static {p3}, Landroidx/compose/ui/platform/d1;->b(F)I

    .line 83
    .line 84
    .line 85
    move-result p3

    .line 86
    const/4 p4, 0x0

    .line 87
    aput p3, p7, p4

    .line 88
    .line 89
    and-long/2addr p1, v6

    .line 90
    long-to-int p1, p1

    .line 91
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    invoke-static {p1}, Landroidx/compose/ui/platform/d1;->b(F)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    const/4 p2, 0x1

    .line 100
    aput p1, p7, p2

    .line 101
    .line 102
    return-void
.end method

.method public n(Landroid/view/View;IIIII)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/b;->isNestedScrollingEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->b:LD0/b;

    .line 9
    .line 10
    invoke-static {p2}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-static {p3}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    int-to-long v1, p1

    .line 23
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    int-to-long p1, p1

    .line 28
    const/16 p3, 0x20

    .line 29
    .line 30
    shl-long/2addr v1, p3

    .line 31
    const-wide v3, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr p1, v3

    .line 37
    or-long/2addr p1, v1

    .line 38
    invoke-static {p1, p2}, Lr0/f;->e(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    invoke-static {p4}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-static {p5}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    int-to-long p4, p1

    .line 55
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    int-to-long p1, p1

    .line 60
    shl-long p3, p4, p3

    .line 61
    .line 62
    and-long/2addr p1, v3

    .line 63
    or-long/2addr p1, p3

    .line 64
    invoke-static {p1, p2}, Lr0/f;->e(J)J

    .line 65
    .line 66
    .line 67
    move-result-wide v3

    .line 68
    invoke-static {p6}, Landroidx/compose/ui/viewinterop/d;->e(I)I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    invoke-virtual/range {v0 .. v5}, LD0/b;->b(JJI)J

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public o(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    .line 1
    and-int/lit8 p1, p3, 0x2

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    if-nez p1, :cond_1

    .line 5
    .line 6
    and-int/lit8 p1, p3, 0x1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_1
    :goto_0
    return p2
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->r:Lie/a;

    .line 5
    .line 6
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/b;->B()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/compose/ui/viewinterop/b;->getSnapshotObserver()LK0/r0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p0}, LK0/r0;->a(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/compose/ui/viewinterop/b;->c:Landroid/view/View;

    .line 2
    .line 3
    sub-int/2addr p4, p2

    .line 4
    sub-int/2addr p5, p3

    .line 5
    const/4 p2, 0x0

    .line 6
    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->c:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eq v0, p0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->c:Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/16 v1, 0x8

    .line 28
    .line 29
    if-ne v0, v1, :cond_1

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->c:Landroid/view/View;

    .line 37
    .line 38
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->c:Landroid/view/View;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/b;->c:Landroid/view/View;

    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 54
    .line 55
    .line 56
    iput p1, p0, Landroidx/compose/ui/viewinterop/b;->v:I

    .line 57
    .line 58
    iput p2, p0, Landroidx/compose/ui/viewinterop/b;->w:I

    .line 59
    .line 60
    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .locals 13

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/b;->isNestedScrollingEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-static {p2}, Landroidx/compose/ui/viewinterop/d;->d(F)F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static/range {p3 .. p3}, Landroidx/compose/ui/viewinterop/d;->d(F)F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {p1, v1}, Li1/z;->a(FF)J

    .line 18
    .line 19
    .line 20
    move-result-wide v5

    .line 21
    iget-object p1, p0, Landroidx/compose/ui/viewinterop/b;->b:LD0/b;

    .line 22
    .line 23
    invoke-virtual {p1}, LD0/b;->e()LGf/O;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-instance v2, Landroidx/compose/ui/viewinterop/b$l;

    .line 28
    .line 29
    const/4 v7, 0x0

    .line 30
    move-object v4, p0

    .line 31
    move/from16 v3, p4

    .line 32
    .line 33
    invoke-direct/range {v2 .. v7}, Landroidx/compose/ui/viewinterop/b$l;-><init>(ZLandroidx/compose/ui/viewinterop/b;JLZd/e;)V

    .line 34
    .line 35
    .line 36
    const/4 v11, 0x3

    .line 37
    const/4 v12, 0x0

    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v9, 0x0

    .line 40
    move-object v7, p1

    .line 41
    move-object v10, v2

    .line 42
    invoke-static/range {v7 .. v12}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 43
    .line 44
    .line 45
    return v0
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/b;->isNestedScrollingEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-static {p2}, Landroidx/compose/ui/viewinterop/d;->d(F)F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p3}, Landroidx/compose/ui/viewinterop/d;->d(F)F

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-static {p1, p2}, Li1/z;->a(FF)J

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    iget-object p3, p0, Landroidx/compose/ui/viewinterop/b;->b:LD0/b;

    .line 22
    .line 23
    invoke-virtual {p3}, LD0/b;->e()LGf/O;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-instance v4, Landroidx/compose/ui/viewinterop/b$m;

    .line 28
    .line 29
    const/4 p3, 0x0

    .line 30
    invoke-direct {v4, p0, p1, p2, p3}, Landroidx/compose/ui/viewinterop/b$m;-><init>(Landroidx/compose/ui/viewinterop/b;JLZd/e;)V

    .line 31
    .line 32
    .line 33
    const/4 v5, 0x3

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v2, 0x0

    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 38
    .line 39
    .line 40
    return v0
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onWindowVisibilityChanged(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->t:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setDensity(Li1/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->k:Li1/d;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/b;->k:Li1/d;

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->l:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final setLifecycleOwner(Landroidx/lifecycle/r;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->m:Landroidx/lifecycle/r;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/b;->m:Landroidx/lifecycle/r;

    .line 6
    .line 7
    invoke-static {p0, p1}, Landroidx/lifecycle/Z;->b(Landroid/view/View;Landroidx/lifecycle/r;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setModifier(Landroidx/compose/ui/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->i:Landroidx/compose/ui/e;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/b;->i:Landroidx/compose/ui/e;

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->j:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final setOnDensityChanged$ui_release(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/b;->l:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method

.method public final setOnModifierChanged$ui_release(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/b;->j:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method

.method public final setOnRequestDisallowInterceptTouchEvent$ui_release(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/b;->t:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method

.method protected final setRelease(Lie/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lie/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/b;->h:Lie/a;

    .line 2
    .line 3
    return-void
.end method

.method protected final setReset(Lie/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lie/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/b;->g:Lie/a;

    .line 2
    .line 3
    return-void
.end method

.method public final setSavedStateRegistryOwner(LP3/i;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b;->n:LP3/i;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/b;->n:LP3/i;

    .line 6
    .line 7
    invoke-static {p0, p1}, LP3/m;->b(Landroid/view/View;LP3/i;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method protected final setUpdate(Lie/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lie/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/b;->e:Lie/a;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Landroidx/compose/ui/viewinterop/b;->f:Z

    .line 5
    .line 6
    iget-object p1, p0, Landroidx/compose/ui/viewinterop/b;->r:Lie/a;

    .line 7
    .line 8
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
