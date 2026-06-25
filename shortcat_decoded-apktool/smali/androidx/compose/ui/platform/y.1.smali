.class public final Landroidx/compose/ui/platform/y;
.super Landroidx/core/view/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/y$b;,
        Landroidx/compose/ui/platform/y$c;,
        Landroidx/compose/ui/platform/y$d;,
        Landroidx/compose/ui/platform/y$e;,
        Landroidx/compose/ui/platform/y$f;
    }
.end annotation


# static fields
.field public static final S:Landroidx/compose/ui/platform/y$d;

.field public static final T:I

.field private static final U:Lt/m;


# instance fields
.field private final A:Lt/b;

.field private final B:LIf/g;

.field private C:Z

.field private D:Landroidx/compose/ui/platform/y$f;

.field private E:Lt/o;

.field private F:Lt/G;

.field private G:Lt/D;

.field private H:Lt/D;

.field private final I:Ljava/lang/String;

.field private final J:Ljava/lang/String;

.field private final K:Ld1/w;

.field private L:Lt/F;

.field private M:Landroidx/compose/ui/platform/l1;

.field private N:Z

.field private final O:Lt/D;

.field private final P:Ljava/lang/Runnable;

.field private final Q:Ljava/util/List;

.field private final R:Lkotlin/jvm/functions/Function1;

.field private final d:Landroidx/compose/ui/platform/AndroidComposeView;

.field private e:I

.field private f:Lkotlin/jvm/functions/Function1;

.field private final g:Landroid/view/accessibility/AccessibilityManager;

.field private h:Z

.field private i:J

.field private final j:Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

.field private final k:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

.field private l:Ljava/util/List;

.field private m:Ljava/lang/Boolean;

.field private final n:Landroid/os/Handler;

.field private o:Landroidx/compose/ui/platform/y$e;

.field private p:I

.field private q:I

.field private r:LL1/B;

.field private s:LL1/B;

.field private t:Z

.field private final u:Lt/F;

.field private final v:Lt/F;

.field private w:Lt/j0;

.field private x:Lt/j0;

.field private y:I

.field private z:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 33

    .line 1
    new-instance v0, Landroidx/compose/ui/platform/y$d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/y$d;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/ui/platform/y;->S:Landroidx/compose/ui/platform/y$d;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Landroidx/compose/ui/platform/y;->T:I

    .line 12
    .line 13
    sget v1, Ll0/l;->a:I

    .line 14
    .line 15
    sget v2, Ll0/l;->b:I

    .line 16
    .line 17
    sget v3, Ll0/l;->m:I

    .line 18
    .line 19
    sget v4, Ll0/l;->x:I

    .line 20
    .line 21
    sget v5, Ll0/l;->A:I

    .line 22
    .line 23
    sget v6, Ll0/l;->B:I

    .line 24
    .line 25
    sget v7, Ll0/l;->C:I

    .line 26
    .line 27
    sget v8, Ll0/l;->D:I

    .line 28
    .line 29
    sget v9, Ll0/l;->E:I

    .line 30
    .line 31
    sget v10, Ll0/l;->F:I

    .line 32
    .line 33
    sget v11, Ll0/l;->c:I

    .line 34
    .line 35
    sget v12, Ll0/l;->d:I

    .line 36
    .line 37
    sget v13, Ll0/l;->e:I

    .line 38
    .line 39
    sget v14, Ll0/l;->f:I

    .line 40
    .line 41
    sget v15, Ll0/l;->g:I

    .line 42
    .line 43
    sget v16, Ll0/l;->h:I

    .line 44
    .line 45
    sget v17, Ll0/l;->i:I

    .line 46
    .line 47
    sget v18, Ll0/l;->j:I

    .line 48
    .line 49
    sget v19, Ll0/l;->k:I

    .line 50
    .line 51
    sget v20, Ll0/l;->l:I

    .line 52
    .line 53
    sget v21, Ll0/l;->n:I

    .line 54
    .line 55
    sget v22, Ll0/l;->o:I

    .line 56
    .line 57
    sget v23, Ll0/l;->p:I

    .line 58
    .line 59
    sget v24, Ll0/l;->q:I

    .line 60
    .line 61
    sget v25, Ll0/l;->r:I

    .line 62
    .line 63
    sget v26, Ll0/l;->s:I

    .line 64
    .line 65
    sget v27, Ll0/l;->t:I

    .line 66
    .line 67
    sget v28, Ll0/l;->u:I

    .line 68
    .line 69
    sget v29, Ll0/l;->v:I

    .line 70
    .line 71
    sget v30, Ll0/l;->w:I

    .line 72
    .line 73
    sget v31, Ll0/l;->y:I

    .line 74
    .line 75
    sget v32, Ll0/l;->z:I

    .line 76
    .line 77
    filled-new-array/range {v1 .. v32}, [I

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v0}, Lt/n;->a([I)Lt/m;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sput-object v0, Landroidx/compose/ui/platform/y;->U:Lt/m;

    .line 86
    .line 87
    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Landroidx/core/view/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 5
    .line 6
    const/high16 v0, -0x80000000

    .line 7
    .line 8
    iput v0, p0, Landroidx/compose/ui/platform/y;->e:I

    .line 9
    .line 10
    new-instance v1, Landroidx/compose/ui/platform/y$h;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Landroidx/compose/ui/platform/y$h;-><init>(Landroidx/compose/ui/platform/y;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Landroidx/compose/ui/platform/y;->f:Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "accessibility"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager"

    .line 28
    .line 29
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    .line 33
    .line 34
    iput-object v1, p0, Landroidx/compose/ui/platform/y;->g:Landroid/view/accessibility/AccessibilityManager;

    .line 35
    .line 36
    const-wide/16 v2, 0x64

    .line 37
    .line 38
    iput-wide v2, p0, Landroidx/compose/ui/platform/y;->i:J

    .line 39
    .line 40
    new-instance v2, Landroidx/compose/ui/platform/v;

    .line 41
    .line 42
    invoke-direct {v2, p0}, Landroidx/compose/ui/platform/v;-><init>(Landroidx/compose/ui/platform/y;)V

    .line 43
    .line 44
    .line 45
    iput-object v2, p0, Landroidx/compose/ui/platform/y;->j:Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

    .line 46
    .line 47
    new-instance v2, Landroidx/compose/ui/platform/w;

    .line 48
    .line 49
    invoke-direct {v2, p0}, Landroidx/compose/ui/platform/w;-><init>(Landroidx/compose/ui/platform/y;)V

    .line 50
    .line 51
    .line 52
    iput-object v2, p0, Landroidx/compose/ui/platform/y;->k:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    .line 53
    .line 54
    const/4 v2, -0x1

    .line 55
    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iput-object v1, p0, Landroidx/compose/ui/platform/y;->l:Ljava/util/List;

    .line 60
    .line 61
    new-instance v1, Landroid/os/Handler;

    .line 62
    .line 63
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 68
    .line 69
    .line 70
    iput-object v1, p0, Landroidx/compose/ui/platform/y;->n:Landroid/os/Handler;

    .line 71
    .line 72
    new-instance v1, Landroidx/compose/ui/platform/y$e;

    .line 73
    .line 74
    invoke-direct {v1, p0}, Landroidx/compose/ui/platform/y$e;-><init>(Landroidx/compose/ui/platform/y;)V

    .line 75
    .line 76
    .line 77
    iput-object v1, p0, Landroidx/compose/ui/platform/y;->o:Landroidx/compose/ui/platform/y$e;

    .line 78
    .line 79
    iput v0, p0, Landroidx/compose/ui/platform/y;->p:I

    .line 80
    .line 81
    iput v0, p0, Landroidx/compose/ui/platform/y;->q:I

    .line 82
    .line 83
    new-instance v0, Lt/F;

    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    const/4 v3, 0x1

    .line 87
    const/4 v4, 0x0

    .line 88
    invoke-direct {v0, v1, v3, v4}, Lt/F;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, Landroidx/compose/ui/platform/y;->u:Lt/F;

    .line 92
    .line 93
    new-instance v0, Lt/F;

    .line 94
    .line 95
    invoke-direct {v0, v1, v3, v4}, Lt/F;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 96
    .line 97
    .line 98
    iput-object v0, p0, Landroidx/compose/ui/platform/y;->v:Lt/F;

    .line 99
    .line 100
    new-instance v0, Lt/j0;

    .line 101
    .line 102
    invoke-direct {v0, v1, v3, v4}, Lt/j0;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 103
    .line 104
    .line 105
    iput-object v0, p0, Landroidx/compose/ui/platform/y;->w:Lt/j0;

    .line 106
    .line 107
    new-instance v0, Lt/j0;

    .line 108
    .line 109
    invoke-direct {v0, v1, v3, v4}, Lt/j0;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 110
    .line 111
    .line 112
    iput-object v0, p0, Landroidx/compose/ui/platform/y;->x:Lt/j0;

    .line 113
    .line 114
    iput v2, p0, Landroidx/compose/ui/platform/y;->y:I

    .line 115
    .line 116
    new-instance v0, Lt/b;

    .line 117
    .line 118
    invoke-direct {v0, v1, v3, v4}, Lt/b;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 119
    .line 120
    .line 121
    iput-object v0, p0, Landroidx/compose/ui/platform/y;->A:Lt/b;

    .line 122
    .line 123
    const/4 v0, 0x6

    .line 124
    invoke-static {v3, v4, v4, v0, v4}, LIf/j;->b(ILIf/a;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LIf/g;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iput-object v0, p0, Landroidx/compose/ui/platform/y;->B:LIf/g;

    .line 129
    .line 130
    iput-boolean v3, p0, Landroidx/compose/ui/platform/y;->C:Z

    .line 131
    .line 132
    invoke-static {}, Lt/p;->b()Lt/o;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    iput-object v0, p0, Landroidx/compose/ui/platform/y;->E:Lt/o;

    .line 137
    .line 138
    new-instance v0, Lt/G;

    .line 139
    .line 140
    invoke-direct {v0, v1, v3, v4}, Lt/G;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 141
    .line 142
    .line 143
    iput-object v0, p0, Landroidx/compose/ui/platform/y;->F:Lt/G;

    .line 144
    .line 145
    new-instance v0, Lt/D;

    .line 146
    .line 147
    invoke-direct {v0, v1, v3, v4}, Lt/D;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 148
    .line 149
    .line 150
    iput-object v0, p0, Landroidx/compose/ui/platform/y;->G:Lt/D;

    .line 151
    .line 152
    new-instance v0, Lt/D;

    .line 153
    .line 154
    invoke-direct {v0, v1, v3, v4}, Lt/D;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 155
    .line 156
    .line 157
    iput-object v0, p0, Landroidx/compose/ui/platform/y;->H:Lt/D;

    .line 158
    .line 159
    const-string v0, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL"

    .line 160
    .line 161
    iput-object v0, p0, Landroidx/compose/ui/platform/y;->I:Ljava/lang/String;

    .line 162
    .line 163
    const-string v0, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL"

    .line 164
    .line 165
    iput-object v0, p0, Landroidx/compose/ui/platform/y;->J:Ljava/lang/String;

    .line 166
    .line 167
    new-instance v0, Ld1/w;

    .line 168
    .line 169
    invoke-direct {v0}, Ld1/w;-><init>()V

    .line 170
    .line 171
    .line 172
    iput-object v0, p0, Landroidx/compose/ui/platform/y;->K:Ld1/w;

    .line 173
    .line 174
    invoke-static {}, Lt/p;->c()Lt/F;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    iput-object v0, p0, Landroidx/compose/ui/platform/y;->L:Lt/F;

    .line 179
    .line 180
    new-instance v0, Landroidx/compose/ui/platform/l1;

    .line 181
    .line 182
    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()LR0/v;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-virtual {v1}, LR0/v;->d()LR0/s;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-static {}, Lt/p;->b()Lt/o;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-direct {v0, v1, v2}, Landroidx/compose/ui/platform/l1;-><init>(LR0/s;Lt/o;)V

    .line 195
    .line 196
    .line 197
    iput-object v0, p0, Landroidx/compose/ui/platform/y;->M:Landroidx/compose/ui/platform/l1;

    .line 198
    .line 199
    invoke-static {}, Lt/k;->a()Lt/D;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    iput-object v0, p0, Landroidx/compose/ui/platform/y;->O:Lt/D;

    .line 204
    .line 205
    new-instance v0, Landroidx/compose/ui/platform/y$a;

    .line 206
    .line 207
    invoke-direct {v0, p0}, Landroidx/compose/ui/platform/y$a;-><init>(Landroidx/compose/ui/platform/y;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 211
    .line 212
    .line 213
    new-instance p1, Landroidx/compose/ui/platform/x;

    .line 214
    .line 215
    invoke-direct {p1, p0}, Landroidx/compose/ui/platform/x;-><init>(Landroidx/compose/ui/platform/y;)V

    .line 216
    .line 217
    .line 218
    iput-object p1, p0, Landroidx/compose/ui/platform/y;->P:Ljava/lang/Runnable;

    .line 219
    .line 220
    new-instance p1, Ljava/util/ArrayList;

    .line 221
    .line 222
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 223
    .line 224
    .line 225
    iput-object p1, p0, Landroidx/compose/ui/platform/y;->Q:Ljava/util/List;

    .line 226
    .line 227
    new-instance p1, Landroidx/compose/ui/platform/y$j;

    .line 228
    .line 229
    invoke-direct {p1, p0}, Landroidx/compose/ui/platform/y$j;-><init>(Landroidx/compose/ui/platform/y;)V

    .line 230
    .line 231
    .line 232
    iput-object p1, p0, Landroidx/compose/ui/platform/y;->R:Lkotlin/jvm/functions/Function1;

    .line 233
    .line 234
    return-void
.end method

.method public static final synthetic A(Landroidx/compose/ui/platform/y;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/y;->n:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method private static final A0(LR0/j;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LR0/j;->c()Lie/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p0}, LR0/j;->a()Lie/a;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    cmpg-float v0, v0, v1

    .line 30
    .line 31
    if-gez v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, LR0/j;->b()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    :cond_0
    invoke-virtual {p0}, LR0/j;->c()Lie/a;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v1, 0x0

    .line 54
    cmpl-float v0, v0, v1

    .line 55
    .line 56
    if-lez v0, :cond_2

    .line 57
    .line 58
    invoke-virtual {p0}, LR0/j;->b()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_2

    .line 63
    .line 64
    :cond_1
    const/4 p0, 0x1

    .line 65
    return p0

    .line 66
    :cond_2
    const/4 p0, 0x0

    .line 67
    return p0
.end method

.method public static final synthetic B(Landroidx/compose/ui/platform/y;)Lt/F;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/y;->u:Lt/F;

    .line 2
    .line 3
    return-object p0
.end method

.method private final B0(ILjava/util/List;)Z
    .locals 7

    .line 1
    invoke-static {p2, p1}, Landroidx/compose/ui/platform/m1;->a(Ljava/util/List;I)Landroidx/compose/ui/platform/k1;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, Landroidx/compose/ui/platform/k1;

    .line 10
    .line 11
    iget-object v2, p0, Landroidx/compose/ui/platform/y;->Q:Ljava/util/List;

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    move v1, p1

    .line 18
    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/platform/k1;-><init>(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;LR0/j;LR0/j;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    move-object p2, v0

    .line 23
    :goto_0
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->Q:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    return p1
.end method

.method public static final synthetic C(Landroidx/compose/ui/platform/y;)Lt/F;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/y;->v:Lt/F;

    .line 2
    .line 3
    return-object p0
.end method

.method private final C0(I)Z
    .locals 7

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/platform/y;->r0()Z

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    invoke-direct/range {p0 .. p1}, Landroidx/compose/ui/platform/y;->n0(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_2

    .line 14
    .line 15
    iget v1, p0, Landroidx/compose/ui/platform/y;->p:I

    .line 16
    .line 17
    const/high16 v2, -0x80000000

    .line 18
    .line 19
    if-eq v1, v2, :cond_1

    .line 20
    .line 21
    const/16 v5, 0xc

    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    const/high16 v2, 0x10000

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    move-object v0, p0

    .line 29
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/y;->J0(Landroidx/compose/ui/platform/y;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    :cond_1
    iput p1, p0, Landroidx/compose/ui/platform/y;->p:I

    .line 33
    .line 34
    iget-object v2, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    .line 37
    .line 38
    .line 39
    const/16 v5, 0xc

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    const v2, 0x8000

    .line 43
    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    const/4 v4, 0x0

    .line 47
    move-object v0, p0

    .line 48
    move v1, p1

    .line 49
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/y;->J0(Landroidx/compose/ui/platform/y;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    return v0

    .line 54
    :cond_2
    return v2
.end method

.method public static final synthetic D(Landroidx/compose/ui/platform/y;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/y;->P:Ljava/lang/Runnable;

    .line 2
    .line 3
    return-object p0
.end method

.method private final D0(Landroidx/compose/ui/platform/k1;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroidx/compose/ui/platform/k1;->J0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSnapshotObserver()LK0/r0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Landroidx/compose/ui/platform/y;->R:Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    new-instance v2, Landroidx/compose/ui/platform/y$i;

    .line 17
    .line 18
    invoke-direct {v2, p1, p0}, Landroidx/compose/ui/platform/y$i;-><init>(Landroidx/compose/ui/platform/k1;Landroidx/compose/ui/platform/y;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1, v1, v2}, LK0/r0;->i(LK0/q0;Lkotlin/jvm/functions/Function1;Lie/a;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static final synthetic E(Landroidx/compose/ui/platform/y;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/compose/ui/platform/y;->t:Z

    .line 2
    .line 3
    return p0
.end method

.method private static final E0(Landroidx/compose/ui/platform/y;)V
    .locals 4

    .line 1
    const-string v0, "measureAndLayout"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {v0, v3, v1, v2}, LK0/p0;->j(LK0/p0;ZILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    .line 16
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 17
    .line 18
    .line 19
    const-string v0, "checkForSemanticsChanges"

    .line 20
    .line 21
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :try_start_1
    invoke-direct {p0}, Landroidx/compose/ui/platform/y;->S()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    .line 26
    .line 27
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 28
    .line 29
    .line 30
    iput-boolean v3, p0, Landroidx/compose/ui/platform/y;->N:Z

    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 35
    .line 36
    .line 37
    throw p0

    .line 38
    :catchall_1
    move-exception p0

    .line 39
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 40
    .line 41
    .line 42
    throw p0
.end method

.method public static final synthetic F(Landroidx/compose/ui/platform/y;)Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/y;->k:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    .line 2
    .line 3
    return-object p0
.end method

.method private final F0(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()LR0/v;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LR0/v;->d()LR0/s;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LR0/s;->q()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    const/4 p1, -0x1

    .line 18
    :cond_0
    return p1
.end method

.method public static final synthetic G(Landroidx/compose/ui/platform/y;LK0/J;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->s0(LK0/J;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final G0(LR0/s;Landroidx/compose/ui/platform/l1;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lt/r;->b()Lt/G;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual/range {p1 .. p1}, LR0/s;->v()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const/4 v4, 0x0

    .line 16
    move v5, v4

    .line 17
    :goto_0
    if-ge v5, v3, :cond_2

    .line 18
    .line 19
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    check-cast v6, LR0/s;

    .line 24
    .line 25
    invoke-direct {v0}, Landroidx/compose/ui/platform/y;->d0()Lt/o;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    invoke-virtual {v6}, LR0/s;->q()I

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    invoke-virtual {v7, v8}, Lt/o;->b(I)Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-eqz v7, :cond_1

    .line 38
    .line 39
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/platform/l1;->a()Lt/G;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    invoke-virtual {v6}, LR0/s;->q()I

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    invoke-virtual {v7, v8}, Lt/q;->a(I)Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-nez v7, :cond_0

    .line 52
    .line 53
    invoke-virtual/range {p1 .. p1}, LR0/s;->s()LK0/J;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/y;->s0(LK0/J;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_0
    invoke-virtual {v6}, LR0/s;->q()I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    invoke-virtual {v1, v6}, Lt/G;->g(I)Z

    .line 66
    .line 67
    .line 68
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/platform/l1;->a()Lt/G;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    iget-object v3, v2, Lt/q;->b:[I

    .line 76
    .line 77
    iget-object v2, v2, Lt/q;->a:[J

    .line 78
    .line 79
    array-length v5, v2

    .line 80
    add-int/lit8 v5, v5, -0x2

    .line 81
    .line 82
    if-ltz v5, :cond_6

    .line 83
    .line 84
    move v6, v4

    .line 85
    :goto_1
    aget-wide v7, v2, v6

    .line 86
    .line 87
    not-long v9, v7

    .line 88
    const/4 v11, 0x7

    .line 89
    shl-long/2addr v9, v11

    .line 90
    and-long/2addr v9, v7

    .line 91
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    and-long/2addr v9, v11

    .line 97
    cmp-long v9, v9, v11

    .line 98
    .line 99
    if-eqz v9, :cond_5

    .line 100
    .line 101
    sub-int v9, v6, v5

    .line 102
    .line 103
    not-int v9, v9

    .line 104
    ushr-int/lit8 v9, v9, 0x1f

    .line 105
    .line 106
    const/16 v10, 0x8

    .line 107
    .line 108
    rsub-int/lit8 v9, v9, 0x8

    .line 109
    .line 110
    move v11, v4

    .line 111
    :goto_2
    if-ge v11, v9, :cond_4

    .line 112
    .line 113
    const-wide/16 v12, 0xff

    .line 114
    .line 115
    and-long/2addr v12, v7

    .line 116
    const-wide/16 v14, 0x80

    .line 117
    .line 118
    cmp-long v12, v12, v14

    .line 119
    .line 120
    if-gez v12, :cond_3

    .line 121
    .line 122
    shl-int/lit8 v12, v6, 0x3

    .line 123
    .line 124
    add-int/2addr v12, v11

    .line 125
    aget v12, v3, v12

    .line 126
    .line 127
    invoke-virtual {v1, v12}, Lt/q;->a(I)Z

    .line 128
    .line 129
    .line 130
    move-result v12

    .line 131
    if-nez v12, :cond_3

    .line 132
    .line 133
    invoke-virtual/range {p1 .. p1}, LR0/s;->s()LK0/J;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/y;->s0(LK0/J;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :cond_3
    shr-long/2addr v7, v10

    .line 142
    add-int/lit8 v11, v11, 0x1

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_4
    if-ne v9, v10, :cond_6

    .line 146
    .line 147
    :cond_5
    if-eq v6, v5, :cond_6

    .line 148
    .line 149
    add-int/lit8 v6, v6, 0x1

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_6
    invoke-virtual/range {p1 .. p1}, LR0/s;->v()Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    :goto_3
    if-ge v4, v2, :cond_8

    .line 161
    .line 162
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    check-cast v3, LR0/s;

    .line 167
    .line 168
    iget-object v5, v0, Landroidx/compose/ui/platform/y;->L:Lt/F;

    .line 169
    .line 170
    invoke-virtual {v3}, LR0/s;->q()I

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    invoke-virtual {v5, v6}, Lt/o;->c(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    check-cast v5, Landroidx/compose/ui/platform/l1;

    .line 179
    .line 180
    if-eqz v5, :cond_7

    .line 181
    .line 182
    invoke-direct {v0}, Landroidx/compose/ui/platform/y;->d0()Lt/o;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    invoke-virtual {v3}, LR0/s;->q()I

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    invoke-virtual {v6, v7}, Lt/o;->b(I)Z

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    if-eqz v6, :cond_7

    .line 195
    .line 196
    invoke-direct {v0, v3, v5}, Landroidx/compose/ui/platform/y;->G0(LR0/s;Landroidx/compose/ui/platform/l1;)V

    .line 197
    .line 198
    .line 199
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_8
    return-void
.end method

.method public static final synthetic H(Landroidx/compose/ui/platform/y;IILandroid/os/Bundle;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/platform/y;->v0(IILandroid/os/Bundle;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final H0(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/y;->p0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v2, 0x800

    .line 14
    .line 15
    if-eq v0, v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const v2, 0x8000

    .line 22
    .line 23
    .line 24
    if-ne v0, v2, :cond_2

    .line 25
    .line 26
    :cond_1
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, Landroidx/compose/ui/platform/y;->t:Z

    .line 28
    .line 29
    :cond_2
    :try_start_0
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->f:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    iput-boolean v1, p0, Landroidx/compose/ui/platform/y;->t:Z

    .line 42
    .line 43
    return p1

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    iput-boolean v1, p0, Landroidx/compose/ui/platform/y;->t:Z

    .line 46
    .line 47
    throw p1
.end method

.method public static final synthetic I(Landroidx/compose/ui/platform/y;Landroidx/compose/ui/platform/k1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->D0(Landroidx/compose/ui/platform/k1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final I0(IILjava/lang/Integer;Ljava/util/List;)Z
    .locals 9

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    if-eq p1, v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/platform/y;->p0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/platform/y;->U(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p3, :cond_1

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    if-eqz p4, :cond_2

    .line 26
    .line 27
    const/16 v7, 0x3e

    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    const-string v1, ","

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    move-object v0, p4

    .line 38
    invoke-static/range {v0 .. v8}, Lk1/a;->e(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->H0(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    return p1

    .line 50
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 51
    return p1
.end method

.method public static final synthetic J(Landroidx/compose/ui/platform/y;I)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->F0(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic J0(Landroidx/compose/ui/platform/y;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z
    .locals 1

    .line 1
    and-int/lit8 p6, p5, 0x4

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p6, :cond_0

    .line 5
    .line 6
    move-object p3, v0

    .line 7
    :cond_0
    and-int/lit8 p5, p5, 0x8

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    move-object p4, v0

    .line 12
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/ui/platform/y;->I0(IILjava/lang/Integer;Ljava/util/List;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public static final synthetic K(Landroidx/compose/ui/platform/y;LL1/B;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/y;->r:LL1/B;

    .line 2
    .line 3
    return-void
.end method

.method private final K0(IILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->F0(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/16 v0, 0x20

    .line 6
    .line 7
    invoke-direct {p0, p1, v0}, Landroidx/compose/ui/platform/y;->U(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 12
    .line 13
    .line 14
    if-eqz p3, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->H0(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static final synthetic L(Landroidx/compose/ui/platform/y;LL1/B;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/y;->s:LL1/B;

    .line 2
    .line 3
    return-void
.end method

.method private final L0(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->D:Landroidx/compose/ui/platform/y$f;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/platform/y$f;->d()LR0/s;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, LR0/s;->q()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eq p1, v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    invoke-virtual {v0}, Landroidx/compose/ui/platform/y$f;->f()J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    sub-long/2addr v1, v3

    .line 25
    const-wide/16 v3, 0x3e8

    .line 26
    .line 27
    cmp-long p1, v1, v3

    .line 28
    .line 29
    if-gtz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/compose/ui/platform/y$f;->d()LR0/s;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, LR0/s;->q()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->F0(I)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    const/high16 v1, 0x20000

    .line 44
    .line 45
    invoke-direct {p0, p1, v1}, Landroidx/compose/ui/platform/y;->U(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {v0}, Landroidx/compose/ui/platform/y$f;->b()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Landroidx/compose/ui/platform/y$f;->e()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Landroidx/compose/ui/platform/y$f;->a()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setAction(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Landroidx/compose/ui/platform/y$f;->c()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setMovementGranularity(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v0}, Landroidx/compose/ui/platform/y$f;->d()LR0/s;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/y;->i0(LR0/s;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->H0(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 93
    .line 94
    .line 95
    :cond_1
    const/4 p1, 0x0

    .line 96
    iput-object p1, p0, Landroidx/compose/ui/platform/y;->D:Landroidx/compose/ui/platform/y$f;

    .line 97
    .line 98
    return-void
.end method

.method public static final synthetic M(Landroidx/compose/ui/platform/y;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/y;->l:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method private final M0(Lt/o;)V
    .locals 52

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    const/16 v1, 0x40

    .line 1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 2
    new-instance v8, Ljava/util/ArrayList;

    iget-object v1, v0, Landroidx/compose/ui/platform/y;->Q:Ljava/util/List;

    invoke-direct {v8, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 3
    iget-object v1, v0, Landroidx/compose/ui/platform/y;->Q:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 4
    iget-object v9, v7, Lt/o;->b:[I

    .line 5
    iget-object v10, v7, Lt/o;->a:[J

    .line 6
    array-length v1, v10

    const/4 v11, 0x2

    add-int/lit8 v12, v1, -0x2

    const/4 v13, 0x0

    .line 7
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    if-ltz v12, :cond_3c

    move v15, v13

    .line 8
    :goto_0
    aget-wide v1, v10, v15

    not-long v4, v1

    const/16 v16, 0x7

    shl-long v4, v4, v16

    and-long/2addr v4, v1

    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v4, v4, v17

    cmp-long v4, v4, v17

    if-eqz v4, :cond_3b

    sub-int v4, v15, v12

    not-int v4, v4

    ushr-int/lit8 v4, v4, 0x1f

    const/16 v5, 0x8

    rsub-int/lit8 v4, v4, 0x8

    move-wide/from16 v19, v1

    move v1, v13

    :goto_1
    if-ge v1, v4, :cond_3a

    const-wide/16 v21, 0xff

    and-long v23, v19, v21

    const-wide/16 v25, 0x80

    cmp-long v2, v23, v25

    if-gez v2, :cond_39

    shl-int/lit8 v2, v15, 0x3

    add-int/2addr v2, v1

    .line 9
    aget v2, v9, v2

    .line 10
    iget-object v6, v0, Landroidx/compose/ui/platform/y;->L:Lt/F;

    invoke-virtual {v6, v2}, Lt/o;->c(I)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v23, v6

    check-cast v23, Landroidx/compose/ui/platform/l1;

    if-nez v23, :cond_0

    move/from16 v40, v1

    move-object/from16 v42, v3

    move v7, v4

    move-object/from16 v29, v8

    move-object/from16 v30, v9

    move-object/from16 v33, v10

    move/from16 v28, v11

    move-object v3, v14

    goto/16 :goto_23

    .line 11
    :cond_0
    invoke-virtual {v7, v2}, Lt/o;->c(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LR0/u;

    const/16 v24, 0x0

    if-eqz v6, :cond_1

    invoke-virtual {v6}, LR0/u;->b()LR0/s;

    move-result-object v6

    goto :goto_2

    :cond_1
    move-object/from16 v6, v24

    :goto_2
    if-eqz v6, :cond_38

    .line 12
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v27

    move/from16 v28, v11

    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->t()Lt/P;

    move-result-object v11

    .line 13
    iget-object v13, v11, Lt/c0;->b:[Ljava/lang/Object;

    move/from16 v29, v4

    .line 14
    iget-object v4, v11, Lt/c0;->c:[Ljava/lang/Object;

    .line 15
    iget-object v11, v11, Lt/c0;->a:[J

    move/from16 v30, v5

    .line 16
    array-length v5, v11

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_34

    move-object/from16 v33, v3

    move-object/from16 v31, v4

    const/16 v32, 0x0

    const/16 v34, 0x0

    .line 17
    :goto_3
    aget-wide v3, v11, v34

    move/from16 v36, v5

    move-object/from16 v35, v6

    not-long v5, v3

    shl-long v5, v5, v16

    and-long/2addr v5, v3

    and-long v5, v5, v17

    cmp-long v5, v5, v17

    if-eqz v5, :cond_33

    sub-int v5, v34, v36

    not-int v5, v5

    ushr-int/lit8 v5, v5, 0x1f

    rsub-int/lit8 v5, v5, 0x8

    move-wide/from16 v37, v3

    const/4 v3, 0x0

    :goto_4
    if-ge v3, v5, :cond_32

    and-long v39, v37, v21

    cmp-long v4, v39, v25

    if-gez v4, :cond_31

    shl-int/lit8 v4, v34, 0x3

    add-int/2addr v4, v3

    .line 18
    aget-object v6, v13, v4

    aget-object v4, v31, v4

    check-cast v6, LR0/B;

    .line 19
    sget-object v39, LR0/x;->a:LR0/x;

    move/from16 v40, v1

    invoke-virtual/range {v39 .. v39}, LR0/x;->l()LR0/B;

    move-result-object v1

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 20
    invoke-virtual/range {v39 .. v39}, LR0/x;->O()LR0/B;

    move-result-object v1

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_5

    :cond_2
    const/4 v1, 0x0

    goto :goto_6

    .line 21
    :cond_3
    :goto_5
    invoke-direct {v0, v2, v8}, Landroidx/compose/ui/platform/y;->B0(ILjava/util/List;)Z

    move-result v1

    :goto_6
    if-nez v1, :cond_4

    .line 22
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/platform/l1;->b()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v1

    invoke-static {v1, v6}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_7
    goto/16 :goto_20

    .line 23
    :cond_4
    invoke-virtual/range {v39 .. v39}, LR0/x;->A()LR0/B;

    move-result-object v1

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 24
    const-string v1, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/String;

    .line 25
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/platform/l1;->b()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v1

    invoke-virtual/range {v39 .. v39}, LR0/x;->A()LR0/B;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    move-result v1

    if-eqz v1, :cond_5

    move/from16 v1, v30

    .line 26
    invoke-direct {v0, v2, v1, v4}, Landroidx/compose/ui/platform/y;->K0(IILjava/lang/String;)V

    goto :goto_8

    :cond_5
    move/from16 v1, v30

    :goto_8
    sget-object v4, LTd/L;->a:LTd/L;

    goto :goto_7

    .line 27
    :cond_6
    invoke-virtual/range {v39 .. v39}, LR0/x;->H()LR0/B;

    move-result-object v1

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 28
    invoke-virtual/range {v39 .. v39}, LR0/x;->M()LR0/B;

    move-result-object v1

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :cond_7
    move-object/from16 v30, v9

    move-object/from16 v41, v13

    move-object/from16 v45, v14

    move/from16 v7, v29

    move-object/from16 v42, v33

    move/from16 v9, v36

    const/4 v13, 0x0

    move/from16 v36, v3

    move-object/from16 v29, v8

    move-object/from16 v33, v10

    move/from16 v10, v34

    move v8, v2

    move-object/from16 v34, v11

    move v11, v5

    goto/16 :goto_1e

    .line 29
    :cond_8
    invoke-virtual/range {v39 .. v39}, LR0/x;->C()LR0/B;

    move-result-object v1

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 30
    invoke-direct {v0, v2}, Landroidx/compose/ui/platform/y;->F0(I)I

    move-result v1

    move v4, v5

    const/16 v5, 0x8

    const/4 v6, 0x0

    move/from16 v39, v2

    const/16 v2, 0x800

    move/from16 v41, v4

    const/4 v4, 0x0

    move-object/from16 v30, v9

    move/from16 v7, v29

    move/from16 v9, v36

    move/from16 v36, v3

    move-object/from16 v29, v8

    move-object/from16 v3, v33

    move/from16 v8, v39

    move-object/from16 v33, v10

    move/from16 v10, v34

    move-object/from16 v34, v11

    move/from16 v11, v41

    move-object/from16 v41, v13

    const/16 v13, 0x8

    .line 31
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/y;->J0(Landroidx/compose/ui/platform/y;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    move-object/from16 v42, v3

    .line 32
    invoke-direct {v0, v8}, Landroidx/compose/ui/platform/y;->F0(I)I

    move-result v1

    move-object v3, v14

    .line 33
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/y;->J0(Landroidx/compose/ui/platform/y;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    :goto_9
    const/4 v13, 0x0

    goto/16 :goto_1f

    :cond_9
    move-object/from16 v30, v9

    move-object/from16 v41, v13

    move/from16 v7, v29

    move-object/from16 v42, v33

    move/from16 v9, v36

    const/16 v13, 0x8

    move/from16 v36, v3

    move-object/from16 v29, v8

    move-object/from16 v33, v10

    move-object v3, v14

    move/from16 v10, v34

    move v8, v2

    move-object/from16 v34, v11

    move v11, v5

    .line 34
    invoke-virtual/range {v39 .. v39}, LR0/x;->F()LR0/B;

    move-result-object v1

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x4

    if-eqz v1, :cond_11

    .line 35
    invoke-virtual/range {v35 .. v35}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v1

    invoke-virtual/range {v39 .. v39}, LR0/x;->D()LR0/B;

    move-result-object v4

    invoke-static {v1, v4}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LR0/h;

    sget-object v4, LR0/h;->b:LR0/h$a;

    invoke-virtual {v4}, LR0/h$a;->h()I

    move-result v4

    if-nez v1, :cond_a

    const/4 v1, 0x0

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, LR0/h;->p()I

    move-result v1

    invoke-static {v1, v4}, LR0/h;->m(II)Z

    move-result v1

    :goto_a
    if-eqz v1, :cond_10

    .line 36
    invoke-virtual/range {v35 .. v35}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v1

    invoke-virtual/range {v39 .. v39}, LR0/x;->F()LR0/B;

    move-result-object v4

    invoke-static {v1, v4}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    move-result-object v1

    .line 37
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 38
    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 39
    invoke-direct {v0, v8}, Landroidx/compose/ui/platform/y;->F0(I)I

    move-result v1

    .line 40
    invoke-direct {v0, v1, v2}, Landroidx/compose/ui/platform/y;->U(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v1

    .line 41
    invoke-virtual/range {v35 .. v35}, LR0/s;->b()LR0/s;

    move-result-object v2

    .line 42
    invoke-virtual {v2}, LR0/s;->p()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v4

    .line 43
    invoke-virtual/range {v39 .. v39}, LR0/x;->d()LR0/B;

    move-result-object v5

    invoke-static {v4, v5}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v43, v4

    check-cast v43, Ljava/util/List;

    if-eqz v43, :cond_b

    const/16 v50, 0x3e

    const/16 v51, 0x0

    .line 44
    const-string v44, ","

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    invoke-static/range {v43 .. v51}, Lk1/a;->e(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_b

    :cond_b
    move-object/from16 v4, v24

    .line 45
    :goto_b
    invoke-virtual {v2}, LR0/s;->p()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v2

    .line 46
    invoke-virtual/range {v39 .. v39}, LR0/x;->J()LR0/B;

    move-result-object v5

    invoke-static {v2, v5}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v43, v2

    check-cast v43, Ljava/util/List;

    if-eqz v43, :cond_c

    const/16 v50, 0x3e

    const/16 v51, 0x0

    .line 47
    const-string v44, ","

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    invoke-static/range {v43 .. v51}, Lk1/a;->e(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_c

    :cond_c
    move-object/from16 v2, v24

    :goto_c
    if-eqz v4, :cond_d

    .line 48
    invoke-virtual {v1, v4}, Landroid/view/accessibility/AccessibilityRecord;->setContentDescription(Ljava/lang/CharSequence;)V

    sget-object v4, LTd/L;->a:LTd/L;

    :cond_d
    if-eqz v2, :cond_e

    .line 49
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    :cond_e
    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/y;->H0(Landroid/view/accessibility/AccessibilityEvent;)Z

    goto/16 :goto_9

    .line 51
    :cond_f
    invoke-direct {v0, v8}, Landroidx/compose/ui/platform/y;->F0(I)I

    move-result v1

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/16 v2, 0x800

    const/4 v4, 0x0

    .line 52
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/y;->J0(Landroidx/compose/ui/platform/y;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    goto/16 :goto_9

    :cond_10
    move-object v14, v3

    .line 53
    invoke-direct {v0, v8}, Landroidx/compose/ui/platform/y;->F0(I)I

    move-result v1

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/16 v2, 0x800

    const/4 v4, 0x0

    move-object/from16 v3, v42

    .line 54
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/y;->J0(Landroidx/compose/ui/platform/y;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    .line 55
    invoke-direct {v0, v8}, Landroidx/compose/ui/platform/y;->F0(I)I

    move-result v1

    move-object v3, v14

    .line 56
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/y;->J0(Landroidx/compose/ui/platform/y;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    goto/16 :goto_9

    .line 57
    :cond_11
    invoke-virtual/range {v39 .. v39}, LR0/x;->d()LR0/B;

    move-result-object v1

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 58
    invoke-direct {v0, v8}, Landroidx/compose/ui/platform/y;->F0(I)I

    move-result v1

    .line 59
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 60
    const-string v5, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/util/List;

    const/16 v5, 0x800

    .line 61
    invoke-direct {v0, v1, v5, v2, v4}, Landroidx/compose/ui/platform/y;->I0(IILjava/lang/Integer;Ljava/util/List;)Z

    goto/16 :goto_9

    .line 62
    :cond_12
    invoke-virtual/range {v39 .. v39}, LR0/x;->g()LR0/B;

    move-result-object v1

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v2, 0x186a0

    const-string v5, ""

    if-eqz v1, :cond_20

    .line 63
    invoke-virtual/range {v35 .. v35}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v1

    sget-object v4, LR0/l;->a:LR0/l;

    invoke-virtual {v4}, LR0/l;->z()LR0/B;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    move-result v1

    if-eqz v1, :cond_1f

    .line 64
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/platform/l1;->b()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/y;->k0(Landroidx/compose/ui/semantics/SemanticsConfiguration;)LU0/e;

    move-result-object v1

    if-eqz v1, :cond_13

    goto :goto_d

    :cond_13
    move-object v1, v5

    .line 65
    :goto_d
    invoke-virtual/range {v35 .. v35}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v4

    invoke-direct {v0, v4}, Landroidx/compose/ui/platform/y;->k0(Landroidx/compose/ui/semantics/SemanticsConfiguration;)LU0/e;

    move-result-object v4

    if-eqz v4, :cond_14

    move-object v5, v4

    .line 66
    :cond_14
    invoke-direct {v0, v5, v2}, Landroidx/compose/ui/platform/y;->b1(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;

    move-result-object v2

    .line 67
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    .line 68
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v6

    .line 69
    invoke-static {v4, v6}, Loe/j;->i(II)I

    move-result v14

    const/4 v13, 0x0

    :goto_e
    move-object/from16 v45, v3

    if-ge v13, v14, :cond_16

    .line 70
    invoke-interface {v1, v13}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    move/from16 v39, v4

    invoke-interface {v5, v13}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    if-eq v3, v4, :cond_15

    goto :goto_f

    :cond_15
    add-int/lit8 v13, v13, 0x1

    move/from16 v4, v39

    move-object/from16 v3, v45

    goto :goto_e

    :cond_16
    move/from16 v39, v4

    :goto_f
    const/4 v3, 0x0

    :goto_10
    sub-int v4, v14, v13

    if-ge v3, v4, :cond_18

    add-int/lit8 v4, v39, -0x1

    sub-int/2addr v4, v3

    .line 71
    invoke-interface {v1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    add-int/lit8 v46, v6, -0x1

    move/from16 v47, v3

    sub-int v3, v46, v47

    .line 72
    invoke-interface {v5, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    if-eq v4, v3, :cond_17

    goto :goto_11

    :cond_17
    add-int/lit8 v3, v47, 0x1

    goto :goto_10

    :cond_18
    move/from16 v47, v3

    :goto_11
    sub-int v4, v39, v47

    sub-int/2addr v4, v13

    sub-int v3, v6, v47

    sub-int/2addr v3, v13

    .line 73
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/platform/l1;->b()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v5

    sget-object v14, LR0/x;->a:LR0/x;

    move/from16 v39, v6

    invoke-virtual {v14}, LR0/x;->B()LR0/B;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    move-result v5

    .line 74
    invoke-virtual/range {v35 .. v35}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v6

    move/from16 v46, v5

    invoke-virtual {v14}, LR0/x;->B()LR0/B;

    move-result-object v5

    invoke-virtual {v6, v5}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    move-result v5

    .line 75
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/platform/l1;->b()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v6

    move/from16 v47, v5

    invoke-virtual {v14}, LR0/x;->g()LR0/B;

    move-result-object v5

    invoke-virtual {v6, v5}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    move-result v5

    if-eqz v5, :cond_19

    if-nez v46, :cond_19

    if-eqz v47, :cond_19

    const/4 v6, 0x1

    goto :goto_12

    :cond_19
    const/4 v6, 0x0

    :goto_12
    if-eqz v5, :cond_1a

    if-eqz v46, :cond_1a

    if-nez v47, :cond_1a

    const/16 v43, 0x1

    goto :goto_13

    :cond_1a
    const/16 v43, 0x0

    :goto_13
    if-nez v6, :cond_1b

    if-eqz v43, :cond_1c

    :cond_1b
    move/from16 v46, v6

    goto :goto_14

    .line 76
    :cond_1c
    invoke-direct {v0, v8}, Landroidx/compose/ui/platform/y;->F0(I)I

    move-result v5

    move/from16 v46, v6

    const/16 v6, 0x10

    .line 77
    invoke-direct {v0, v5, v6}, Landroidx/compose/ui/platform/y;->U(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v5

    .line 78
    invoke-virtual {v5, v13}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 79
    invoke-virtual {v5, v4}, Landroid/view/accessibility/AccessibilityRecord;->setRemovedCount(I)V

    .line 80
    invoke-virtual {v5, v3}, Landroid/view/accessibility/AccessibilityRecord;->setAddedCount(I)V

    .line 81
    invoke-virtual {v5, v1}, Landroid/view/accessibility/AccessibilityRecord;->setBeforeText(Ljava/lang/CharSequence;)V

    .line 82
    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_15

    .line 83
    :goto_14
    invoke-direct {v0, v8}, Landroidx/compose/ui/platform/y;->F0(I)I

    move-result v1

    .line 84
    invoke-static/range {v39 .. v39}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v3, v45

    move-object v5, v2

    move-object/from16 v2, v45

    .line 85
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/y;->X(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v5

    .line 86
    :goto_15
    const-string v1, "android.widget.EditText"

    invoke-virtual {v5, v1}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 87
    invoke-direct {v0, v5}, Landroidx/compose/ui/platform/y;->H0(Landroid/view/accessibility/AccessibilityEvent;)Z

    if-nez v46, :cond_1d

    if-eqz v43, :cond_1e

    .line 88
    :cond_1d
    invoke-virtual/range {v35 .. v35}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v1

    invoke-virtual {v14}, LR0/x;->K()LR0/B;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->l(LR0/B;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LU0/W0;

    invoke-virtual {v1}, LU0/W0;->r()J

    move-result-wide v1

    .line 89
    invoke-static {v1, v2}, LU0/W0;->n(J)I

    move-result v3

    invoke-virtual {v5, v3}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 90
    invoke-static {v1, v2}, LU0/W0;->i(J)I

    move-result v1

    invoke-virtual {v5, v1}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 91
    invoke-direct {v0, v5}, Landroidx/compose/ui/platform/y;->H0(Landroid/view/accessibility/AccessibilityEvent;)Z

    :cond_1e
    sget-object v1, LTd/L;->a:LTd/L;

    :goto_16
    move-object/from16 v3, v45

    goto/16 :goto_9

    :cond_1f
    move-object/from16 v45, v3

    .line 92
    invoke-direct {v0, v8}, Landroidx/compose/ui/platform/y;->F0(I)I

    move-result v1

    .line 93
    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/16 v2, 0x800

    const/4 v4, 0x0

    .line 94
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/y;->J0(Landroidx/compose/ui/platform/y;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    goto :goto_16

    :cond_20
    move-object/from16 v45, v3

    .line 95
    invoke-virtual/range {v39 .. v39}, LR0/x;->K()LR0/B;

    move-result-object v1

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_23

    .line 96
    invoke-virtual/range {v35 .. v35}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/y;->k0(Landroidx/compose/ui/semantics/SemanticsConfiguration;)LU0/e;

    move-result-object v1

    if-eqz v1, :cond_22

    invoke-virtual {v1}, LU0/e;->j()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_21

    goto :goto_17

    :cond_21
    move-object v5, v1

    .line 97
    :cond_22
    :goto_17
    invoke-virtual/range {v35 .. v35}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v1

    invoke-virtual/range {v39 .. v39}, LR0/x;->K()LR0/B;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->l(LR0/B;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LU0/W0;

    invoke-virtual {v1}, LU0/W0;->r()J

    move-result-wide v3

    .line 98
    invoke-direct {v0, v8}, Landroidx/compose/ui/platform/y;->F0(I)I

    move-result v1

    .line 99
    invoke-static {v3, v4}, LU0/W0;->n(J)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 100
    invoke-static {v3, v4}, LU0/W0;->i(J)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 101
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 102
    invoke-direct {v0, v5, v2}, Landroidx/compose/ui/platform/y;->b1(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;

    move-result-object v5

    move-object v2, v6

    .line 103
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/y;->X(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v1

    .line 104
    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/y;->H0(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 105
    invoke-virtual/range {v35 .. v35}, LR0/s;->q()I

    move-result v1

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/y;->L0(I)V

    sget-object v1, LTd/L;->a:LTd/L;

    goto :goto_16

    .line 106
    :cond_23
    invoke-virtual/range {v39 .. v39}, LR0/x;->l()LR0/B;

    move-result-object v1

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    .line 107
    invoke-virtual/range {v39 .. v39}, LR0/x;->O()LR0/B;

    move-result-object v1

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_25

    :cond_24
    const/4 v13, 0x0

    goto/16 :goto_1c

    .line 108
    :cond_25
    invoke-virtual/range {v39 .. v39}, LR0/x;->i()LR0/B;

    move-result-object v1

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_27

    .line 109
    const-string v1, "null cannot be cast to non-null type kotlin.Boolean"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_26

    .line 110
    invoke-virtual/range {v35 .. v35}, LR0/s;->q()I

    move-result v1

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/y;->F0(I)I

    move-result v1

    const/16 v13, 0x8

    .line 111
    invoke-direct {v0, v1, v13}, Landroidx/compose/ui/platform/y;->U(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v1

    .line 112
    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/y;->H0(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 113
    :cond_26
    invoke-virtual/range {v35 .. v35}, LR0/s;->q()I

    move-result v1

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/y;->F0(I)I

    move-result v1

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/16 v2, 0x800

    const/4 v4, 0x0

    move-object/from16 v3, v45

    .line 114
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/y;->J0(Landroidx/compose/ui/platform/y;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    goto/16 :goto_9

    .line 115
    :cond_27
    sget-object v1, LR0/l;->a:LR0/l;

    invoke-virtual {v1}, LR0/l;->d()LR0/B;

    move-result-object v2

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2e

    .line 116
    invoke-virtual/range {v35 .. v35}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v2

    invoke-virtual {v1}, LR0/l;->d()LR0/B;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->l(LR0/B;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 117
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/platform/l1;->b()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v3

    invoke-virtual {v1}, LR0/l;->d()LR0/B;

    move-result-object v1

    invoke-static {v3, v1}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_2c

    .line 118
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 119
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v4

    if-gtz v4, :cond_2b

    .line 120
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 121
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v4

    if-gtz v4, :cond_2a

    .line 122
    invoke-interface {v3, v2}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_29

    invoke-interface {v2, v3}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_28

    goto :goto_18

    :cond_28
    const/16 v32, 0x0

    goto :goto_19

    :cond_29
    :goto_18
    const/16 v32, 0x1

    :goto_19
    const/4 v13, 0x0

    goto :goto_1a

    :cond_2a
    const/4 v13, 0x0

    .line 123
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 124
    invoke-static {v1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 125
    throw v24

    :cond_2b
    const/4 v13, 0x0

    .line 126
    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 127
    invoke-static {v1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 128
    throw v24

    :cond_2c
    const/4 v13, 0x0

    .line 129
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2d

    const/16 v32, 0x1

    .line 130
    :cond_2d
    :goto_1a
    sget-object v1, LTd/L;->a:LTd/L;

    goto :goto_1d

    :cond_2e
    const/4 v13, 0x0

    .line 131
    instance-of v1, v4, LR0/a;

    if-eqz v1, :cond_2f

    .line 132
    check-cast v4, LR0/a;

    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/platform/l1;->b()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v1

    invoke-static {v1, v6}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4, v1}, Landroidx/compose/ui/platform/z;->a(LR0/a;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    :cond_2f
    const/16 v32, 0x1

    goto :goto_1b

    :cond_30
    move/from16 v32, v13

    .line 133
    :goto_1b
    sget-object v1, LTd/L;->a:LTd/L;

    goto :goto_1d

    .line 134
    :goto_1c
    invoke-virtual/range {v35 .. v35}, LR0/s;->s()LK0/J;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/y;->s0(LK0/J;)V

    .line 135
    iget-object v1, v0, Landroidx/compose/ui/platform/y;->Q:Ljava/util/List;

    invoke-static {v1, v8}, Landroidx/compose/ui/platform/m1;->a(Ljava/util/List;I)Landroidx/compose/ui/platform/k1;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 136
    invoke-virtual/range {v35 .. v35}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v2

    .line 137
    invoke-virtual/range {v39 .. v39}, LR0/x;->l()LR0/B;

    move-result-object v3

    .line 138
    invoke-static {v2, v3}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LR0/j;

    .line 139
    invoke-virtual {v1, v2}, Landroidx/compose/ui/platform/k1;->f(LR0/j;)V

    .line 140
    invoke-virtual/range {v35 .. v35}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v2

    .line 141
    invoke-virtual/range {v39 .. v39}, LR0/x;->O()LR0/B;

    move-result-object v3

    .line 142
    invoke-static {v2, v3}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LR0/j;

    .line 143
    invoke-virtual {v1, v2}, Landroidx/compose/ui/platform/k1;->i(LR0/j;)V

    .line 144
    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/y;->D0(Landroidx/compose/ui/platform/k1;)V

    sget-object v1, LTd/L;->a:LTd/L;

    :goto_1d
    move-object/from16 v3, v45

    goto :goto_1f

    .line 145
    :goto_1e
    invoke-direct {v0, v8}, Landroidx/compose/ui/platform/y;->F0(I)I

    move-result v1

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/16 v2, 0x800

    const/4 v4, 0x0

    move-object/from16 v3, v42

    .line 146
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/y;->J0(Landroidx/compose/ui/platform/y;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    .line 147
    invoke-direct {v0, v8}, Landroidx/compose/ui/platform/y;->F0(I)I

    move-result v1

    move-object/from16 v3, v45

    .line 148
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/y;->J0(Landroidx/compose/ui/platform/y;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    :goto_1f
    const/16 v1, 0x8

    goto :goto_21

    :cond_31
    move/from16 v40, v1

    :goto_20
    move-object/from16 v30, v9

    move-object/from16 v41, v13

    move/from16 v7, v29

    move-object/from16 v42, v33

    move/from16 v9, v36

    const/4 v13, 0x0

    move/from16 v36, v3

    move-object/from16 v29, v8

    move-object/from16 v33, v10

    move-object v3, v14

    move/from16 v10, v34

    move v8, v2

    move-object/from16 v34, v11

    move v11, v5

    goto :goto_1f

    :goto_21
    shr-long v37, v37, v1

    add-int/lit8 v2, v36, 0x1

    move-object v14, v3

    move/from16 v36, v9

    move v5, v11

    move-object/from16 v9, v30

    move-object/from16 v11, v34

    move-object/from16 v13, v41

    move/from16 v30, v1

    move v3, v2

    move v2, v8

    move/from16 v34, v10

    move-object/from16 v8, v29

    move-object/from16 v10, v33

    move/from16 v1, v40

    move-object/from16 v33, v42

    move/from16 v29, v7

    move-object/from16 v7, p1

    goto/16 :goto_4

    :cond_32
    move/from16 v40, v1

    move-object/from16 v41, v13

    move-object v3, v14

    move/from16 v7, v29

    move/from16 v1, v30

    move-object/from16 v42, v33

    const/4 v13, 0x0

    move-object/from16 v29, v8

    move-object/from16 v30, v9

    move-object/from16 v33, v10

    move/from16 v10, v34

    move/from16 v9, v36

    move v8, v2

    move-object/from16 v34, v11

    move v11, v5

    if-ne v11, v1, :cond_35

    goto :goto_22

    :cond_33
    move/from16 v40, v1

    move-object/from16 v30, v9

    move-object/from16 v41, v13

    move-object v3, v14

    move/from16 v7, v29

    move-object/from16 v42, v33

    move/from16 v9, v36

    const/4 v13, 0x0

    move-object/from16 v29, v8

    move-object/from16 v33, v10

    move/from16 v10, v34

    move v8, v2

    move-object/from16 v34, v11

    :goto_22
    if-eq v10, v9, :cond_35

    add-int/lit8 v1, v10, 0x1

    move-object v14, v3

    move v2, v8

    move v5, v9

    move-object/from16 v8, v29

    move-object/from16 v9, v30

    move-object/from16 v10, v33

    move-object/from16 v11, v34

    move-object/from16 v6, v35

    move-object/from16 v13, v41

    move-object/from16 v33, v42

    const/16 v30, 0x8

    move/from16 v34, v1

    move/from16 v29, v7

    move/from16 v1, v40

    move-object/from16 v7, p1

    goto/16 :goto_3

    :cond_34
    move/from16 v40, v1

    move-object/from16 v42, v3

    move-object/from16 v35, v6

    move-object/from16 v30, v9

    move-object/from16 v33, v10

    move-object v3, v14

    move/from16 v7, v29

    const/4 v13, 0x0

    move-object/from16 v29, v8

    move v8, v2

    move/from16 v32, v13

    :cond_35
    if-nez v32, :cond_36

    .line 149
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/platform/l1;->b()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v1

    move-object/from16 v6, v35

    invoke-static {v6, v1}, Landroidx/compose/ui/platform/z;->j(LR0/s;Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z

    move-result v32

    :cond_36
    if-eqz v32, :cond_37

    .line 150
    invoke-direct {v0, v8}, Landroidx/compose/ui/platform/y;->F0(I)I

    move-result v1

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/16 v2, 0x800

    const/4 v4, 0x0

    .line 151
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/y;->J0(Landroidx/compose/ui/platform/y;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    :cond_37
    :goto_23
    const/16 v1, 0x8

    goto :goto_24

    .line 152
    :cond_38
    const-string v0, "no value for specified key"

    .line 153
    invoke-static {v0}, LH0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, LTd/k;

    invoke-direct {v0}, LTd/k;-><init>()V

    throw v0

    :cond_39
    move/from16 v40, v1

    move-object/from16 v42, v3

    move v7, v4

    move-object/from16 v29, v8

    move-object/from16 v30, v9

    move-object/from16 v33, v10

    move/from16 v28, v11

    move-object v3, v14

    move v1, v5

    :goto_24
    shr-long v19, v19, v1

    add-int/lit8 v0, v40, 0x1

    move v5, v1

    move-object v14, v3

    move v4, v7

    move/from16 v11, v28

    move-object/from16 v8, v29

    move-object/from16 v9, v30

    move-object/from16 v10, v33

    move-object/from16 v3, v42

    move-object/from16 v7, p1

    move v1, v0

    move-object/from16 v0, p0

    goto/16 :goto_1

    :cond_3a
    move-object/from16 v42, v3

    move v7, v4

    move v1, v5

    move-object/from16 v29, v8

    move-object/from16 v30, v9

    move-object/from16 v33, v10

    move/from16 v28, v11

    move-object v3, v14

    if-ne v7, v1, :cond_3c

    goto :goto_25

    :cond_3b
    move-object/from16 v42, v3

    move-object/from16 v29, v8

    move-object/from16 v30, v9

    move-object/from16 v33, v10

    move/from16 v28, v11

    move-object v3, v14

    :goto_25
    if-eq v15, v12, :cond_3c

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move-object v14, v3

    move/from16 v11, v28

    move-object/from16 v8, v29

    move-object/from16 v9, v30

    move-object/from16 v10, v33

    move-object/from16 v3, v42

    goto/16 :goto_0

    :cond_3c
    return-void
.end method

.method private final N(ILL1/B;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    invoke-direct {v0}, Landroidx/compose/ui/platform/y;->d0()Lt/o;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual {v4, v1}, Lt/o;->c(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, LR0/u;

    .line 18
    .line 19
    if-eqz v4, :cond_18

    .line 20
    .line 21
    invoke-virtual {v4}, LR0/u;->b()LR0/s;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    goto/16 :goto_7

    .line 28
    .line 29
    :cond_0
    invoke-direct {v0, v4}, Landroidx/compose/ui/platform/y;->i0(LR0/s;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    iget-object v6, v0, Landroidx/compose/ui/platform/y;->I:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v2, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    const/4 v7, -0x1

    .line 40
    if-eqz v6, :cond_1

    .line 41
    .line 42
    iget-object v3, v0, Landroidx/compose/ui/platform/y;->G:Lt/D;

    .line 43
    .line 44
    invoke-virtual {v3, v1, v7}, Lt/j;->e(II)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eq v1, v7, :cond_18

    .line 49
    .line 50
    invoke-virtual/range {p2 .. p2}, LL1/B;->A()Landroid/os/Bundle;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v3, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    iget-object v6, v0, Landroidx/compose/ui/platform/y;->J:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v2, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_2

    .line 65
    .line 66
    iget-object v3, v0, Landroidx/compose/ui/platform/y;->H:Lt/D;

    .line 67
    .line 68
    invoke-virtual {v3, v1, v7}, Lt/j;->e(II)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eq v1, v7, :cond_18

    .line 73
    .line 74
    invoke-virtual/range {p2 .. p2}, LL1/B;->A()Landroid/os/Bundle;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_2
    invoke-virtual {v4}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    sget-object v6, LR0/l;->a:LR0/l;

    .line 87
    .line 88
    invoke-virtual {v6}, LR0/l;->i()LR0/B;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-virtual {v1, v6}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    const/4 v6, 0x0

    .line 97
    if-eqz v1, :cond_9

    .line 98
    .line 99
    if-eqz v3, :cond_9

    .line 100
    .line 101
    const-string v1, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"

    .line 102
    .line 103
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_9

    .line 108
    .line 109
    const-string v1, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX"

    .line 110
    .line 111
    invoke-virtual {v3, v1, v7}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    const-string v8, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH"

    .line 116
    .line 117
    invoke-virtual {v3, v8, v7}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-lez v3, :cond_8

    .line 122
    .line 123
    if-ltz v1, :cond_8

    .line 124
    .line 125
    if-eqz v5, :cond_3

    .line 126
    .line 127
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    goto :goto_0

    .line 132
    :cond_3
    const v5, 0x7fffffff

    .line 133
    .line 134
    .line 135
    :goto_0
    if-lt v1, v5, :cond_4

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_4
    invoke-virtual {v4}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-static {v5}, Landroidx/compose/ui/platform/m1;->c(Landroidx/compose/ui/semantics/SemanticsConfiguration;)LU0/T0;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    if-nez v5, :cond_5

    .line 147
    .line 148
    goto/16 :goto_7

    .line 149
    .line 150
    :cond_5
    new-instance v7, Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 153
    .line 154
    .line 155
    move v8, v6

    .line 156
    :goto_1
    if-ge v8, v3, :cond_7

    .line 157
    .line 158
    add-int v9, v1, v8

    .line 159
    .line 160
    invoke-virtual {v5}, LU0/T0;->l()LU0/S0;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    invoke-virtual {v10}, LU0/S0;->j()LU0/e;

    .line 165
    .line 166
    .line 167
    move-result-object v10

    .line 168
    invoke-virtual {v10}, LU0/e;->length()I

    .line 169
    .line 170
    .line 171
    move-result v10

    .line 172
    if-lt v9, v10, :cond_6

    .line 173
    .line 174
    const/4 v9, 0x0

    .line 175
    invoke-interface {v7, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_6
    invoke-virtual {v5, v9}, LU0/T0;->d(I)Lr0/h;

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    invoke-direct {v0, v4, v9}, Landroidx/compose/ui/platform/y;->X0(LR0/s;Lr0/h;)Landroid/graphics/RectF;

    .line 184
    .line 185
    .line 186
    move-result-object v9

    .line 187
    invoke-interface {v7, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    :goto_2
    add-int/lit8 v8, v8, 0x1

    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_7
    invoke-virtual/range {p2 .. p2}, LL1/B;->A()Landroid/os/Bundle;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    new-array v3, v6, [Landroid/graphics/RectF;

    .line 198
    .line 199
    invoke-interface {v7, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    check-cast v3, [Landroid/os/Parcelable;

    .line 204
    .line 205
    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :cond_8
    :goto_3
    const-string v1, "AccessibilityDelegate"

    .line 210
    .line 211
    const-string v2, "Invalid arguments for accessibility character locations"

    .line 212
    .line 213
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :cond_9
    invoke-virtual {v4}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    sget-object v5, LR0/x;->a:LR0/x;

    .line 222
    .line 223
    invoke-virtual {v5}, LR0/x;->I()LR0/B;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    invoke-virtual {v1, v7}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    if-eqz v1, :cond_a

    .line 232
    .line 233
    if-eqz v3, :cond_a

    .line 234
    .line 235
    const-string v1, "androidx.compose.ui.semantics.testTag"

    .line 236
    .line 237
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    if-eqz v1, :cond_a

    .line 242
    .line 243
    invoke-virtual {v4}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-virtual {v5}, LR0/x;->I()LR0/B;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    invoke-static {v1, v3}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    check-cast v1, Ljava/lang/String;

    .line 256
    .line 257
    if-eqz v1, :cond_18

    .line 258
    .line 259
    invoke-virtual/range {p2 .. p2}, LL1/B;->A()Landroid/os/Bundle;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    invoke-virtual {v3, v2, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :cond_a
    const-string v1, "androidx.compose.ui.semantics.id"

    .line 268
    .line 269
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    if-eqz v1, :cond_b

    .line 274
    .line 275
    invoke-virtual/range {p2 .. p2}, LL1/B;->A()Landroid/os/Bundle;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-virtual {v4}, LR0/s;->q()I

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 284
    .line 285
    .line 286
    return-void

    .line 287
    :cond_b
    const-string v1, "androidx.compose.ui.semantics.shapeType"

    .line 288
    .line 289
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    const/4 v7, 0x2

    .line 294
    const-string v8, "androidx.compose.ui.semantics.shapeRegion"

    .line 295
    .line 296
    const-string v9, "androidx.compose.ui.semantics.shapeCorners"

    .line 297
    .line 298
    const-string v10, "androidx.compose.ui.semantics.shapeRect"

    .line 299
    .line 300
    if-eqz v3, :cond_f

    .line 301
    .line 302
    invoke-virtual {v4}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    invoke-virtual {v5}, LR0/x;->G()LR0/B;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    invoke-static {v2, v3}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    check-cast v2, Ls0/E1;

    .line 315
    .line 316
    if-eqz v2, :cond_18

    .line 317
    .line 318
    invoke-direct {v0, v2, v4}, Landroidx/compose/ui/platform/y;->W(Ls0/E1;LR0/s;)Ls0/i1;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    instance-of v3, v2, Ls0/i1$b;

    .line 323
    .line 324
    if-eqz v3, :cond_c

    .line 325
    .line 326
    invoke-virtual/range {p2 .. p2}, LL1/B;->A()Landroid/os/Bundle;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    invoke-virtual {v3, v1, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {p2 .. p2}, LL1/B;->A()Landroid/os/Bundle;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-direct {v0, v2}, Landroidx/compose/ui/platform/y;->U0(Ls0/i1;)Landroid/graphics/Rect;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    invoke-virtual {v1, v10, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 342
    .line 343
    .line 344
    return-void

    .line 345
    :cond_c
    instance-of v3, v2, Ls0/i1$c;

    .line 346
    .line 347
    if-eqz v3, :cond_d

    .line 348
    .line 349
    invoke-virtual/range {p2 .. p2}, LL1/B;->A()Landroid/os/Bundle;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    const/4 v4, 0x1

    .line 354
    invoke-virtual {v3, v1, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {p2 .. p2}, LL1/B;->A()Landroid/os/Bundle;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    invoke-direct {v0, v2}, Landroidx/compose/ui/platform/y;->U0(Ls0/i1;)Landroid/graphics/Rect;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    invoke-virtual {v1, v10, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {p2 .. p2}, LL1/B;->A()Landroid/os/Bundle;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    invoke-direct {v0, v2}, Landroidx/compose/ui/platform/y;->V0(Ls0/i1;)[F

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    invoke-virtual {v1, v9, v2}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    .line 377
    .line 378
    .line 379
    return-void

    .line 380
    :cond_d
    instance-of v3, v2, Ls0/i1$a;

    .line 381
    .line 382
    if-eqz v3, :cond_e

    .line 383
    .line 384
    invoke-virtual/range {p2 .. p2}, LL1/B;->A()Landroid/os/Bundle;

    .line 385
    .line 386
    .line 387
    move-result-object v3

    .line 388
    invoke-virtual {v3, v1, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {p2 .. p2}, LL1/B;->A()Landroid/os/Bundle;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-direct {v0, v2}, Landroidx/compose/ui/platform/y;->W0(Ls0/i1;)Landroid/graphics/Region;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    invoke-virtual {v1, v8, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 400
    .line 401
    .line 402
    return-void

    .line 403
    :cond_e
    new-instance v1, LTd/r;

    .line 404
    .line 405
    invoke-direct {v1}, LTd/r;-><init>()V

    .line 406
    .line 407
    .line 408
    throw v1

    .line 409
    :cond_f
    invoke-static {v2, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v1

    .line 413
    if-eqz v1, :cond_10

    .line 414
    .line 415
    invoke-virtual {v4}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    invoke-virtual {v5}, LR0/x;->G()LR0/B;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    invoke-static {v1, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    check-cast v1, Ls0/E1;

    .line 428
    .line 429
    if-eqz v1, :cond_18

    .line 430
    .line 431
    invoke-direct {v0, v1, v4}, Landroidx/compose/ui/platform/y;->W(Ls0/E1;LR0/s;)Ls0/i1;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/y;->U0(Ls0/i1;)Landroid/graphics/Rect;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    if-eqz v1, :cond_18

    .line 440
    .line 441
    invoke-virtual/range {p2 .. p2}, LL1/B;->A()Landroid/os/Bundle;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    invoke-virtual {v2, v10, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 446
    .line 447
    .line 448
    return-void

    .line 449
    :cond_10
    invoke-static {v2, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    move-result v1

    .line 453
    if-eqz v1, :cond_11

    .line 454
    .line 455
    invoke-virtual {v4}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    invoke-virtual {v5}, LR0/x;->G()LR0/B;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    invoke-static {v1, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    check-cast v1, Ls0/E1;

    .line 468
    .line 469
    if-eqz v1, :cond_18

    .line 470
    .line 471
    invoke-direct {v0, v1, v4}, Landroidx/compose/ui/platform/y;->W(Ls0/E1;LR0/s;)Ls0/i1;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/y;->V0(Ls0/i1;)[F

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    if-eqz v1, :cond_18

    .line 480
    .line 481
    invoke-virtual/range {p2 .. p2}, LL1/B;->A()Landroid/os/Bundle;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    invoke-virtual {v2, v9, v1}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    .line 486
    .line 487
    .line 488
    return-void

    .line 489
    :cond_11
    invoke-static {v2, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v1

    .line 493
    if-eqz v1, :cond_12

    .line 494
    .line 495
    invoke-virtual {v4}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    invoke-virtual {v5}, LR0/x;->G()LR0/B;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    invoke-static {v1, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    check-cast v1, Ls0/E1;

    .line 508
    .line 509
    if-eqz v1, :cond_18

    .line 510
    .line 511
    invoke-direct {v0, v1, v4}, Landroidx/compose/ui/platform/y;->W(Ls0/E1;LR0/s;)Ls0/i1;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/y;->W0(Ls0/i1;)Landroid/graphics/Region;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    if-eqz v1, :cond_18

    .line 520
    .line 521
    invoke-virtual/range {p2 .. p2}, LL1/B;->A()Landroid/os/Bundle;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    invoke-virtual {v2, v8, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 526
    .line 527
    .line 528
    return-void

    .line 529
    :cond_12
    invoke-virtual {v4}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    invoke-virtual {v1}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->n()Lt/e0;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    if-eqz v1, :cond_18

    .line 538
    .line 539
    iget-object v3, v1, Lt/e0;->b:[Ljava/lang/Object;

    .line 540
    .line 541
    iget-object v1, v1, Lt/e0;->a:[J

    .line 542
    .line 543
    array-length v5, v1

    .line 544
    sub-int/2addr v5, v7

    .line 545
    if-ltz v5, :cond_18

    .line 546
    .line 547
    move v7, v6

    .line 548
    :goto_4
    aget-wide v8, v1, v7

    .line 549
    .line 550
    not-long v10, v8

    .line 551
    const/4 v12, 0x7

    .line 552
    shl-long/2addr v10, v12

    .line 553
    and-long/2addr v10, v8

    .line 554
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    and-long/2addr v10, v12

    .line 560
    cmp-long v10, v10, v12

    .line 561
    .line 562
    if-eqz v10, :cond_17

    .line 563
    .line 564
    sub-int v10, v7, v5

    .line 565
    .line 566
    not-int v10, v10

    .line 567
    ushr-int/lit8 v10, v10, 0x1f

    .line 568
    .line 569
    const/16 v11, 0x8

    .line 570
    .line 571
    rsub-int/lit8 v10, v10, 0x8

    .line 572
    .line 573
    move v12, v6

    .line 574
    :goto_5
    if-ge v12, v10, :cond_16

    .line 575
    .line 576
    const-wide/16 v13, 0xff

    .line 577
    .line 578
    and-long/2addr v13, v8

    .line 579
    const-wide/16 v15, 0x80

    .line 580
    .line 581
    cmp-long v13, v13, v15

    .line 582
    .line 583
    if-gez v13, :cond_15

    .line 584
    .line 585
    shl-int/lit8 v13, v7, 0x3

    .line 586
    .line 587
    add-int/2addr v13, v12

    .line 588
    aget-object v13, v3, v13

    .line 589
    .line 590
    check-cast v13, LR0/B;

    .line 591
    .line 592
    invoke-virtual {v13}, LR0/B;->a()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v14

    .line 596
    invoke-static {v14, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 597
    .line 598
    .line 599
    move-result v15

    .line 600
    if-eqz v15, :cond_15

    .line 601
    .line 602
    invoke-virtual {v4}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 603
    .line 604
    .line 605
    move-result-object v15

    .line 606
    invoke-static {v15, v13}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v13

    .line 610
    instance-of v15, v13, Ljava/io/Serializable;

    .line 611
    .line 612
    if-eqz v15, :cond_13

    .line 613
    .line 614
    invoke-virtual/range {p2 .. p2}, LL1/B;->A()Landroid/os/Bundle;

    .line 615
    .line 616
    .line 617
    move-result-object v15

    .line 618
    check-cast v13, Ljava/io/Serializable;

    .line 619
    .line 620
    invoke-virtual {v15, v14, v13}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 621
    .line 622
    .line 623
    goto :goto_6

    .line 624
    :cond_13
    instance-of v15, v13, Landroid/os/Parcelable;

    .line 625
    .line 626
    if-eqz v15, :cond_14

    .line 627
    .line 628
    invoke-virtual/range {p2 .. p2}, LL1/B;->A()Landroid/os/Bundle;

    .line 629
    .line 630
    .line 631
    move-result-object v15

    .line 632
    check-cast v13, Landroid/os/Parcelable;

    .line 633
    .line 634
    invoke-virtual {v15, v14, v13}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 635
    .line 636
    .line 637
    goto :goto_6

    .line 638
    :cond_14
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 639
    .line 640
    const-string v2, "Accessibility extra values must be either Serializable or Parcelable."

    .line 641
    .line 642
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 643
    .line 644
    .line 645
    throw v1

    .line 646
    :cond_15
    :goto_6
    shr-long/2addr v8, v11

    .line 647
    add-int/lit8 v12, v12, 0x1

    .line 648
    .line 649
    goto :goto_5

    .line 650
    :cond_16
    if-ne v10, v11, :cond_18

    .line 651
    .line 652
    :cond_17
    if-eq v7, v5, :cond_18

    .line 653
    .line 654
    add-int/lit8 v7, v7, 0x1

    .line 655
    .line 656
    goto :goto_4

    .line 657
    :cond_18
    :goto_7
    return-void
.end method

.method private final N0(LK0/J;Lt/G;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, LK0/J;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/a0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroidx/compose/ui/platform/a0;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-virtual {p1}, LK0/J;->t0()LK0/c0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/16 v1, 0x8

    .line 30
    .line 31
    invoke-static {v1}, LK0/g0;->a(I)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-virtual {v0, v1}, LK0/c0;->q(I)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    sget-object v0, Landroidx/compose/ui/platform/y$l;->a:Landroidx/compose/ui/platform/y$l;

    .line 43
    .line 44
    invoke-static {p1, v0}, Landroidx/compose/ui/platform/z;->d(LK0/J;Lkotlin/jvm/functions/Function1;)LK0/J;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :goto_0
    if-eqz p1, :cond_6

    .line 49
    .line 50
    invoke-virtual {p1}, LK0/J;->e()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-virtual {v0}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->v()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_4

    .line 62
    .line 63
    sget-object v0, Landroidx/compose/ui/platform/y$k;->a:Landroidx/compose/ui/platform/y$k;

    .line 64
    .line 65
    invoke-static {p1, v0}, Landroidx/compose/ui/platform/z;->d(LK0/J;Lkotlin/jvm/functions/Function1;)LK0/J;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    move-object p1, v0

    .line 72
    :cond_4
    invoke-virtual {p1}, LK0/J;->y()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-virtual {p2, p1}, Lt/G;->g(I)Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    if-nez p2, :cond_5

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_5
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->F0(I)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    const/4 p1, 0x1

    .line 88
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    const/16 v5, 0x8

    .line 93
    .line 94
    const/4 v6, 0x0

    .line 95
    const/16 v2, 0x800

    .line 96
    .line 97
    const/4 v4, 0x0

    .line 98
    move-object v0, p0

    .line 99
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/y;->J0(Landroidx/compose/ui/platform/y;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    :cond_6
    :goto_1
    return-void
.end method

.method private final O(LR0/u;)Landroid/graphics/Rect;
    .locals 11

    .line 1
    invoke-virtual {p1}, LR0/u;->a()Li1/p;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 6
    .line 7
    invoke-virtual {p1}, Li1/p;->f()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    int-to-float v1, v1

    .line 12
    invoke-virtual {p1}, Li1/p;->h()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    int-to-float v2, v2

    .line 17
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    int-to-long v3, v1

    .line 22
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    int-to-long v1, v1

    .line 27
    const/16 v5, 0x20

    .line 28
    .line 29
    shl-long/2addr v3, v5

    .line 30
    const-wide v6, 0xffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    and-long/2addr v1, v6

    .line 36
    or-long/2addr v1, v3

    .line 37
    invoke-static {v1, v2}, Lr0/f;->e(J)J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->B(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    iget-object v2, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 46
    .line 47
    invoke-virtual {p1}, Li1/p;->g()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    int-to-float v3, v3

    .line 52
    invoke-virtual {p1}, Li1/p;->d()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    int-to-float p1, p1

    .line 57
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    int-to-long v3, v3

    .line 62
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    int-to-long v8, p1

    .line 67
    shl-long/2addr v3, v5

    .line 68
    and-long/2addr v8, v6

    .line 69
    or-long/2addr v3, v8

    .line 70
    invoke-static {v3, v4}, Lr0/f;->e(J)J

    .line 71
    .line 72
    .line 73
    move-result-wide v3

    .line 74
    invoke-virtual {v2, v3, v4}, Landroidx/compose/ui/platform/AndroidComposeView;->B(J)J

    .line 75
    .line 76
    .line 77
    move-result-wide v2

    .line 78
    new-instance p1, Landroid/graphics/Rect;

    .line 79
    .line 80
    shr-long v8, v0, v5

    .line 81
    .line 82
    long-to-int v4, v8

    .line 83
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    shr-long v9, v2, v5

    .line 88
    .line 89
    long-to-int v5, v9

    .line 90
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    invoke-static {v8, v9}, Ljava/lang/Math;->min(FF)F

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    float-to-double v8, v8

    .line 99
    invoke-static {v8, v9}, Ljava/lang/Math;->floor(D)D

    .line 100
    .line 101
    .line 102
    move-result-wide v8

    .line 103
    double-to-float v8, v8

    .line 104
    float-to-int v8, v8

    .line 105
    and-long/2addr v0, v6

    .line 106
    long-to-int v0, v0

    .line 107
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    and-long/2addr v2, v6

    .line 112
    long-to-int v2, v2

    .line 113
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    float-to-double v6, v1

    .line 122
    invoke-static {v6, v7}, Ljava/lang/Math;->floor(D)D

    .line 123
    .line 124
    .line 125
    move-result-wide v6

    .line 126
    double-to-float v1, v6

    .line 127
    float-to-int v1, v1

    .line 128
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    float-to-double v3, v3

    .line 141
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 142
    .line 143
    .line 144
    move-result-wide v3

    .line 145
    double-to-float v3, v3

    .line 146
    float-to-int v3, v3

    .line 147
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    float-to-double v4, v0

    .line 160
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 161
    .line 162
    .line 163
    move-result-wide v4

    .line 164
    double-to-float v0, v4

    .line 165
    float-to-int v0, v0

    .line 166
    invoke-direct {p1, v8, v1, v3, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 167
    .line 168
    .line 169
    return-object p1
.end method

.method private final O0(LK0/J;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, LK0/J;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/a0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroidx/compose/ui/platform/a0;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p1}, LK0/J;->y()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->u:Lt/F;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lt/o;->c(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, LR0/j;

    .line 36
    .line 37
    iget-object v1, p0, Landroidx/compose/ui/platform/y;->v:Lt/F;

    .line 38
    .line 39
    invoke-virtual {v1, p1}, Lt/o;->c(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, LR0/j;

    .line 44
    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    if-nez v1, :cond_2

    .line 48
    .line 49
    :goto_0
    return-void

    .line 50
    :cond_2
    const/16 v2, 0x1000

    .line 51
    .line 52
    invoke-direct {p0, p1, v2}, Landroidx/compose/ui/platform/y;->U(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    invoke-virtual {v0}, LR0/j;->c()Lie/a;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-interface {v2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    float-to-int v2, v2

    .line 73
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setScrollX(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, LR0/j;->a()Lie/a;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Ljava/lang/Number;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    float-to-int v0, v0

    .line 91
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setMaxScrollX(I)V

    .line 92
    .line 93
    .line 94
    :cond_3
    if-eqz v1, :cond_4

    .line 95
    .line 96
    invoke-virtual {v1}, LR0/j;->c()Lie/a;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Ljava/lang/Number;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    float-to-int v0, v0

    .line 111
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setScrollY(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, LR0/j;->a()Lie/a;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, Ljava/lang/Number;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    float-to-int v0, v0

    .line 129
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setMaxScrollY(I)V

    .line 130
    .line 131
    .line 132
    :cond_4
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->H0(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method private final P0(LR0/s;IIZ)Z
    .locals 9

    .line 1
    invoke-virtual {p1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LR0/l;->a:LR0/l;

    .line 6
    .line 7
    invoke-virtual {v1}, LR0/l;->y()LR0/B;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0, v2}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-static {p1}, Landroidx/compose/ui/platform/z;->b(LR0/s;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {v1}, LR0/l;->y()LR0/B;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p1, v0}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->l(LR0/B;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, LR0/a;

    .line 37
    .line 38
    invoke-virtual {p1}, LR0/a;->a()LTd/i;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Lie/o;

    .line 43
    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object p4

    .line 58
    invoke-interface {p1, p2, p3, p4}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    return p1

    .line 69
    :cond_0
    return v2

    .line 70
    :cond_1
    if-ne p2, p3, :cond_2

    .line 71
    .line 72
    iget p4, p0, Landroidx/compose/ui/platform/y;->y:I

    .line 73
    .line 74
    if-ne p3, p4, :cond_2

    .line 75
    .line 76
    return v2

    .line 77
    :cond_2
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->i0(LR0/s;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    if-nez v8, :cond_3

    .line 82
    .line 83
    return v2

    .line 84
    :cond_3
    if-ltz p2, :cond_4

    .line 85
    .line 86
    if-ne p2, p3, :cond_4

    .line 87
    .line 88
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result p4

    .line 92
    if-gt p3, p4, :cond_4

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_4
    const/4 p2, -0x1

    .line 96
    :goto_0
    iput p2, p0, Landroidx/compose/ui/platform/y;->y:I

    .line 97
    .line 98
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    const/4 p3, 0x1

    .line 103
    if-lez p2, :cond_5

    .line 104
    .line 105
    move v2, p3

    .line 106
    :cond_5
    invoke-virtual {p1}, LR0/s;->q()I

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    invoke-direct {p0, p2}, Landroidx/compose/ui/platform/y;->F0(I)I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    const/4 p2, 0x0

    .line 115
    if-eqz v2, :cond_6

    .line 116
    .line 117
    iget p4, p0, Landroidx/compose/ui/platform/y;->y:I

    .line 118
    .line 119
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object p4

    .line 123
    move-object v5, p4

    .line 124
    goto :goto_1

    .line 125
    :cond_6
    move-object v5, p2

    .line 126
    :goto_1
    if-eqz v2, :cond_7

    .line 127
    .line 128
    iget p4, p0, Landroidx/compose/ui/platform/y;->y:I

    .line 129
    .line 130
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object p4

    .line 134
    move-object v6, p4

    .line 135
    goto :goto_2

    .line 136
    :cond_7
    move-object v6, p2

    .line 137
    :goto_2
    if-eqz v2, :cond_8

    .line 138
    .line 139
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    :cond_8
    move-object v3, p0

    .line 148
    move-object v7, p2

    .line 149
    invoke-direct/range {v3 .. v8}, Landroidx/compose/ui/platform/y;->X(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    invoke-direct {p0, p2}, Landroidx/compose/ui/platform/y;->H0(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1}, LR0/s;->q()I

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->L0(I)V

    .line 161
    .line 162
    .line 163
    return p3
.end method

.method private final Q0(LR0/s;LL1/B;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LR0/x;->a:LR0/x;

    .line 6
    .line 7
    invoke-virtual {v1}, LR0/x;->h()LR0/B;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0, v2}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-virtual {p2, v0}, LL1/B;->E0(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v1}, LR0/x;->h()LR0/B;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {p1, v0}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Ljava/lang/CharSequence;

    .line 34
    .line 35
    invoke-virtual {p2, p1}, LL1/B;->I0(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
.end method

.method private final R(Lt/o;ZIJ)Z
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-wide/from16 v3, p4

    .line 8
    .line 9
    sget-object v5, Lr0/f;->b:Lr0/f$a;

    .line 10
    .line 11
    invoke-virtual {v5}, Lr0/f$a;->b()J

    .line 12
    .line 13
    .line 14
    move-result-wide v5

    .line 15
    invoke-static {v3, v4, v5, v6}, Lr0/f;->j(JJ)Z

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    if-nez v5, :cond_e

    .line 20
    .line 21
    const-wide v7, 0x7fffffff7fffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v7, v3

    .line 27
    const-wide v9, 0x7fffff007fffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    add-long/2addr v7, v9

    .line 33
    const-wide v9, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long/2addr v7, v9

    .line 39
    const-wide/16 v9, 0x0

    .line 40
    .line 41
    cmp-long v5, v7, v9

    .line 42
    .line 43
    if-nez v5, :cond_e

    .line 44
    .line 45
    const/4 v5, 0x1

    .line 46
    if-ne v1, v5, :cond_0

    .line 47
    .line 48
    sget-object v1, LR0/x;->a:LR0/x;

    .line 49
    .line 50
    invoke-virtual {v1}, LR0/x;->O()LR0/B;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    if-nez v1, :cond_d

    .line 56
    .line 57
    sget-object v1, LR0/x;->a:LR0/x;

    .line 58
    .line 59
    invoke-virtual {v1}, LR0/x;->l()LR0/B;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    :goto_0
    iget-object v7, v0, Lt/o;->c:[Ljava/lang/Object;

    .line 64
    .line 65
    iget-object v0, v0, Lt/o;->a:[J

    .line 66
    .line 67
    array-length v8, v0

    .line 68
    add-int/lit8 v8, v8, -0x2

    .line 69
    .line 70
    if-ltz v8, :cond_c

    .line 71
    .line 72
    const/4 v9, 0x0

    .line 73
    const/4 v10, 0x0

    .line 74
    :goto_1
    aget-wide v11, v0, v9

    .line 75
    .line 76
    not-long v13, v11

    .line 77
    const/4 v15, 0x7

    .line 78
    shl-long/2addr v13, v15

    .line 79
    and-long/2addr v13, v11

    .line 80
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    and-long/2addr v13, v15

    .line 86
    cmp-long v13, v13, v15

    .line 87
    .line 88
    if-eqz v13, :cond_a

    .line 89
    .line 90
    sub-int v13, v9, v8

    .line 91
    .line 92
    not-int v13, v13

    .line 93
    ushr-int/lit8 v13, v13, 0x1f

    .line 94
    .line 95
    const/16 v14, 0x8

    .line 96
    .line 97
    rsub-int/lit8 v13, v13, 0x8

    .line 98
    .line 99
    const/4 v15, 0x0

    .line 100
    :goto_2
    if-ge v15, v13, :cond_8

    .line 101
    .line 102
    const-wide/16 v16, 0xff

    .line 103
    .line 104
    and-long v16, v11, v16

    .line 105
    .line 106
    const-wide/16 v18, 0x80

    .line 107
    .line 108
    cmp-long v16, v16, v18

    .line 109
    .line 110
    if-gez v16, :cond_6

    .line 111
    .line 112
    shl-int/lit8 v16, v9, 0x3

    .line 113
    .line 114
    add-int v16, v16, v15

    .line 115
    .line 116
    aget-object v16, v7, v16

    .line 117
    .line 118
    check-cast v16, LR0/u;

    .line 119
    .line 120
    invoke-virtual/range {v16 .. v16}, LR0/u;->a()Li1/p;

    .line 121
    .line 122
    .line 123
    move-result-object v17

    .line 124
    invoke-static/range {v17 .. v17}, Li1/q;->c(Li1/p;)Lr0/h;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-virtual {v5, v3, v4}, Lr0/h;->b(J)Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    if-nez v5, :cond_1

    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_1
    invoke-virtual/range {v16 .. v16}, LR0/u;->b()LR0/s;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    invoke-virtual {v5}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-static {v5, v1}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    check-cast v5, LR0/j;

    .line 148
    .line 149
    if-nez v5, :cond_2

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_2
    invoke-virtual {v5}, LR0/j;->b()Z

    .line 153
    .line 154
    .line 155
    move-result v16

    .line 156
    if-eqz v16, :cond_3

    .line 157
    .line 158
    const/16 v16, 0x0

    .line 159
    .line 160
    neg-int v6, v2

    .line 161
    goto :goto_3

    .line 162
    :cond_3
    const/16 v16, 0x0

    .line 163
    .line 164
    move v6, v2

    .line 165
    :goto_3
    if-nez v2, :cond_4

    .line 166
    .line 167
    invoke-virtual {v5}, LR0/j;->b()Z

    .line 168
    .line 169
    .line 170
    move-result v17

    .line 171
    if-eqz v17, :cond_4

    .line 172
    .line 173
    const/4 v6, -0x1

    .line 174
    :cond_4
    if-gez v6, :cond_5

    .line 175
    .line 176
    invoke-virtual {v5}, LR0/j;->c()Lie/a;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    invoke-interface {v5}, Lie/a;->invoke()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    check-cast v5, Ljava/lang/Number;

    .line 185
    .line 186
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    const/4 v6, 0x0

    .line 191
    cmpl-float v5, v5, v6

    .line 192
    .line 193
    if-lez v5, :cond_7

    .line 194
    .line 195
    :goto_4
    const/4 v10, 0x1

    .line 196
    goto :goto_6

    .line 197
    :cond_5
    invoke-virtual {v5}, LR0/j;->c()Lie/a;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    invoke-interface {v6}, Lie/a;->invoke()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    check-cast v6, Ljava/lang/Number;

    .line 206
    .line 207
    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    invoke-virtual {v5}, LR0/j;->a()Lie/a;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    invoke-interface {v5}, Lie/a;->invoke()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    check-cast v5, Ljava/lang/Number;

    .line 220
    .line 221
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    cmpg-float v5, v6, v5

    .line 226
    .line 227
    if-gez v5, :cond_7

    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_6
    :goto_5
    const/16 v16, 0x0

    .line 231
    .line 232
    :cond_7
    :goto_6
    shr-long/2addr v11, v14

    .line 233
    add-int/lit8 v15, v15, 0x1

    .line 234
    .line 235
    const/4 v5, 0x1

    .line 236
    goto/16 :goto_2

    .line 237
    .line 238
    :cond_8
    const/16 v16, 0x0

    .line 239
    .line 240
    if-ne v13, v14, :cond_9

    .line 241
    .line 242
    goto :goto_7

    .line 243
    :cond_9
    return v10

    .line 244
    :cond_a
    const/16 v16, 0x0

    .line 245
    .line 246
    :goto_7
    if-eq v9, v8, :cond_b

    .line 247
    .line 248
    add-int/lit8 v9, v9, 0x1

    .line 249
    .line 250
    const/4 v5, 0x1

    .line 251
    goto/16 :goto_1

    .line 252
    .line 253
    :cond_b
    return v10

    .line 254
    :cond_c
    const/16 v16, 0x0

    .line 255
    .line 256
    return v16

    .line 257
    :cond_d
    new-instance v0, LTd/r;

    .line 258
    .line 259
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 260
    .line 261
    .line 262
    throw v0

    .line 263
    :cond_e
    const/16 v16, 0x0

    .line 264
    .line 265
    return v16
.end method

.method private final S()V
    .locals 2

    .line 1
    const-string v0, "sendAccessibilitySemanticsStructureChangeEvents"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/y;->p0()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()LR0/v;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, LR0/v;->d()LR0/s;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Landroidx/compose/ui/platform/y;->M:Landroidx/compose/ui/platform/l1;

    .line 23
    .line 24
    invoke-direct {p0, v0, v1}, Landroidx/compose/ui/platform/y;->G0(LR0/s;Landroidx/compose/ui/platform/l1;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 33
    .line 34
    .line 35
    const-string v0, "sendSemanticsPropertyChangeEvents"

    .line 36
    .line 37
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :try_start_1
    invoke-direct {p0}, Landroidx/compose/ui/platform/y;->d0()Lt/o;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/y;->M0(Lt/o;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 45
    .line 46
    .line 47
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 48
    .line 49
    .line 50
    const-string v0, "updateSemanticsNodesCopyAndPanes"

    .line 51
    .line 52
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :try_start_2
    invoke-direct {p0}, Landroidx/compose/ui/platform/y;->d1()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 56
    .line 57
    .line 58
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :catchall_1
    move-exception v0

    .line 63
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 64
    .line 65
    .line 66
    throw v0

    .line 67
    :catchall_2
    move-exception v0

    .line 68
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 69
    .line 70
    .line 71
    throw v0

    .line 72
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 73
    .line 74
    .line 75
    throw v0
.end method

.method private final S0(LR0/s;LL1/B;)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/compose/ui/platform/z;->g(LR0/s;)LU0/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->Y0(LU0/e;)Landroid/text/SpannableString;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    invoke-virtual {p2, p1}, LL1/B;->i1(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private final T(I)Z
    .locals 8

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->n0(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/high16 v0, -0x80000000

    .line 8
    .line 9
    iput v0, p0, Landroidx/compose/ui/platform/y;->p:I

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Landroidx/compose/ui/platform/y;->r:LL1/B;

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 17
    .line 18
    .line 19
    const/16 v6, 0xc

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    const/high16 v3, 0x10000

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    move-object v1, p0

    .line 27
    move v2, p1

    .line 28
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/platform/y;->J0(Landroidx/compose/ui/platform/y;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    return p1

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    return p1
.end method

.method private final T0(Lr0/h;)Landroid/graphics/Rect;
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p1}, Lr0/h;->i()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    float-to-int v1, v1

    .line 8
    invoke-virtual {p1}, Lr0/h;->l()F

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    float-to-int v2, v2

    .line 13
    invoke-virtual {p1}, Lr0/h;->j()F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    float-to-int v3, v3

    .line 18
    invoke-virtual {p1}, Lr0/h;->e()F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    float-to-int p1, p1

    .line 23
    invoke-direct {v0, v1, v2, v3, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method private final U(II)Landroid/view/accessibility/AccessibilityEvent;
    .locals 3

    .line 1
    invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setEnabled(Z)V

    .line 7
    .line 8
    .line 9
    const-string v0, "android.view.View"

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 28
    .line 29
    invoke-virtual {p2, v0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setSource(Landroid/view/View;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/compose/ui/platform/y;->p0()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    invoke-direct {p0}, Landroidx/compose/ui/platform/y;->d0()Lt/o;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0, p1}, Lt/o;->c(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, LR0/u;

    .line 47
    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    invoke-virtual {p1}, LR0/u;->b()LR0/s;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sget-object v1, LR0/x;->a:LR0/x;

    .line 59
    .line 60
    invoke-virtual {v1}, LR0/x;->B()LR0/B;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v0, v2}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setPassword(Z)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, LR0/u;->b()LR0/s;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {v1}, LR0/x;->u()LR0/B;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {p1, v0}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 88
    .line 89
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-static {p2, p1}, LL1/b;->b(Landroid/view/accessibility/AccessibilityEvent;Z)V

    .line 94
    .line 95
    .line 96
    :cond_0
    return-object p2
.end method

.method private final U0(Ls0/i1;)Landroid/graphics/Rect;
    .locals 1

    .line 1
    instance-of v0, p1, Ls0/i1$b;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p1, Ls0/i1$c;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return-object p1

    .line 12
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ls0/i1;->a()Lr0/h;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->T0(Lr0/h;)Landroid/graphics/Rect;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method private final V(I)LL1/B;
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getViewTreeOwners()Landroidx/compose/ui/platform/AndroidComposeView$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView$b;->a()Landroidx/lifecycle/r;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Landroidx/lifecycle/r;->getLifecycle()Landroidx/lifecycle/k;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/lifecycle/k;->getCurrentState()Landroidx/lifecycle/k$b;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v0, v1

    .line 28
    :goto_0
    sget-object v2, Landroidx/lifecycle/k$b;->a:Landroidx/lifecycle/k$b;

    .line 29
    .line 30
    if-ne v0, v2, :cond_1

    .line 31
    .line 32
    invoke-direct {p0}, Landroidx/compose/ui/platform/y;->Z()LL1/B;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_1
    invoke-direct {p0}, Landroidx/compose/ui/platform/y;->d0()Lt/o;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0, p1}, Lt/o;->c(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, LR0/u;

    .line 46
    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    invoke-direct {p0}, Landroidx/compose/ui/platform/y;->Z()LL1/B;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    :cond_2
    invoke-virtual {v0}, LR0/u;->b()LR0/s;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2}, LR0/s;->p()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    sget-object v4, LR0/x;->a:LR0/x;

    .line 63
    .line 64
    invoke-virtual {v4}, LR0/x;->u()LR0/B;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-static {v3, v4}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_3

    .line 79
    .line 80
    invoke-direct {p0}, Landroidx/compose/ui/platform/y;->q0()Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-nez v4, :cond_3

    .line 85
    .line 86
    return-object v1

    .line 87
    :cond_3
    invoke-static {}, LL1/B;->k0()LL1/B;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v4, v3}, LL1/B;->r0(Z)V

    .line 92
    .line 93
    .line 94
    const/4 v3, -0x1

    .line 95
    if-ne p1, v3, :cond_5

    .line 96
    .line 97
    iget-object v3, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 98
    .line 99
    invoke-virtual {v3}, Landroid/view/View;->getParentForAccessibility()Landroid/view/ViewParent;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    instance-of v5, v3, Landroid/view/View;

    .line 104
    .line 105
    if-eqz v5, :cond_4

    .line 106
    .line 107
    move-object v1, v3

    .line 108
    check-cast v1, Landroid/view/View;

    .line 109
    .line 110
    :cond_4
    invoke-virtual {v4, v1}, LL1/B;->W0(Landroid/view/View;)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    invoke-virtual {v2}, LR0/s;->t()LR0/s;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    if-eqz v5, :cond_6

    .line 119
    .line 120
    invoke-virtual {v5}, LR0/s;->q()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    :cond_6
    if-eqz v1, :cond_8

    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    iget-object v5, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 135
    .line 136
    invoke-virtual {v5}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()LR0/v;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    invoke-virtual {v5}, LR0/v;->d()LR0/s;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    invoke-virtual {v5}, LR0/s;->q()I

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-ne v1, v5, :cond_7

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_7
    move v3, v1

    .line 152
    :goto_1
    iget-object v1, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 153
    .line 154
    invoke-virtual {v4, v1, v3}, LL1/B;->X0(Landroid/view/View;I)V

    .line 155
    .line 156
    .line 157
    :goto_2
    iget-object v1, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 158
    .line 159
    invoke-virtual {v4, v1, p1}, LL1/B;->g1(Landroid/view/View;I)V

    .line 160
    .line 161
    .line 162
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/y;->O(LR0/u;)Landroid/graphics/Rect;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v4, v0}, LL1/B;->w0(Landroid/graphics/Rect;)V

    .line 167
    .line 168
    .line 169
    invoke-direct {p0, p1, v4, v2}, Landroidx/compose/ui/platform/y;->y0(ILL1/B;LR0/s;)V

    .line 170
    .line 171
    .line 172
    return-object v4

    .line 173
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    const-string v1, "semanticsNode "

    .line 179
    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string p1, " has null parent"

    .line 187
    .line 188
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-static {p1}, LH0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 196
    .line 197
    .line 198
    new-instance p1, LTd/k;

    .line 199
    .line 200
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 201
    .line 202
    .line 203
    throw p1
.end method

.method private final V0(Ls0/i1;)[F
    .locals 6

    .line 1
    instance-of v0, p1, Ls0/i1$c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x8

    .line 6
    .line 7
    new-array v0, v0, [F

    .line 8
    .line 9
    check-cast p1, Ls0/i1$c;

    .line 10
    .line 11
    invoke-virtual {p1}, Ls0/i1$c;->b()Lr0/j;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Lr0/j;->h()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    const/16 v3, 0x20

    .line 20
    .line 21
    shr-long/2addr v1, v3

    .line 22
    long-to-int v1, v1

    .line 23
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x0

    .line 28
    aput v1, v0, v2

    .line 29
    .line 30
    invoke-virtual {p1}, Ls0/i1$c;->b()Lr0/j;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Lr0/j;->h()J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    const-wide v4, 0xffffffffL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    and-long/2addr v1, v4

    .line 44
    long-to-int v1, v1

    .line 45
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const/4 v2, 0x1

    .line 50
    aput v1, v0, v2

    .line 51
    .line 52
    invoke-virtual {p1}, Ls0/i1$c;->b()Lr0/j;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Lr0/j;->i()J

    .line 57
    .line 58
    .line 59
    move-result-wide v1

    .line 60
    shr-long/2addr v1, v3

    .line 61
    long-to-int v1, v1

    .line 62
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    const/4 v2, 0x2

    .line 67
    aput v1, v0, v2

    .line 68
    .line 69
    invoke-virtual {p1}, Ls0/i1$c;->b()Lr0/j;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1}, Lr0/j;->i()J

    .line 74
    .line 75
    .line 76
    move-result-wide v1

    .line 77
    and-long/2addr v1, v4

    .line 78
    long-to-int v1, v1

    .line 79
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    const/4 v2, 0x3

    .line 84
    aput v1, v0, v2

    .line 85
    .line 86
    invoke-virtual {p1}, Ls0/i1$c;->b()Lr0/j;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1}, Lr0/j;->c()J

    .line 91
    .line 92
    .line 93
    move-result-wide v1

    .line 94
    shr-long/2addr v1, v3

    .line 95
    long-to-int v1, v1

    .line 96
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    const/4 v2, 0x4

    .line 101
    aput v1, v0, v2

    .line 102
    .line 103
    invoke-virtual {p1}, Ls0/i1$c;->b()Lr0/j;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v1}, Lr0/j;->c()J

    .line 108
    .line 109
    .line 110
    move-result-wide v1

    .line 111
    and-long/2addr v1, v4

    .line 112
    long-to-int v1, v1

    .line 113
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    const/4 v2, 0x5

    .line 118
    aput v1, v0, v2

    .line 119
    .line 120
    invoke-virtual {p1}, Ls0/i1$c;->b()Lr0/j;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v1}, Lr0/j;->b()J

    .line 125
    .line 126
    .line 127
    move-result-wide v1

    .line 128
    shr-long/2addr v1, v3

    .line 129
    long-to-int v1, v1

    .line 130
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    const/4 v2, 0x6

    .line 135
    aput v1, v0, v2

    .line 136
    .line 137
    invoke-virtual {p1}, Ls0/i1$c;->b()Lr0/j;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p1}, Lr0/j;->b()J

    .line 142
    .line 143
    .line 144
    move-result-wide v1

    .line 145
    and-long/2addr v1, v4

    .line 146
    long-to-int p1, v1

    .line 147
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    const/4 v1, 0x7

    .line 152
    aput p1, v0, v1

    .line 153
    .line 154
    return-object v0

    .line 155
    :cond_0
    const/4 p1, 0x0

    .line 156
    return-object p1
.end method

.method private final W(Ls0/E1;LR0/s;)Ls0/i1;
    .locals 3

    .line 1
    invoke-virtual {p2}, LR0/s;->w()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Li1/s;->d(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-virtual {p2}, LR0/s;->r()LI0/t;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-interface {p2}, LI0/t;->getLayoutDirection()Li1/t;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    iget-object v2, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getDensity()Li1/d;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-interface {p1, v0, v1, p2, v2}, Ls0/E1;->createOutline-Pq9zytI(JLi1/t;Li1/d;)Ls0/i1;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
.end method

.method private final W0(Ls0/i1;)Landroid/graphics/Region;
    .locals 3

    .line 1
    instance-of v0, p1, Ls0/i1$a;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Region;

    .line 6
    .line 7
    check-cast p1, Ls0/i1$a;

    .line 8
    .line 9
    invoke-virtual {p1}, Ls0/i1$a;->a()Lr0/h;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {p0, v1}, Landroidx/compose/ui/platform/y;->T0(Lr0/h;)Landroid/graphics/Rect;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Landroid/graphics/Region;-><init>(Landroid/graphics/Rect;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Landroid/graphics/Region;

    .line 21
    .line 22
    invoke-direct {v1}, Landroid/graphics/Region;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ls0/i1$a;->b()Ls0/m1;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    instance-of v2, p1, Ls0/S;

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    check-cast p1, Ls0/S;

    .line 34
    .line 35
    invoke-virtual {p1}, Ls0/S;->v()Landroid/graphics/Path;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {v1, p1, v0}, Landroid/graphics/Region;->setPath(Landroid/graphics/Path;Landroid/graphics/Region;)Z

    .line 40
    .line 41
    .line 42
    return-object v1

    .line 43
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 44
    .line 45
    const-string v0, "Unable to obtain android.graphics.Path"

    .line 46
    .line 47
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_1
    const/4 p1, 0x0

    .line 52
    return-object p1
.end method

.method private final X(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;
    .locals 1

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Landroidx/compose/ui/platform/y;->U(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    if-eqz p3, :cond_1

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    if-eqz p4, :cond_2

    .line 26
    .line 27
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    .line 32
    .line 33
    .line 34
    :cond_2
    if-eqz p5, :cond_3

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-interface {p2, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_3
    return-object p1
.end method

.method private final X0(LR0/s;Lr0/h;)Landroid/graphics/RectF;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p1}, LR0/s;->u()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {p2, v1, v2}, Lr0/h;->t(J)Lr0/h;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p1}, LR0/s;->k()Lr0/h;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p2, p1}, Lr0/h;->r(Lr0/h;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p2, p1}, Lr0/h;->p(Lr0/h;)Lr0/h;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object p1, v0

    .line 29
    :goto_0
    if-eqz p1, :cond_2

    .line 30
    .line 31
    iget-object p2, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 32
    .line 33
    invoke-virtual {p1}, Lr0/h;->i()F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p1}, Lr0/h;->l()F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    int-to-long v2, v0

    .line 46
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    int-to-long v0, v0

    .line 51
    const/16 v4, 0x20

    .line 52
    .line 53
    shl-long/2addr v2, v4

    .line 54
    const-wide v5, 0xffffffffL

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    and-long/2addr v0, v5

    .line 60
    or-long/2addr v0, v2

    .line 61
    invoke-static {v0, v1}, Lr0/f;->e(J)J

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    invoke-virtual {p2, v0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->B(J)J

    .line 66
    .line 67
    .line 68
    move-result-wide v0

    .line 69
    iget-object p2, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 70
    .line 71
    invoke-virtual {p1}, Lr0/h;->j()F

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-virtual {p1}, Lr0/h;->e()F

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    int-to-long v2, v2

    .line 84
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    int-to-long v7, p1

    .line 89
    shl-long/2addr v2, v4

    .line 90
    and-long/2addr v7, v5

    .line 91
    or-long/2addr v2, v7

    .line 92
    invoke-static {v2, v3}, Lr0/f;->e(J)J

    .line 93
    .line 94
    .line 95
    move-result-wide v2

    .line 96
    invoke-virtual {p2, v2, v3}, Landroidx/compose/ui/platform/AndroidComposeView;->B(J)J

    .line 97
    .line 98
    .line 99
    move-result-wide p1

    .line 100
    new-instance v2, Landroid/graphics/RectF;

    .line 101
    .line 102
    shr-long v7, v0, v4

    .line 103
    .line 104
    long-to-int v3, v7

    .line 105
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    shr-long v8, p1, v4

    .line 110
    .line 111
    long-to-int v4, v8

    .line 112
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    and-long/2addr v0, v5

    .line 121
    long-to-int v0, v0

    .line 122
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    and-long/2addr p1, v5

    .line 127
    long-to-int p1, p1

    .line 128
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    invoke-static {v1, p2}, Ljava/lang/Math;->min(FF)F

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    invoke-static {v1, v3}, Ljava/lang/Math;->max(FF)F

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    invoke-direct {v2, v7, p2, v1, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 161
    .line 162
    .line 163
    return-object v2

    .line 164
    :cond_2
    return-object v0
.end method

.method private final Y0(LU0/e;)Landroid/text/SpannableString;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFontFamilyResolver()LY0/u$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getDensity()Li1/d;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Landroidx/compose/ui/platform/y;->K:Ld1/w;

    .line 14
    .line 15
    invoke-static {p1, v1, v0, v2}, Ld1/a;->b(LU0/e;Li1/d;LY0/u$b;Ld1/w;)Landroid/text/SpannableString;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const v0, 0x186a0

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, p1, v0}, Landroidx/compose/ui/platform/y;->b1(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Landroid/text/SpannableString;

    .line 27
    .line 28
    return-object p1
.end method

.method private final Z()LL1/B;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->g:Landroid/view/accessibility/AccessibilityManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, LL1/B;->k0()LL1/B;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method private static final Z0(Landroidx/compose/ui/platform/y;Z)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/compose/ui/platform/y;->g:Landroid/view/accessibility/AccessibilityManager;

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Landroidx/compose/ui/platform/y;->l:Ljava/util/List;

    .line 9
    .line 10
    return-void
.end method

.method private static final a0(Landroidx/compose/ui/platform/y;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Landroidx/compose/ui/platform/y;->g:Landroid/view/accessibility/AccessibilityManager;

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    iput-object p1, p0, Landroidx/compose/ui/platform/y;->l:Ljava/util/List;

    .line 16
    .line 17
    return-void
.end method

.method private final a1(LR0/s;IZZ)Z
    .locals 11

    .line 1
    invoke-virtual {p1}, LR0/s;->q()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Landroidx/compose/ui/platform/y;->z:Ljava/lang/Integer;

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    :goto_0
    iput v2, p0, Landroidx/compose/ui/platform/y;->y:I

    .line 18
    .line 19
    invoke-virtual {p1}, LR0/s;->q()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Landroidx/compose/ui/platform/y;->z:Ljava/lang/Integer;

    .line 28
    .line 29
    :cond_1
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->i0(LR0/s;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v1, 0x0

    .line 34
    if-eqz v0, :cond_e

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_2

    .line 41
    .line 42
    goto/16 :goto_8

    .line 43
    .line 44
    :cond_2
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/platform/y;->j0(LR0/s;I)Landroidx/compose/ui/platform/g;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    if-nez v3, :cond_3

    .line 49
    .line 50
    return v1

    .line 51
    :cond_3
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->b0(LR0/s;)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-ne v4, v2, :cond_5

    .line 56
    .line 57
    if-eqz p3, :cond_4

    .line 58
    .line 59
    move v4, v1

    .line 60
    goto :goto_1

    .line 61
    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    move v4, v0

    .line 66
    :cond_5
    :goto_1
    if-eqz p3, :cond_6

    .line 67
    .line 68
    invoke-interface {v3, v4}, Landroidx/compose/ui/platform/g;->a(I)[I

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    goto :goto_2

    .line 73
    :cond_6
    invoke-interface {v3, v4}, Landroidx/compose/ui/platform/g;->b(I)[I

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :goto_2
    if-nez v0, :cond_7

    .line 78
    .line 79
    return v1

    .line 80
    :cond_7
    aget v7, v0, v1

    .line 81
    .line 82
    const/4 v1, 0x1

    .line 83
    aget v8, v0, v1

    .line 84
    .line 85
    if-eqz p4, :cond_b

    .line 86
    .line 87
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->o0(LR0/s;)Z

    .line 88
    .line 89
    .line 90
    move-result p4

    .line 91
    if-eqz p4, :cond_b

    .line 92
    .line 93
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->c0(LR0/s;)I

    .line 94
    .line 95
    .line 96
    move-result p4

    .line 97
    if-ne p4, v2, :cond_9

    .line 98
    .line 99
    if-eqz p3, :cond_8

    .line 100
    .line 101
    move p4, v7

    .line 102
    goto :goto_3

    .line 103
    :cond_8
    move p4, v8

    .line 104
    :cond_9
    :goto_3
    if-eqz p3, :cond_a

    .line 105
    .line 106
    move v0, v8

    .line 107
    goto :goto_5

    .line 108
    :cond_a
    move v0, v7

    .line 109
    goto :goto_5

    .line 110
    :cond_b
    if-eqz p3, :cond_c

    .line 111
    .line 112
    move p4, v8

    .line 113
    goto :goto_4

    .line 114
    :cond_c
    move p4, v7

    .line 115
    :goto_4
    move v0, p4

    .line 116
    :goto_5
    if-eqz p3, :cond_d

    .line 117
    .line 118
    const/16 p3, 0x100

    .line 119
    .line 120
    :goto_6
    move v5, p3

    .line 121
    goto :goto_7

    .line 122
    :cond_d
    const/16 p3, 0x200

    .line 123
    .line 124
    goto :goto_6

    .line 125
    :goto_7
    new-instance v3, Landroidx/compose/ui/platform/y$f;

    .line 126
    .line 127
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 128
    .line 129
    .line 130
    move-result-wide v9

    .line 131
    move-object v4, p1

    .line 132
    move v6, p2

    .line 133
    invoke-direct/range {v3 .. v10}, Landroidx/compose/ui/platform/y$f;-><init>(LR0/s;IIIIJ)V

    .line 134
    .line 135
    .line 136
    iput-object v3, p0, Landroidx/compose/ui/platform/y;->D:Landroidx/compose/ui/platform/y$f;

    .line 137
    .line 138
    invoke-direct {p0, v4, p4, v0, v1}, Landroidx/compose/ui/platform/y;->P0(LR0/s;IIZ)Z

    .line 139
    .line 140
    .line 141
    :cond_e
    :goto_8
    return v1
.end method

.method private final b0(LR0/s;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LR0/x;->a:LR0/x;

    .line 6
    .line 7
    invoke-virtual {v1}, LR0/x;->d()LR0/B;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0, v2}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v1}, LR0/x;->K()LR0/B;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v2}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v1}, LR0/x;->K()LR0/B;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p1, v0}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->l(LR0/B;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, LU0/W0;

    .line 44
    .line 45
    invoke-virtual {p1}, LU0/W0;->r()J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    invoke-static {v0, v1}, LU0/W0;->i(J)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    return p1

    .line 54
    :cond_0
    iget p1, p0, Landroidx/compose/ui/platform/y;->y:I

    .line 55
    .line 56
    return p1
.end method

.method private final b1(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    if-lez p2, :cond_4

    .line 2
    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-gt v0, p2, :cond_1

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    add-int/lit8 v0, p2, -0x1

    .line 20
    .line 21
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {v1}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-static {v1}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    move p2, v0

    .line 42
    :cond_2
    const/4 v0, 0x0

    .line 43
    invoke-interface {p1, v0, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const-string p2, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize"

    .line 48
    .line 49
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_3
    :goto_0
    return-object p1

    .line 53
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 54
    .line 55
    const-string p2, "size should be greater than 0"

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1
.end method

.method private final c0(LR0/s;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LR0/x;->a:LR0/x;

    .line 6
    .line 7
    invoke-virtual {v1}, LR0/x;->d()LR0/B;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0, v2}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v1}, LR0/x;->K()LR0/B;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v2}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v1}, LR0/x;->K()LR0/B;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p1, v0}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->l(LR0/B;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, LU0/W0;

    .line 44
    .line 45
    invoke-virtual {p1}, LU0/W0;->r()J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    invoke-static {v0, v1}, LU0/W0;->n(J)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    return p1

    .line 54
    :cond_0
    iget p1, p0, Landroidx/compose/ui/platform/y;->y:I

    .line 55
    .line 56
    return p1
.end method

.method private final c1(I)V
    .locals 9

    .line 1
    iget v1, p0, Landroidx/compose/ui/platform/y;->e:I

    .line 2
    .line 3
    if-ne v1, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Landroidx/compose/ui/platform/y;->e:I

    .line 7
    .line 8
    const/16 v7, 0xc

    .line 9
    .line 10
    const/4 v8, 0x0

    .line 11
    const/16 v4, 0x80

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v2, p0

    .line 16
    move v3, p1

    .line 17
    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/platform/y;->J0(Landroidx/compose/ui/platform/y;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    const/16 v5, 0xc

    .line 21
    .line 22
    const/16 v2, 0x100

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    move-object v0, p0

    .line 27
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/y;->J0(Landroidx/compose/ui/platform/y;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private final d0()Lt/o;
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/platform/y;->C:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Landroidx/compose/ui/platform/y;->C:Z

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()LR0/v;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, -0x1

    .line 15
    invoke-static {v0, v1}, LR0/w;->a(LR0/v;I)Lt/o;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Landroidx/compose/ui/platform/y;->E:Lt/o;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/compose/ui/platform/y;->p0()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->E:Lt/o;

    .line 28
    .line 29
    iget-object v1, p0, Landroidx/compose/ui/platform/y;->G:Lt/D;

    .line 30
    .line 31
    iget-object v2, p0, Landroidx/compose/ui/platform/y;->H:Lt/D;

    .line 32
    .line 33
    iget-object v3, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 34
    .line 35
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/platform/z;->k(Lt/o;Lt/D;Lt/D;Landroid/content/res/Resources;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->E:Lt/o;

    .line 47
    .line 48
    return-object v0
.end method

.method private final d1()V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lt/G;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    invoke-direct {v1, v2, v3, v4}, Lt/G;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    .line 10
    .line 11
    iget-object v3, v0, Landroidx/compose/ui/platform/y;->F:Lt/G;

    .line 12
    .line 13
    iget-object v5, v3, Lt/q;->b:[I

    .line 14
    .line 15
    iget-object v3, v3, Lt/q;->a:[J

    .line 16
    .line 17
    array-length v6, v3

    .line 18
    add-int/lit8 v6, v6, -0x2

    .line 19
    .line 20
    const-wide/16 v7, 0x80

    .line 21
    .line 22
    const-wide/16 v9, 0xff

    .line 23
    .line 24
    const/4 v11, 0x7

    .line 25
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    const/16 v14, 0x8

    .line 31
    .line 32
    if-ltz v6, :cond_7

    .line 33
    .line 34
    move v15, v2

    .line 35
    move-object/from16 v16, v3

    .line 36
    .line 37
    :goto_0
    aget-wide v2, v16, v15

    .line 38
    .line 39
    move-object/from16 v18, v5

    .line 40
    .line 41
    not-long v4, v2

    .line 42
    shl-long/2addr v4, v11

    .line 43
    and-long/2addr v4, v2

    .line 44
    and-long/2addr v4, v12

    .line 45
    cmp-long v4, v4, v12

    .line 46
    .line 47
    if-eqz v4, :cond_6

    .line 48
    .line 49
    sub-int v4, v15, v6

    .line 50
    .line 51
    not-int v4, v4

    .line 52
    ushr-int/lit8 v4, v4, 0x1f

    .line 53
    .line 54
    rsub-int/lit8 v4, v4, 0x8

    .line 55
    .line 56
    const/4 v5, 0x0

    .line 57
    :goto_1
    if-ge v5, v4, :cond_5

    .line 58
    .line 59
    and-long v19, v2, v9

    .line 60
    .line 61
    cmp-long v19, v19, v7

    .line 62
    .line 63
    if-gez v19, :cond_3

    .line 64
    .line 65
    shl-int/lit8 v19, v15, 0x3

    .line 66
    .line 67
    add-int v19, v19, v5

    .line 68
    .line 69
    move-wide/from16 v20, v7

    .line 70
    .line 71
    aget v7, v18, v19

    .line 72
    .line 73
    invoke-direct {v0}, Landroidx/compose/ui/platform/y;->d0()Lt/o;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    invoke-virtual {v8, v7}, Lt/o;->c(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    check-cast v8, LR0/u;

    .line 82
    .line 83
    if-eqz v8, :cond_0

    .line 84
    .line 85
    invoke-virtual {v8}, LR0/u;->b()LR0/s;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    goto :goto_2

    .line 90
    :cond_0
    const/4 v8, 0x0

    .line 91
    :goto_2
    if-eqz v8, :cond_1

    .line 92
    .line 93
    invoke-virtual {v8}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    sget-object v19, LR0/x;->a:LR0/x;

    .line 98
    .line 99
    move-wide/from16 v22, v9

    .line 100
    .line 101
    invoke-virtual/range {v19 .. v19}, LR0/x;->A()LR0/B;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    invoke-virtual {v8, v9}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    if-nez v8, :cond_4

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_1
    move-wide/from16 v22, v9

    .line 113
    .line 114
    :goto_3
    invoke-virtual {v1, v7}, Lt/G;->g(I)Z

    .line 115
    .line 116
    .line 117
    iget-object v8, v0, Landroidx/compose/ui/platform/y;->L:Lt/F;

    .line 118
    .line 119
    invoke-virtual {v8, v7}, Lt/o;->c(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    check-cast v8, Landroidx/compose/ui/platform/l1;

    .line 124
    .line 125
    if-eqz v8, :cond_2

    .line 126
    .line 127
    invoke-virtual {v8}, Landroidx/compose/ui/platform/l1;->b()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    if-eqz v8, :cond_2

    .line 132
    .line 133
    sget-object v9, LR0/x;->a:LR0/x;

    .line 134
    .line 135
    invoke-virtual {v9}, LR0/x;->A()LR0/B;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    invoke-static {v8, v9}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    check-cast v8, Ljava/lang/String;

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_2
    const/4 v8, 0x0

    .line 147
    :goto_4
    const/16 v9, 0x20

    .line 148
    .line 149
    invoke-direct {v0, v7, v9, v8}, Landroidx/compose/ui/platform/y;->K0(IILjava/lang/String;)V

    .line 150
    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_3
    move-wide/from16 v20, v7

    .line 154
    .line 155
    move-wide/from16 v22, v9

    .line 156
    .line 157
    :cond_4
    :goto_5
    shr-long/2addr v2, v14

    .line 158
    add-int/lit8 v5, v5, 0x1

    .line 159
    .line 160
    move-wide/from16 v7, v20

    .line 161
    .line 162
    move-wide/from16 v9, v22

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_5
    move-wide/from16 v20, v7

    .line 166
    .line 167
    move-wide/from16 v22, v9

    .line 168
    .line 169
    if-ne v4, v14, :cond_8

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_6
    move-wide/from16 v20, v7

    .line 173
    .line 174
    move-wide/from16 v22, v9

    .line 175
    .line 176
    :goto_6
    if-eq v15, v6, :cond_8

    .line 177
    .line 178
    add-int/lit8 v15, v15, 0x1

    .line 179
    .line 180
    move-object/from16 v5, v18

    .line 181
    .line 182
    move-wide/from16 v7, v20

    .line 183
    .line 184
    move-wide/from16 v9, v22

    .line 185
    .line 186
    const/4 v4, 0x0

    .line 187
    goto/16 :goto_0

    .line 188
    .line 189
    :cond_7
    move-wide/from16 v20, v7

    .line 190
    .line 191
    move-wide/from16 v22, v9

    .line 192
    .line 193
    :cond_8
    iget-object v2, v0, Landroidx/compose/ui/platform/y;->F:Lt/G;

    .line 194
    .line 195
    invoke-virtual {v2, v1}, Lt/G;->s(Lt/q;)Z

    .line 196
    .line 197
    .line 198
    iget-object v1, v0, Landroidx/compose/ui/platform/y;->L:Lt/F;

    .line 199
    .line 200
    invoke-virtual {v1}, Lt/F;->h()V

    .line 201
    .line 202
    .line 203
    invoke-direct {v0}, Landroidx/compose/ui/platform/y;->d0()Lt/o;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    iget-object v2, v1, Lt/o;->b:[I

    .line 208
    .line 209
    iget-object v3, v1, Lt/o;->c:[Ljava/lang/Object;

    .line 210
    .line 211
    iget-object v1, v1, Lt/o;->a:[J

    .line 212
    .line 213
    array-length v4, v1

    .line 214
    add-int/lit8 v4, v4, -0x2

    .line 215
    .line 216
    if-ltz v4, :cond_d

    .line 217
    .line 218
    const/4 v5, 0x0

    .line 219
    :goto_7
    aget-wide v6, v1, v5

    .line 220
    .line 221
    not-long v8, v6

    .line 222
    shl-long/2addr v8, v11

    .line 223
    and-long/2addr v8, v6

    .line 224
    and-long/2addr v8, v12

    .line 225
    cmp-long v8, v8, v12

    .line 226
    .line 227
    if-eqz v8, :cond_c

    .line 228
    .line 229
    sub-int v8, v5, v4

    .line 230
    .line 231
    not-int v8, v8

    .line 232
    ushr-int/lit8 v8, v8, 0x1f

    .line 233
    .line 234
    rsub-int/lit8 v8, v8, 0x8

    .line 235
    .line 236
    const/4 v9, 0x0

    .line 237
    :goto_8
    if-ge v9, v8, :cond_b

    .line 238
    .line 239
    and-long v16, v6, v22

    .line 240
    .line 241
    cmp-long v10, v16, v20

    .line 242
    .line 243
    if-gez v10, :cond_a

    .line 244
    .line 245
    shl-int/lit8 v10, v5, 0x3

    .line 246
    .line 247
    add-int/2addr v10, v9

    .line 248
    aget v15, v2, v10

    .line 249
    .line 250
    aget-object v10, v3, v10

    .line 251
    .line 252
    check-cast v10, LR0/u;

    .line 253
    .line 254
    invoke-virtual {v10}, LR0/u;->b()LR0/s;

    .line 255
    .line 256
    .line 257
    move-result-object v16

    .line 258
    invoke-virtual/range {v16 .. v16}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 259
    .line 260
    .line 261
    move-result-object v11

    .line 262
    sget-object v16, LR0/x;->a:LR0/x;

    .line 263
    .line 264
    invoke-virtual/range {v16 .. v16}, LR0/x;->A()LR0/B;

    .line 265
    .line 266
    .line 267
    move-result-object v12

    .line 268
    invoke-virtual {v11, v12}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 269
    .line 270
    .line 271
    move-result v11

    .line 272
    if-eqz v11, :cond_9

    .line 273
    .line 274
    iget-object v11, v0, Landroidx/compose/ui/platform/y;->F:Lt/G;

    .line 275
    .line 276
    invoke-virtual {v11, v15}, Lt/G;->g(I)Z

    .line 277
    .line 278
    .line 279
    move-result v11

    .line 280
    if-eqz v11, :cond_9

    .line 281
    .line 282
    invoke-virtual {v10}, LR0/u;->b()LR0/s;

    .line 283
    .line 284
    .line 285
    move-result-object v11

    .line 286
    invoke-virtual {v11}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 287
    .line 288
    .line 289
    move-result-object v11

    .line 290
    invoke-virtual/range {v16 .. v16}, LR0/x;->A()LR0/B;

    .line 291
    .line 292
    .line 293
    move-result-object v12

    .line 294
    invoke-virtual {v11, v12}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->l(LR0/B;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v11

    .line 298
    check-cast v11, Ljava/lang/String;

    .line 299
    .line 300
    const/16 v12, 0x10

    .line 301
    .line 302
    invoke-direct {v0, v15, v12, v11}, Landroidx/compose/ui/platform/y;->K0(IILjava/lang/String;)V

    .line 303
    .line 304
    .line 305
    :cond_9
    iget-object v11, v0, Landroidx/compose/ui/platform/y;->L:Lt/F;

    .line 306
    .line 307
    new-instance v12, Landroidx/compose/ui/platform/l1;

    .line 308
    .line 309
    invoke-virtual {v10}, LR0/u;->b()LR0/s;

    .line 310
    .line 311
    .line 312
    move-result-object v10

    .line 313
    invoke-direct {v0}, Landroidx/compose/ui/platform/y;->d0()Lt/o;

    .line 314
    .line 315
    .line 316
    move-result-object v13

    .line 317
    invoke-direct {v12, v10, v13}, Landroidx/compose/ui/platform/l1;-><init>(LR0/s;Lt/o;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v11, v15, v12}, Lt/F;->s(ILjava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    :cond_a
    shr-long/2addr v6, v14

    .line 324
    add-int/lit8 v9, v9, 0x1

    .line 325
    .line 326
    const/4 v11, 0x7

    .line 327
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    goto :goto_8

    .line 333
    :cond_b
    if-ne v8, v14, :cond_d

    .line 334
    .line 335
    :cond_c
    if-eq v5, v4, :cond_d

    .line 336
    .line 337
    add-int/lit8 v5, v5, 0x1

    .line 338
    .line 339
    const/4 v11, 0x7

    .line 340
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    goto :goto_7

    .line 346
    :cond_d
    new-instance v1, Landroidx/compose/ui/platform/l1;

    .line 347
    .line 348
    iget-object v2, v0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 349
    .line 350
    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()LR0/v;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    invoke-virtual {v2}, LR0/v;->d()LR0/s;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    invoke-direct {v0}, Landroidx/compose/ui/platform/y;->d0()Lt/o;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    invoke-direct {v1, v2, v3}, Landroidx/compose/ui/platform/l1;-><init>(LR0/s;Lt/o;)V

    .line 363
    .line 364
    .line 365
    iput-object v1, v0, Landroidx/compose/ui/platform/y;->M:Landroidx/compose/ui/platform/l1;

    .line 366
    .line 367
    return-void
.end method

.method private final i0(LR0/s;)Ljava/lang/String;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, LR0/x;->a:LR0/x;

    .line 10
    .line 11
    invoke-virtual {v2}, LR0/x;->d()LR0/B;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v1, v3}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v2}, LR0/x;->d()LR0/B;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->l(LR0/B;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    move-object v0, p1

    .line 34
    check-cast v0, Ljava/util/List;

    .line 35
    .line 36
    const/16 v7, 0x3e

    .line 37
    .line 38
    const/4 v8, 0x0

    .line 39
    const-string v1, ","

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    const/4 v3, 0x0

    .line 43
    const/4 v4, 0x0

    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v6, 0x0

    .line 46
    invoke-static/range {v0 .. v8}, Lk1/a;->e(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :cond_1
    invoke-virtual {p1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v2}, LR0/x;->g()LR0/B;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v1, v3}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    invoke-virtual {p1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->k0(Landroidx/compose/ui/semantics/SemanticsConfiguration;)LU0/e;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-eqz p1, :cond_2

    .line 74
    .line 75
    invoke-virtual {p1}, LU0/e;->j()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :cond_2
    return-object v0

    .line 81
    :cond_3
    invoke-virtual {p1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {v2}, LR0/x;->J()LR0/B;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {p1, v1}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, Ljava/util/List;

    .line 94
    .line 95
    if-eqz p1, :cond_4

    .line 96
    .line 97
    invoke-static {p1}, LUd/u;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, LU0/e;

    .line 102
    .line 103
    if-eqz p1, :cond_4

    .line 104
    .line 105
    invoke-virtual {p1}, LU0/e;->j()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    return-object p1

    .line 110
    :cond_4
    return-object v0
.end method

.method private final j0(LR0/s;I)Landroidx/compose/ui/platform/g;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->i0(LR0/s;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_9

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    goto/16 :goto_0

    .line 18
    .line 19
    :cond_1
    const/4 v2, 0x1

    .line 20
    if-eq p2, v2, :cond_8

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    if-eq p2, v2, :cond_7

    .line 24
    .line 25
    const/4 v2, 0x4

    .line 26
    if-eq p2, v2, :cond_3

    .line 27
    .line 28
    const/16 v3, 0x8

    .line 29
    .line 30
    if-eq p2, v3, :cond_2

    .line 31
    .line 32
    const/16 v3, 0x10

    .line 33
    .line 34
    if-eq p2, v3, :cond_3

    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_2
    sget-object p1, Landroidx/compose/ui/platform/f;->c:Landroidx/compose/ui/platform/f$a;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroidx/compose/ui/platform/f$a;->a()Landroidx/compose/ui/platform/f;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1, v1}, Landroidx/compose/ui/platform/b;->e(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_3
    invoke-virtual {p1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    sget-object v4, LR0/l;->a:LR0/l;

    .line 52
    .line 53
    invoke-virtual {v4}, LR0/l;->i()LR0/B;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v3, v4}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_4

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_4
    invoke-virtual {p1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-static {v3}, Landroidx/compose/ui/platform/m1;->c(Landroidx/compose/ui/semantics/SemanticsConfiguration;)LU0/T0;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    if-nez v3, :cond_5

    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_5
    if-ne p2, v2, :cond_6

    .line 76
    .line 77
    sget-object p1, Landroidx/compose/ui/platform/d;->d:Landroidx/compose/ui/platform/d$a;

    .line 78
    .line 79
    invoke-virtual {p1}, Landroidx/compose/ui/platform/d$a;->a()Landroidx/compose/ui/platform/d;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1, v1, v3}, Landroidx/compose/ui/platform/d;->j(Ljava/lang/String;LU0/T0;)V

    .line 84
    .line 85
    .line 86
    return-object p1

    .line 87
    :cond_6
    sget-object p2, Landroidx/compose/ui/platform/e;->f:Landroidx/compose/ui/platform/e$a;

    .line 88
    .line 89
    invoke-virtual {p2}, Landroidx/compose/ui/platform/e$a;->a()Landroidx/compose/ui/platform/e;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-virtual {p2, v1, v3, p1}, Landroidx/compose/ui/platform/e;->j(Ljava/lang/String;LU0/T0;LR0/s;)V

    .line 94
    .line 95
    .line 96
    return-object p2

    .line 97
    :cond_7
    sget-object p1, Landroidx/compose/ui/platform/h;->d:Landroidx/compose/ui/platform/h$a;

    .line 98
    .line 99
    iget-object p2, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 100
    .line 101
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    iget-object p2, p2, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 114
    .line 115
    invoke-virtual {p1, p2}, Landroidx/compose/ui/platform/h$a;->a(Ljava/util/Locale;)Landroidx/compose/ui/platform/h;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p1, v1}, Landroidx/compose/ui/platform/h;->e(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-object p1

    .line 123
    :cond_8
    sget-object p1, Landroidx/compose/ui/platform/c;->d:Landroidx/compose/ui/platform/c$a;

    .line 124
    .line 125
    iget-object p2, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 126
    .line 127
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    iget-object p2, p2, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 140
    .line 141
    invoke-virtual {p1, p2}, Landroidx/compose/ui/platform/c$a;->a(Ljava/util/Locale;)Landroidx/compose/ui/platform/c;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p1, v1}, Landroidx/compose/ui/platform/c;->e(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-object p1

    .line 149
    :cond_9
    :goto_0
    return-object v0
.end method

.method private final k0(Landroidx/compose/ui/semantics/SemanticsConfiguration;)LU0/e;
    .locals 1

    .line 1
    sget-object v0, LR0/x;->a:LR0/x;

    .line 2
    .line 3
    invoke-virtual {v0}, LR0/x;->g()LR0/B;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1, v0}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, LU0/e;

    .line 12
    .line 13
    return-object p1
.end method

.method public static synthetic n(Landroidx/compose/ui/platform/y;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/ui/platform/y;->Z0(Landroidx/compose/ui/platform/y;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final n0(I)Z
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/platform/y;->p:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    return p1

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    return p1
.end method

.method public static synthetic o(Landroidx/compose/ui/platform/y;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/platform/y;->E0(Landroidx/compose/ui/platform/y;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final o0(LR0/s;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LR0/x;->a:LR0/x;

    .line 6
    .line 7
    invoke-virtual {v1}, LR0/x;->d()LR0/B;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0, v2}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v1}, LR0/x;->g()LR0/B;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    return p1

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    return p1
.end method

.method public static synthetic p(Landroidx/compose/ui/platform/y;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/ui/platform/y;->a0(Landroidx/compose/ui/platform/y;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic q(Landroidx/compose/ui/platform/y;ILL1/B;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/ui/platform/y;->N(ILL1/B;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final q0()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->m:Ljava/lang/Boolean;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    return v0

    .line 23
    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->g:Landroid/view/accessibility/AccessibilityManager;

    .line 24
    .line 25
    invoke-static {v0}, LL1/c;->a(Landroid/view/accessibility/AccessibilityManager;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    return v0
.end method

.method public static final synthetic r(Landroidx/compose/ui/platform/y;LR0/u;)Landroid/graphics/Rect;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->O(LR0/u;)Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final r0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/platform/y;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->g:Landroid/view/accessibility/AccessibilityManager;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->g:Landroid/view/accessibility/AccessibilityManager;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0

    .line 24
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 25
    return v0
.end method

.method public static final synthetic s(Landroidx/compose/ui/platform/y;I)LL1/B;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->V(I)LL1/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final s0(LK0/J;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->A:Lt/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt/b;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/compose/ui/platform/y;->B:LIf/g;

    .line 10
    .line 11
    sget-object v0, LTd/L;->a:LTd/L;

    .line 12
    .line 13
    invoke-interface {p1, v0}, LIf/w;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static final synthetic t(Landroidx/compose/ui/platform/y;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/compose/ui/platform/y;->p:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic u(Landroidx/compose/ui/platform/y;)Landroid/view/accessibility/AccessibilityManager;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/y;->g:Landroid/view/accessibility/AccessibilityManager;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic v(Landroidx/compose/ui/platform/y;)Lt/o;
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/platform/y;->d0()Lt/o;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final v0(IILandroid/os/Bundle;)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    invoke-direct {v0}, Landroidx/compose/ui/platform/y;->d0()Lt/o;

    .line 15
    .line 16
    .line 17
    move-result-object v6

    .line 18
    invoke-virtual {v6, v1}, Lt/o;->c(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    check-cast v6, LR0/u;

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    invoke-virtual {v6}, LR0/u;->b()LR0/s;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    if-nez v6, :cond_1

    .line 32
    .line 33
    :cond_0
    move/from16 v18, v7

    .line 34
    .line 35
    goto/16 :goto_1a

    .line 36
    .line 37
    :cond_1
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    sget-object v9, LR0/x;->a:LR0/x;

    .line 42
    .line 43
    invoke-virtual {v9}, LR0/x;->u()LR0/B;

    .line 44
    .line 45
    .line 46
    move-result-object v10

    .line 47
    invoke-static {v8, v10}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-static {v8, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    if-eqz v8, :cond_2

    .line 58
    .line 59
    invoke-direct {v0}, Landroidx/compose/ui/platform/y;->q0()Z

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-nez v8, :cond_2

    .line 64
    .line 65
    return v7

    .line 66
    :cond_2
    const/16 v8, 0x40

    .line 67
    .line 68
    if-eq v2, v8, :cond_58

    .line 69
    .line 70
    const/16 v8, 0x80

    .line 71
    .line 72
    if-eq v2, v8, :cond_57

    .line 73
    .line 74
    const/16 v8, 0x100

    .line 75
    .line 76
    const/4 v11, 0x1

    .line 77
    if-eq v2, v8, :cond_54

    .line 78
    .line 79
    const/16 v12, 0x200

    .line 80
    .line 81
    if-eq v2, v12, :cond_54

    .line 82
    .line 83
    const/16 v8, 0x4000

    .line 84
    .line 85
    if-eq v2, v8, :cond_52

    .line 86
    .line 87
    const/high16 v8, 0x20000

    .line 88
    .line 89
    if-eq v2, v8, :cond_4e

    .line 90
    .line 91
    invoke-static {v6}, Landroidx/compose/ui/platform/z;->b(LR0/s;)Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-nez v8, :cond_3

    .line 96
    .line 97
    return v7

    .line 98
    :cond_3
    if-eq v2, v11, :cond_4b

    .line 99
    .line 100
    const/4 v8, 0x2

    .line 101
    if-eq v2, v8, :cond_49

    .line 102
    .line 103
    const/4 v10, 0x0

    .line 104
    sparse-switch v2, :sswitch_data_0

    .line 105
    .line 106
    .line 107
    packed-switch v2, :pswitch_data_0

    .line 108
    .line 109
    .line 110
    packed-switch v2, :pswitch_data_1

    .line 111
    .line 112
    .line 113
    iget-object v3, v0, Landroidx/compose/ui/platform/y;->w:Lt/j0;

    .line 114
    .line 115
    invoke-virtual {v3, v1}, Lt/j0;->f(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, Lt/j0;

    .line 120
    .line 121
    if-eqz v1, :cond_7

    .line 122
    .line 123
    invoke-virtual {v1, v2}, Lt/j0;->f(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, Ljava/lang/CharSequence;

    .line 128
    .line 129
    if-nez v1, :cond_4

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_4
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    sget-object v2, LR0/l;->a:LR0/l;

    .line 137
    .line 138
    invoke-virtual {v2}, LR0/l;->d()LR0/B;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-static {v1, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    check-cast v1, Ljava/util/List;

    .line 147
    .line 148
    if-nez v1, :cond_5

    .line 149
    .line 150
    return v7

    .line 151
    :cond_5
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    if-gtz v2, :cond_6

    .line 156
    .line 157
    return v7

    .line 158
    :cond_6
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-static {v1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    throw v10

    .line 166
    :cond_7
    :goto_0
    return v7

    .line 167
    :pswitch_0
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    sget-object v2, LR0/l;->a:LR0/l;

    .line 172
    .line 173
    invoke-virtual {v2}, LR0/l;->q()LR0/B;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-static {v1, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    check-cast v1, LR0/a;

    .line 182
    .line 183
    if-eqz v1, :cond_8

    .line 184
    .line 185
    invoke-virtual {v1}, LR0/a;->a()LTd/i;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    check-cast v1, Lie/a;

    .line 190
    .line 191
    if-eqz v1, :cond_8

    .line 192
    .line 193
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    check-cast v1, Ljava/lang/Boolean;

    .line 198
    .line 199
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    return v1

    .line 204
    :cond_8
    return v7

    .line 205
    :pswitch_1
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    sget-object v2, LR0/l;->a:LR0/l;

    .line 210
    .line 211
    invoke-virtual {v2}, LR0/l;->p()LR0/B;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-static {v1, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    check-cast v1, LR0/a;

    .line 220
    .line 221
    if-eqz v1, :cond_9

    .line 222
    .line 223
    invoke-virtual {v1}, LR0/a;->a()LTd/i;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    check-cast v1, Lie/a;

    .line 228
    .line 229
    if-eqz v1, :cond_9

    .line 230
    .line 231
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    check-cast v1, Ljava/lang/Boolean;

    .line 236
    .line 237
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    return v1

    .line 242
    :cond_9
    return v7

    .line 243
    :pswitch_2
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    sget-object v2, LR0/l;->a:LR0/l;

    .line 248
    .line 249
    invoke-virtual {v2}, LR0/l;->o()LR0/B;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    invoke-static {v1, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    check-cast v1, LR0/a;

    .line 258
    .line 259
    if-eqz v1, :cond_a

    .line 260
    .line 261
    invoke-virtual {v1}, LR0/a;->a()LTd/i;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    check-cast v1, Lie/a;

    .line 266
    .line 267
    if-eqz v1, :cond_a

    .line 268
    .line 269
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    check-cast v1, Ljava/lang/Boolean;

    .line 274
    .line 275
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    return v1

    .line 280
    :cond_a
    return v7

    .line 281
    :pswitch_3
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    sget-object v2, LR0/l;->a:LR0/l;

    .line 286
    .line 287
    invoke-virtual {v2}, LR0/l;->r()LR0/B;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    invoke-static {v1, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    check-cast v1, LR0/a;

    .line 296
    .line 297
    if-eqz v1, :cond_b

    .line 298
    .line 299
    invoke-virtual {v1}, LR0/a;->a()LTd/i;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    check-cast v1, Lie/a;

    .line 304
    .line 305
    if-eqz v1, :cond_b

    .line 306
    .line 307
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    check-cast v1, Ljava/lang/Boolean;

    .line 312
    .line 313
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    return v1

    .line 318
    :cond_b
    return v7

    .line 319
    :sswitch_0
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    sget-object v2, LR0/l;->a:LR0/l;

    .line 324
    .line 325
    invoke-virtual {v2}, LR0/l;->m()LR0/B;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    invoke-static {v1, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    check-cast v1, LR0/a;

    .line 334
    .line 335
    if-eqz v1, :cond_c

    .line 336
    .line 337
    invoke-virtual {v1}, LR0/a;->a()LTd/i;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    check-cast v1, Lie/a;

    .line 342
    .line 343
    if-eqz v1, :cond_c

    .line 344
    .line 345
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    check-cast v1, Ljava/lang/Boolean;

    .line 350
    .line 351
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    return v1

    .line 356
    :cond_c
    return v7

    .line 357
    :sswitch_1
    if-eqz v3, :cond_e

    .line 358
    .line 359
    const-string v1, "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"

    .line 360
    .line 361
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 362
    .line 363
    .line 364
    move-result v2

    .line 365
    if-nez v2, :cond_d

    .line 366
    .line 367
    goto :goto_1

    .line 368
    :cond_d
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    sget-object v4, LR0/l;->a:LR0/l;

    .line 373
    .line 374
    invoke-virtual {v4}, LR0/l;->x()LR0/B;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    invoke-static {v2, v4}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    check-cast v2, LR0/a;

    .line 383
    .line 384
    if-eqz v2, :cond_e

    .line 385
    .line 386
    invoke-virtual {v2}, LR0/a;->a()LTd/i;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 391
    .line 392
    if-eqz v2, :cond_e

    .line 393
    .line 394
    invoke-virtual {v3, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 395
    .line 396
    .line 397
    move-result v1

    .line 398
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    check-cast v1, Ljava/lang/Boolean;

    .line 407
    .line 408
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    return v1

    .line 413
    :cond_e
    :goto_1
    return v7

    .line 414
    :sswitch_2
    invoke-virtual {v6}, LR0/s;->t()LR0/s;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    if-eqz v1, :cond_f

    .line 419
    .line 420
    invoke-virtual {v1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    if-eqz v2, :cond_f

    .line 425
    .line 426
    sget-object v3, LR0/l;->a:LR0/l;

    .line 427
    .line 428
    invoke-virtual {v3}, LR0/l;->u()LR0/B;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    invoke-static {v2, v3}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    check-cast v2, LR0/a;

    .line 437
    .line 438
    goto :goto_2

    .line 439
    :cond_f
    move-object v2, v10

    .line 440
    :goto_2
    if-eqz v1, :cond_11

    .line 441
    .line 442
    if-eqz v2, :cond_10

    .line 443
    .line 444
    goto :goto_3

    .line 445
    :cond_10
    invoke-virtual {v1}, LR0/s;->t()LR0/s;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    if-eqz v1, :cond_f

    .line 450
    .line 451
    invoke-virtual {v1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    if-eqz v2, :cond_f

    .line 456
    .line 457
    sget-object v3, LR0/l;->a:LR0/l;

    .line 458
    .line 459
    invoke-virtual {v3}, LR0/l;->u()LR0/B;

    .line 460
    .line 461
    .line 462
    move-result-object v3

    .line 463
    invoke-static {v2, v3}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    check-cast v2, LR0/a;

    .line 468
    .line 469
    goto :goto_2

    .line 470
    :cond_11
    :goto_3
    if-nez v1, :cond_12

    .line 471
    .line 472
    invoke-virtual {v6}, LR0/s;->k()Lr0/h;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    new-instance v2, Landroid/graphics/Rect;

    .line 477
    .line 478
    invoke-virtual {v1}, Lr0/h;->i()F

    .line 479
    .line 480
    .line 481
    move-result v3

    .line 482
    float-to-double v3, v3

    .line 483
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    .line 484
    .line 485
    .line 486
    move-result-wide v3

    .line 487
    double-to-float v3, v3

    .line 488
    float-to-int v3, v3

    .line 489
    invoke-virtual {v1}, Lr0/h;->l()F

    .line 490
    .line 491
    .line 492
    move-result v4

    .line 493
    float-to-double v4, v4

    .line 494
    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    .line 495
    .line 496
    .line 497
    move-result-wide v4

    .line 498
    double-to-float v4, v4

    .line 499
    float-to-int v4, v4

    .line 500
    invoke-virtual {v1}, Lr0/h;->j()F

    .line 501
    .line 502
    .line 503
    move-result v5

    .line 504
    float-to-double v5, v5

    .line 505
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 506
    .line 507
    .line 508
    move-result-wide v5

    .line 509
    double-to-float v5, v5

    .line 510
    invoke-static {v5}, Lke/a;->d(F)I

    .line 511
    .line 512
    .line 513
    move-result v5

    .line 514
    invoke-virtual {v1}, Lr0/h;->e()F

    .line 515
    .line 516
    .line 517
    move-result v1

    .line 518
    float-to-double v6, v1

    .line 519
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 520
    .line 521
    .line 522
    move-result-wide v6

    .line 523
    double-to-float v1, v6

    .line 524
    invoke-static {v1}, Lke/a;->d(F)I

    .line 525
    .line 526
    .line 527
    move-result v1

    .line 528
    invoke-direct {v2, v3, v4, v5, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 529
    .line 530
    .line 531
    iget-object v1, v0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 532
    .line 533
    invoke-virtual {v1, v2}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;)Z

    .line 534
    .line 535
    .line 536
    move-result v1

    .line 537
    return v1

    .line 538
    :cond_12
    invoke-virtual {v1}, LR0/s;->r()LI0/t;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    invoke-interface {v3}, LI0/t;->x()LI0/p;

    .line 543
    .line 544
    .line 545
    move-result-object v3

    .line 546
    invoke-static {v3}, LI0/q;->a(LI0/p;)Lr0/h;

    .line 547
    .line 548
    .line 549
    move-result-object v3

    .line 550
    invoke-virtual {v1}, LR0/s;->r()LI0/t;

    .line 551
    .line 552
    .line 553
    move-result-object v4

    .line 554
    invoke-interface {v4}, LI0/t;->x()LI0/p;

    .line 555
    .line 556
    .line 557
    move-result-object v4

    .line 558
    invoke-interface {v4}, LI0/p;->x0()LI0/p;

    .line 559
    .line 560
    .line 561
    move-result-object v4

    .line 562
    if-eqz v4, :cond_13

    .line 563
    .line 564
    invoke-static {v4}, LI0/q;->e(LI0/p;)J

    .line 565
    .line 566
    .line 567
    move-result-wide v4

    .line 568
    goto :goto_4

    .line 569
    :cond_13
    sget-object v4, Lr0/f;->b:Lr0/f$a;

    .line 570
    .line 571
    invoke-virtual {v4}, Lr0/f$a;->c()J

    .line 572
    .line 573
    .line 574
    move-result-wide v4

    .line 575
    :goto_4
    invoke-virtual {v3, v4, v5}, Lr0/h;->t(J)Lr0/h;

    .line 576
    .line 577
    .line 578
    move-result-object v3

    .line 579
    invoke-virtual {v6}, LR0/s;->u()J

    .line 580
    .line 581
    .line 582
    move-result-wide v4

    .line 583
    invoke-virtual {v6}, LR0/s;->w()J

    .line 584
    .line 585
    .line 586
    move-result-wide v8

    .line 587
    invoke-static {v8, v9}, Li1/s;->d(J)J

    .line 588
    .line 589
    .line 590
    move-result-wide v8

    .line 591
    invoke-static {v4, v5, v8, v9}, Lr0/i;->b(JJ)Lr0/h;

    .line 592
    .line 593
    .line 594
    move-result-object v4

    .line 595
    invoke-virtual {v1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 596
    .line 597
    .line 598
    move-result-object v5

    .line 599
    sget-object v8, LR0/x;->a:LR0/x;

    .line 600
    .line 601
    invoke-virtual {v8}, LR0/x;->l()LR0/B;

    .line 602
    .line 603
    .line 604
    move-result-object v9

    .line 605
    invoke-static {v5, v9}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v5

    .line 609
    check-cast v5, LR0/j;

    .line 610
    .line 611
    invoke-virtual {v1}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    invoke-virtual {v8}, LR0/x;->O()LR0/B;

    .line 616
    .line 617
    .line 618
    move-result-object v8

    .line 619
    invoke-static {v1, v8}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    check-cast v1, LR0/j;

    .line 624
    .line 625
    invoke-virtual {v4}, Lr0/h;->i()F

    .line 626
    .line 627
    .line 628
    move-result v8

    .line 629
    invoke-virtual {v3}, Lr0/h;->i()F

    .line 630
    .line 631
    .line 632
    move-result v9

    .line 633
    sub-float/2addr v8, v9

    .line 634
    invoke-virtual {v4}, Lr0/h;->j()F

    .line 635
    .line 636
    .line 637
    move-result v9

    .line 638
    invoke-virtual {v3}, Lr0/h;->j()F

    .line 639
    .line 640
    .line 641
    move-result v10

    .line 642
    sub-float/2addr v9, v10

    .line 643
    invoke-static {v8, v9}, Landroidx/compose/ui/platform/y;->x0(FF)F

    .line 644
    .line 645
    .line 646
    move-result v8

    .line 647
    if-eqz v5, :cond_14

    .line 648
    .line 649
    invoke-virtual {v5}, LR0/j;->b()Z

    .line 650
    .line 651
    .line 652
    move-result v5

    .line 653
    if-ne v5, v11, :cond_14

    .line 654
    .line 655
    neg-float v8, v8

    .line 656
    :cond_14
    invoke-static {v6}, Landroidx/compose/ui/platform/z;->h(LR0/s;)Z

    .line 657
    .line 658
    .line 659
    move-result v5

    .line 660
    if-eqz v5, :cond_15

    .line 661
    .line 662
    neg-float v8, v8

    .line 663
    :cond_15
    invoke-virtual {v4}, Lr0/h;->l()F

    .line 664
    .line 665
    .line 666
    move-result v5

    .line 667
    invoke-virtual {v3}, Lr0/h;->l()F

    .line 668
    .line 669
    .line 670
    move-result v6

    .line 671
    sub-float/2addr v5, v6

    .line 672
    invoke-virtual {v4}, Lr0/h;->e()F

    .line 673
    .line 674
    .line 675
    move-result v4

    .line 676
    invoke-virtual {v3}, Lr0/h;->e()F

    .line 677
    .line 678
    .line 679
    move-result v3

    .line 680
    sub-float/2addr v4, v3

    .line 681
    invoke-static {v5, v4}, Landroidx/compose/ui/platform/y;->x0(FF)F

    .line 682
    .line 683
    .line 684
    move-result v3

    .line 685
    if-eqz v1, :cond_16

    .line 686
    .line 687
    invoke-virtual {v1}, LR0/j;->b()Z

    .line 688
    .line 689
    .line 690
    move-result v1

    .line 691
    if-ne v1, v11, :cond_16

    .line 692
    .line 693
    neg-float v3, v3

    .line 694
    :cond_16
    if-eqz v2, :cond_17

    .line 695
    .line 696
    invoke-virtual {v2}, LR0/a;->a()LTd/i;

    .line 697
    .line 698
    .line 699
    move-result-object v1

    .line 700
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 701
    .line 702
    if-eqz v1, :cond_17

    .line 703
    .line 704
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 705
    .line 706
    .line 707
    move-result-object v2

    .line 708
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 709
    .line 710
    .line 711
    move-result-object v3

    .line 712
    invoke-interface {v1, v2, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v1

    .line 716
    check-cast v1, Ljava/lang/Boolean;

    .line 717
    .line 718
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 719
    .line 720
    .line 721
    move-result v1

    .line 722
    if-ne v1, v11, :cond_17

    .line 723
    .line 724
    return v11

    .line 725
    :cond_17
    return v7

    .line 726
    :sswitch_3
    if-eqz v3, :cond_18

    .line 727
    .line 728
    const-string v1, "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"

    .line 729
    .line 730
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object v1

    .line 734
    goto :goto_5

    .line 735
    :cond_18
    move-object v1, v10

    .line 736
    :goto_5
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 737
    .line 738
    .line 739
    move-result-object v2

    .line 740
    sget-object v3, LR0/l;->a:LR0/l;

    .line 741
    .line 742
    invoke-virtual {v3}, LR0/l;->z()LR0/B;

    .line 743
    .line 744
    .line 745
    move-result-object v3

    .line 746
    invoke-static {v2, v3}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v2

    .line 750
    check-cast v2, LR0/a;

    .line 751
    .line 752
    if-eqz v2, :cond_1a

    .line 753
    .line 754
    invoke-virtual {v2}, LR0/a;->a()LTd/i;

    .line 755
    .line 756
    .line 757
    move-result-object v2

    .line 758
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 759
    .line 760
    if-eqz v2, :cond_1a

    .line 761
    .line 762
    new-instance v3, LU0/e;

    .line 763
    .line 764
    if-nez v1, :cond_19

    .line 765
    .line 766
    const-string v1, ""

    .line 767
    .line 768
    :cond_19
    invoke-direct {v3, v1, v10, v8, v10}, LU0/e;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 769
    .line 770
    .line 771
    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v1

    .line 775
    check-cast v1, Ljava/lang/Boolean;

    .line 776
    .line 777
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 778
    .line 779
    .line 780
    move-result v1

    .line 781
    return v1

    .line 782
    :cond_1a
    return v7

    .line 783
    :sswitch_4
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 784
    .line 785
    .line 786
    move-result-object v1

    .line 787
    sget-object v2, LR0/l;->a:LR0/l;

    .line 788
    .line 789
    invoke-virtual {v2}, LR0/l;->f()LR0/B;

    .line 790
    .line 791
    .line 792
    move-result-object v2

    .line 793
    invoke-static {v1, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 794
    .line 795
    .line 796
    move-result-object v1

    .line 797
    check-cast v1, LR0/a;

    .line 798
    .line 799
    if-eqz v1, :cond_1b

    .line 800
    .line 801
    invoke-virtual {v1}, LR0/a;->a()LTd/i;

    .line 802
    .line 803
    .line 804
    move-result-object v1

    .line 805
    check-cast v1, Lie/a;

    .line 806
    .line 807
    if-eqz v1, :cond_1b

    .line 808
    .line 809
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v1

    .line 813
    check-cast v1, Ljava/lang/Boolean;

    .line 814
    .line 815
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 816
    .line 817
    .line 818
    move-result v1

    .line 819
    return v1

    .line 820
    :cond_1b
    return v7

    .line 821
    :sswitch_5
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 822
    .line 823
    .line 824
    move-result-object v1

    .line 825
    sget-object v2, LR0/l;->a:LR0/l;

    .line 826
    .line 827
    invoke-virtual {v2}, LR0/l;->b()LR0/B;

    .line 828
    .line 829
    .line 830
    move-result-object v2

    .line 831
    invoke-static {v1, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 832
    .line 833
    .line 834
    move-result-object v1

    .line 835
    check-cast v1, LR0/a;

    .line 836
    .line 837
    if-eqz v1, :cond_1c

    .line 838
    .line 839
    invoke-virtual {v1}, LR0/a;->a()LTd/i;

    .line 840
    .line 841
    .line 842
    move-result-object v1

    .line 843
    check-cast v1, Lie/a;

    .line 844
    .line 845
    if-eqz v1, :cond_1c

    .line 846
    .line 847
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v1

    .line 851
    check-cast v1, Ljava/lang/Boolean;

    .line 852
    .line 853
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 854
    .line 855
    .line 856
    move-result v1

    .line 857
    return v1

    .line 858
    :cond_1c
    return v7

    .line 859
    :sswitch_6
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 860
    .line 861
    .line 862
    move-result-object v1

    .line 863
    sget-object v2, LR0/l;->a:LR0/l;

    .line 864
    .line 865
    invoke-virtual {v2}, LR0/l;->g()LR0/B;

    .line 866
    .line 867
    .line 868
    move-result-object v2

    .line 869
    invoke-static {v1, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v1

    .line 873
    check-cast v1, LR0/a;

    .line 874
    .line 875
    if-eqz v1, :cond_1d

    .line 876
    .line 877
    invoke-virtual {v1}, LR0/a;->a()LTd/i;

    .line 878
    .line 879
    .line 880
    move-result-object v1

    .line 881
    check-cast v1, Lie/a;

    .line 882
    .line 883
    if-eqz v1, :cond_1d

    .line 884
    .line 885
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 886
    .line 887
    .line 888
    move-result-object v1

    .line 889
    check-cast v1, Ljava/lang/Boolean;

    .line 890
    .line 891
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 892
    .line 893
    .line 894
    move-result v1

    .line 895
    return v1

    .line 896
    :cond_1d
    return v7

    .line 897
    :sswitch_7
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 898
    .line 899
    .line 900
    move-result-object v1

    .line 901
    sget-object v2, LR0/l;->a:LR0/l;

    .line 902
    .line 903
    invoke-virtual {v2}, LR0/l;->e()LR0/B;

    .line 904
    .line 905
    .line 906
    move-result-object v2

    .line 907
    invoke-static {v1, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    move-result-object v1

    .line 911
    check-cast v1, LR0/a;

    .line 912
    .line 913
    if-eqz v1, :cond_1e

    .line 914
    .line 915
    invoke-virtual {v1}, LR0/a;->a()LTd/i;

    .line 916
    .line 917
    .line 918
    move-result-object v1

    .line 919
    check-cast v1, Lie/a;

    .line 920
    .line 921
    if-eqz v1, :cond_1e

    .line 922
    .line 923
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 924
    .line 925
    .line 926
    move-result-object v1

    .line 927
    check-cast v1, Ljava/lang/Boolean;

    .line 928
    .line 929
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 930
    .line 931
    .line 932
    move-result v1

    .line 933
    return v1

    .line 934
    :cond_1e
    return v7

    .line 935
    :sswitch_8
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 936
    .line 937
    .line 938
    move-result-object v1

    .line 939
    sget-object v2, LR0/l;->a:LR0/l;

    .line 940
    .line 941
    invoke-virtual {v2}, LR0/l;->s()LR0/B;

    .line 942
    .line 943
    .line 944
    move-result-object v2

    .line 945
    invoke-static {v1, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 946
    .line 947
    .line 948
    move-result-object v1

    .line 949
    check-cast v1, LR0/a;

    .line 950
    .line 951
    if-eqz v1, :cond_1f

    .line 952
    .line 953
    invoke-virtual {v1}, LR0/a;->a()LTd/i;

    .line 954
    .line 955
    .line 956
    move-result-object v1

    .line 957
    check-cast v1, Lie/a;

    .line 958
    .line 959
    if-eqz v1, :cond_1f

    .line 960
    .line 961
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    move-result-object v1

    .line 965
    check-cast v1, Ljava/lang/Boolean;

    .line 966
    .line 967
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 968
    .line 969
    .line 970
    move-result v1

    .line 971
    return v1

    .line 972
    :cond_1f
    return v7

    .line 973
    :pswitch_4
    :sswitch_9
    const/16 v1, 0x1000

    .line 974
    .line 975
    if-ne v2, v1, :cond_20

    .line 976
    .line 977
    move v1, v11

    .line 978
    goto :goto_6

    .line 979
    :cond_20
    move v1, v7

    .line 980
    :goto_6
    const/16 v3, 0x2000

    .line 981
    .line 982
    if-ne v2, v3, :cond_21

    .line 983
    .line 984
    move v3, v11

    .line 985
    goto :goto_7

    .line 986
    :cond_21
    move v3, v7

    .line 987
    :goto_7
    const v8, 0x1020039

    .line 988
    .line 989
    .line 990
    if-ne v2, v8, :cond_22

    .line 991
    .line 992
    move v8, v11

    .line 993
    goto :goto_8

    .line 994
    :cond_22
    move v8, v7

    .line 995
    :goto_8
    const v10, 0x102003b

    .line 996
    .line 997
    .line 998
    if-ne v2, v10, :cond_23

    .line 999
    .line 1000
    move v10, v11

    .line 1001
    goto :goto_9

    .line 1002
    :cond_23
    move v10, v7

    .line 1003
    :goto_9
    const v12, 0x1020038

    .line 1004
    .line 1005
    .line 1006
    if-ne v2, v12, :cond_24

    .line 1007
    .line 1008
    move v12, v11

    .line 1009
    goto :goto_a

    .line 1010
    :cond_24
    move v12, v7

    .line 1011
    :goto_a
    const v13, 0x102003a

    .line 1012
    .line 1013
    .line 1014
    if-ne v2, v13, :cond_25

    .line 1015
    .line 1016
    move v2, v11

    .line 1017
    goto :goto_b

    .line 1018
    :cond_25
    move v2, v7

    .line 1019
    :goto_b
    if-nez v8, :cond_27

    .line 1020
    .line 1021
    if-nez v10, :cond_27

    .line 1022
    .line 1023
    if-nez v1, :cond_27

    .line 1024
    .line 1025
    if-eqz v3, :cond_26

    .line 1026
    .line 1027
    goto :goto_c

    .line 1028
    :cond_26
    move v13, v7

    .line 1029
    goto :goto_d

    .line 1030
    :cond_27
    :goto_c
    move v13, v11

    .line 1031
    :goto_d
    if-nez v12, :cond_29

    .line 1032
    .line 1033
    if-nez v2, :cond_29

    .line 1034
    .line 1035
    if-nez v1, :cond_29

    .line 1036
    .line 1037
    if-eqz v3, :cond_28

    .line 1038
    .line 1039
    goto :goto_e

    .line 1040
    :cond_28
    move v2, v7

    .line 1041
    goto :goto_f

    .line 1042
    :cond_29
    :goto_e
    move v2, v11

    .line 1043
    :goto_f
    if-nez v1, :cond_2a

    .line 1044
    .line 1045
    if-eqz v3, :cond_2e

    .line 1046
    .line 1047
    :cond_2a
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v1

    .line 1051
    invoke-virtual {v9}, LR0/x;->C()LR0/B;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v14

    .line 1055
    invoke-static {v1, v14}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v1

    .line 1059
    check-cast v1, LR0/g;

    .line 1060
    .line 1061
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v14

    .line 1065
    sget-object v15, LR0/l;->a:LR0/l;

    .line 1066
    .line 1067
    invoke-virtual {v15}, LR0/l;->x()LR0/B;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v15

    .line 1071
    invoke-static {v14, v15}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v14

    .line 1075
    check-cast v14, LR0/a;

    .line 1076
    .line 1077
    if-eqz v1, :cond_2e

    .line 1078
    .line 1079
    if-eqz v14, :cond_2e

    .line 1080
    .line 1081
    invoke-virtual {v1}, LR0/g;->c()Loe/b;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v2

    .line 1085
    invoke-interface {v2}, Loe/c;->e()Ljava/lang/Comparable;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v2

    .line 1089
    check-cast v2, Ljava/lang/Number;

    .line 1090
    .line 1091
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 1092
    .line 1093
    .line 1094
    move-result v2

    .line 1095
    invoke-virtual {v1}, LR0/g;->c()Loe/b;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v4

    .line 1099
    invoke-interface {v4}, Loe/c;->b()Ljava/lang/Comparable;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v4

    .line 1103
    check-cast v4, Ljava/lang/Number;

    .line 1104
    .line 1105
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 1106
    .line 1107
    .line 1108
    move-result v4

    .line 1109
    invoke-static {v2, v4}, Loe/j;->d(FF)F

    .line 1110
    .line 1111
    .line 1112
    move-result v2

    .line 1113
    invoke-virtual {v1}, LR0/g;->c()Loe/b;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v4

    .line 1117
    invoke-interface {v4}, Loe/c;->b()Ljava/lang/Comparable;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v4

    .line 1121
    check-cast v4, Ljava/lang/Number;

    .line 1122
    .line 1123
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 1124
    .line 1125
    .line 1126
    move-result v4

    .line 1127
    invoke-virtual {v1}, LR0/g;->c()Loe/b;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v5

    .line 1131
    invoke-interface {v5}, Loe/c;->e()Ljava/lang/Comparable;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v5

    .line 1135
    check-cast v5, Ljava/lang/Number;

    .line 1136
    .line 1137
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 1138
    .line 1139
    .line 1140
    move-result v5

    .line 1141
    invoke-static {v4, v5}, Loe/j;->h(FF)F

    .line 1142
    .line 1143
    .line 1144
    move-result v4

    .line 1145
    invoke-virtual {v1}, LR0/g;->d()I

    .line 1146
    .line 1147
    .line 1148
    move-result v5

    .line 1149
    if-lez v5, :cond_2b

    .line 1150
    .line 1151
    sub-float/2addr v2, v4

    .line 1152
    invoke-virtual {v1}, LR0/g;->d()I

    .line 1153
    .line 1154
    .line 1155
    move-result v4

    .line 1156
    add-int/2addr v4, v11

    .line 1157
    :goto_10
    int-to-float v4, v4

    .line 1158
    div-float/2addr v2, v4

    .line 1159
    goto :goto_11

    .line 1160
    :cond_2b
    sub-float/2addr v2, v4

    .line 1161
    const/16 v4, 0x14

    .line 1162
    .line 1163
    goto :goto_10

    .line 1164
    :goto_11
    if-eqz v3, :cond_2c

    .line 1165
    .line 1166
    neg-float v2, v2

    .line 1167
    :cond_2c
    invoke-virtual {v14}, LR0/a;->a()LTd/i;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v3

    .line 1171
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 1172
    .line 1173
    if-eqz v3, :cond_2d

    .line 1174
    .line 1175
    invoke-virtual {v1}, LR0/g;->b()F

    .line 1176
    .line 1177
    .line 1178
    move-result v1

    .line 1179
    add-float/2addr v1, v2

    .line 1180
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v1

    .line 1184
    invoke-interface {v3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v1

    .line 1188
    check-cast v1, Ljava/lang/Boolean;

    .line 1189
    .line 1190
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1191
    .line 1192
    .line 1193
    move-result v1

    .line 1194
    return v1

    .line 1195
    :cond_2d
    return v7

    .line 1196
    :cond_2e
    invoke-virtual {v6}, LR0/s;->r()LI0/t;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v1

    .line 1200
    invoke-interface {v1}, LI0/t;->x()LI0/p;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v1

    .line 1204
    invoke-static {v1}, LI0/q;->a(LI0/p;)Lr0/h;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v1

    .line 1208
    invoke-virtual {v1}, Lr0/h;->k()J

    .line 1209
    .line 1210
    .line 1211
    move-result-wide v14

    .line 1212
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v1

    .line 1216
    invoke-static {v1}, Landroidx/compose/ui/platform/m1;->b(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Ljava/lang/Float;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v1

    .line 1220
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v11

    .line 1224
    sget-object v16, LR0/l;->a:LR0/l;

    .line 1225
    .line 1226
    move/from16 v17, v4

    .line 1227
    .line 1228
    invoke-virtual/range {v16 .. v16}, LR0/l;->u()LR0/B;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v4

    .line 1232
    invoke-static {v11, v4}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v4

    .line 1236
    check-cast v4, LR0/a;

    .line 1237
    .line 1238
    if-nez v4, :cond_2f

    .line 1239
    .line 1240
    return v7

    .line 1241
    :cond_2f
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v11

    .line 1245
    move/from16 v18, v7

    .line 1246
    .line 1247
    invoke-virtual {v9}, LR0/x;->l()LR0/B;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v7

    .line 1251
    invoke-static {v11, v7}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v7

    .line 1255
    check-cast v7, LR0/j;

    .line 1256
    .line 1257
    if-eqz v7, :cond_3b

    .line 1258
    .line 1259
    if-eqz v13, :cond_3b

    .line 1260
    .line 1261
    if-eqz v1, :cond_30

    .line 1262
    .line 1263
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 1264
    .line 1265
    .line 1266
    move-result v11

    .line 1267
    move-object/from16 p1, v1

    .line 1268
    .line 1269
    goto :goto_12

    .line 1270
    :cond_30
    const/16 v11, 0x20

    .line 1271
    .line 1272
    move-object/from16 p1, v1

    .line 1273
    .line 1274
    shr-long v0, v14, v11

    .line 1275
    .line 1276
    long-to-int v0, v0

    .line 1277
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1278
    .line 1279
    .line 1280
    move-result v11

    .line 1281
    :goto_12
    if-nez v8, :cond_31

    .line 1282
    .line 1283
    if-eqz v3, :cond_32

    .line 1284
    .line 1285
    :cond_31
    neg-float v11, v11

    .line 1286
    :cond_32
    invoke-virtual {v7}, LR0/j;->b()Z

    .line 1287
    .line 1288
    .line 1289
    move-result v0

    .line 1290
    if-eqz v0, :cond_33

    .line 1291
    .line 1292
    neg-float v11, v11

    .line 1293
    :cond_33
    invoke-static {v6}, Landroidx/compose/ui/platform/z;->h(LR0/s;)Z

    .line 1294
    .line 1295
    .line 1296
    move-result v0

    .line 1297
    if-eqz v0, :cond_35

    .line 1298
    .line 1299
    if-nez v8, :cond_34

    .line 1300
    .line 1301
    if-eqz v10, :cond_35

    .line 1302
    .line 1303
    :cond_34
    neg-float v11, v11

    .line 1304
    :cond_35
    invoke-static {v7, v11}, Landroidx/compose/ui/platform/y;->w0(LR0/j;F)Z

    .line 1305
    .line 1306
    .line 1307
    move-result v0

    .line 1308
    if-eqz v0, :cond_3c

    .line 1309
    .line 1310
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v0

    .line 1314
    invoke-virtual/range {v16 .. v16}, LR0/l;->p()LR0/B;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v1

    .line 1318
    invoke-virtual {v0, v1}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 1319
    .line 1320
    .line 1321
    move-result v0

    .line 1322
    if-nez v0, :cond_38

    .line 1323
    .line 1324
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v0

    .line 1328
    invoke-virtual/range {v16 .. v16}, LR0/l;->q()LR0/B;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v1

    .line 1332
    invoke-virtual {v0, v1}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 1333
    .line 1334
    .line 1335
    move-result v0

    .line 1336
    if-eqz v0, :cond_36

    .line 1337
    .line 1338
    goto :goto_13

    .line 1339
    :cond_36
    invoke-virtual {v4}, LR0/a;->a()LTd/i;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v0

    .line 1343
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 1344
    .line 1345
    if-eqz v0, :cond_37

    .line 1346
    .line 1347
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v1

    .line 1351
    invoke-interface {v0, v1, v5}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v0

    .line 1355
    check-cast v0, Ljava/lang/Boolean;

    .line 1356
    .line 1357
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1358
    .line 1359
    .line 1360
    move-result v0

    .line 1361
    return v0

    .line 1362
    :cond_37
    return v18

    .line 1363
    :cond_38
    :goto_13
    cmpl-float v0, v11, v17

    .line 1364
    .line 1365
    if-lez v0, :cond_39

    .line 1366
    .line 1367
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v0

    .line 1371
    invoke-virtual/range {v16 .. v16}, LR0/l;->q()LR0/B;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v1

    .line 1375
    invoke-static {v0, v1}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v0

    .line 1379
    check-cast v0, LR0/a;

    .line 1380
    .line 1381
    goto :goto_14

    .line 1382
    :cond_39
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v0

    .line 1386
    invoke-virtual/range {v16 .. v16}, LR0/l;->p()LR0/B;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v1

    .line 1390
    invoke-static {v0, v1}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v0

    .line 1394
    check-cast v0, LR0/a;

    .line 1395
    .line 1396
    :goto_14
    if-eqz v0, :cond_3a

    .line 1397
    .line 1398
    invoke-virtual {v0}, LR0/a;->a()LTd/i;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v0

    .line 1402
    check-cast v0, Lie/a;

    .line 1403
    .line 1404
    if-eqz v0, :cond_3a

    .line 1405
    .line 1406
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v0

    .line 1410
    check-cast v0, Ljava/lang/Boolean;

    .line 1411
    .line 1412
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1413
    .line 1414
    .line 1415
    move-result v0

    .line 1416
    return v0

    .line 1417
    :cond_3a
    return v18

    .line 1418
    :cond_3b
    move-object/from16 p1, v1

    .line 1419
    .line 1420
    :cond_3c
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v0

    .line 1424
    invoke-virtual {v9}, LR0/x;->O()LR0/B;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v1

    .line 1428
    invoke-static {v0, v1}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v0

    .line 1432
    check-cast v0, LR0/j;

    .line 1433
    .line 1434
    if-eqz v0, :cond_45

    .line 1435
    .line 1436
    if-eqz v2, :cond_45

    .line 1437
    .line 1438
    if-eqz p1, :cond_3d

    .line 1439
    .line 1440
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Float;->floatValue()F

    .line 1441
    .line 1442
    .line 1443
    move-result v1

    .line 1444
    goto :goto_15

    .line 1445
    :cond_3d
    const-wide v1, 0xffffffffL

    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    and-long/2addr v1, v14

    .line 1451
    long-to-int v1, v1

    .line 1452
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1453
    .line 1454
    .line 1455
    move-result v1

    .line 1456
    :goto_15
    if-nez v12, :cond_3e

    .line 1457
    .line 1458
    if-eqz v3, :cond_3f

    .line 1459
    .line 1460
    :cond_3e
    neg-float v1, v1

    .line 1461
    :cond_3f
    invoke-virtual {v0}, LR0/j;->b()Z

    .line 1462
    .line 1463
    .line 1464
    move-result v2

    .line 1465
    if-eqz v2, :cond_40

    .line 1466
    .line 1467
    neg-float v1, v1

    .line 1468
    :cond_40
    invoke-static {v0, v1}, Landroidx/compose/ui/platform/y;->w0(LR0/j;F)Z

    .line 1469
    .line 1470
    .line 1471
    move-result v0

    .line 1472
    if-eqz v0, :cond_45

    .line 1473
    .line 1474
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v0

    .line 1478
    invoke-virtual/range {v16 .. v16}, LR0/l;->r()LR0/B;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v2

    .line 1482
    invoke-virtual {v0, v2}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 1483
    .line 1484
    .line 1485
    move-result v0

    .line 1486
    if-nez v0, :cond_43

    .line 1487
    .line 1488
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v0

    .line 1492
    invoke-virtual/range {v16 .. v16}, LR0/l;->o()LR0/B;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v2

    .line 1496
    invoke-virtual {v0, v2}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 1497
    .line 1498
    .line 1499
    move-result v0

    .line 1500
    if-eqz v0, :cond_41

    .line 1501
    .line 1502
    goto :goto_16

    .line 1503
    :cond_41
    invoke-virtual {v4}, LR0/a;->a()LTd/i;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v0

    .line 1507
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 1508
    .line 1509
    if-eqz v0, :cond_42

    .line 1510
    .line 1511
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v1

    .line 1515
    invoke-interface {v0, v5, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v0

    .line 1519
    check-cast v0, Ljava/lang/Boolean;

    .line 1520
    .line 1521
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1522
    .line 1523
    .line 1524
    move-result v0

    .line 1525
    return v0

    .line 1526
    :cond_42
    return v18

    .line 1527
    :cond_43
    :goto_16
    cmpl-float v0, v1, v17

    .line 1528
    .line 1529
    if-lez v0, :cond_44

    .line 1530
    .line 1531
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v0

    .line 1535
    invoke-virtual/range {v16 .. v16}, LR0/l;->o()LR0/B;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v1

    .line 1539
    invoke-static {v0, v1}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v0

    .line 1543
    check-cast v0, LR0/a;

    .line 1544
    .line 1545
    goto :goto_17

    .line 1546
    :cond_44
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v0

    .line 1550
    invoke-virtual/range {v16 .. v16}, LR0/l;->r()LR0/B;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v1

    .line 1554
    invoke-static {v0, v1}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v0

    .line 1558
    check-cast v0, LR0/a;

    .line 1559
    .line 1560
    :goto_17
    if-eqz v0, :cond_45

    .line 1561
    .line 1562
    invoke-virtual {v0}, LR0/a;->a()LTd/i;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v0

    .line 1566
    check-cast v0, Lie/a;

    .line 1567
    .line 1568
    if-eqz v0, :cond_45

    .line 1569
    .line 1570
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v0

    .line 1574
    check-cast v0, Ljava/lang/Boolean;

    .line 1575
    .line 1576
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1577
    .line 1578
    .line 1579
    move-result v0

    .line 1580
    return v0

    .line 1581
    :cond_45
    return v18

    .line 1582
    :sswitch_a
    move/from16 v18, v7

    .line 1583
    .line 1584
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v0

    .line 1588
    sget-object v1, LR0/l;->a:LR0/l;

    .line 1589
    .line 1590
    invoke-virtual {v1}, LR0/l;->n()LR0/B;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v1

    .line 1594
    invoke-static {v0, v1}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v0

    .line 1598
    check-cast v0, LR0/a;

    .line 1599
    .line 1600
    if-eqz v0, :cond_46

    .line 1601
    .line 1602
    invoke-virtual {v0}, LR0/a;->a()LTd/i;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v0

    .line 1606
    check-cast v0, Lie/a;

    .line 1607
    .line 1608
    if-eqz v0, :cond_46

    .line 1609
    .line 1610
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1611
    .line 1612
    .line 1613
    move-result-object v0

    .line 1614
    check-cast v0, Ljava/lang/Boolean;

    .line 1615
    .line 1616
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1617
    .line 1618
    .line 1619
    move-result v0

    .line 1620
    return v0

    .line 1621
    :cond_46
    return v18

    .line 1622
    :sswitch_b
    move/from16 v18, v7

    .line 1623
    .line 1624
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v0

    .line 1628
    sget-object v2, LR0/l;->a:LR0/l;

    .line 1629
    .line 1630
    invoke-virtual {v2}, LR0/l;->l()LR0/B;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v2

    .line 1634
    invoke-static {v0, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v0

    .line 1638
    check-cast v0, LR0/a;

    .line 1639
    .line 1640
    if-eqz v0, :cond_47

    .line 1641
    .line 1642
    invoke-virtual {v0}, LR0/a;->a()LTd/i;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v0

    .line 1646
    check-cast v0, Lie/a;

    .line 1647
    .line 1648
    if-eqz v0, :cond_47

    .line 1649
    .line 1650
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v0

    .line 1654
    move-object v10, v0

    .line 1655
    check-cast v10, Ljava/lang/Boolean;

    .line 1656
    .line 1657
    :cond_47
    const/16 v5, 0xc

    .line 1658
    .line 1659
    const/4 v6, 0x0

    .line 1660
    const/4 v2, 0x1

    .line 1661
    const/4 v3, 0x0

    .line 1662
    const/4 v4, 0x0

    .line 1663
    move-object/from16 v0, p0

    .line 1664
    .line 1665
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/y;->J0(Landroidx/compose/ui/platform/y;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    .line 1666
    .line 1667
    .line 1668
    if-eqz v10, :cond_48

    .line 1669
    .line 1670
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1671
    .line 1672
    .line 1673
    move-result v1

    .line 1674
    return v1

    .line 1675
    :cond_48
    return v18

    .line 1676
    :cond_49
    move/from16 v18, v7

    .line 1677
    .line 1678
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v1

    .line 1682
    invoke-virtual {v9}, LR0/x;->i()LR0/B;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v2

    .line 1686
    invoke-static {v1, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v1

    .line 1690
    invoke-static {v1, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1691
    .line 1692
    .line 1693
    move-result v1

    .line 1694
    if-eqz v1, :cond_4a

    .line 1695
    .line 1696
    iget-object v1, v0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 1697
    .line 1698
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lq0/j;

    .line 1699
    .line 1700
    .line 1701
    move-result-object v1

    .line 1702
    sget-object v2, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    .line 1703
    .line 1704
    invoke-virtual {v2}, Landroidx/compose/ui/focus/d$a;->c()I

    .line 1705
    .line 1706
    .line 1707
    move-result v2

    .line 1708
    move/from16 v3, v18

    .line 1709
    .line 1710
    invoke-interface {v1, v3, v11, v11, v2}, Lq0/j;->p(ZZZI)Z

    .line 1711
    .line 1712
    .line 1713
    return v11

    .line 1714
    :cond_4a
    move/from16 v3, v18

    .line 1715
    .line 1716
    return v3

    .line 1717
    :cond_4b
    sget-boolean v1, Ll0/h;->f:Z

    .line 1718
    .line 1719
    if-eqz v1, :cond_4c

    .line 1720
    .line 1721
    iget-object v1, v0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 1722
    .line 1723
    invoke-virtual {v1}, Landroid/view/View;->isInTouchMode()Z

    .line 1724
    .line 1725
    .line 1726
    move-result v1

    .line 1727
    if-eqz v1, :cond_4c

    .line 1728
    .line 1729
    iget-object v1, v0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 1730
    .line 1731
    invoke-virtual {v1}, Landroid/view/View;->requestFocusFromTouch()Z

    .line 1732
    .line 1733
    .line 1734
    :cond_4c
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v1

    .line 1738
    sget-object v2, LR0/l;->a:LR0/l;

    .line 1739
    .line 1740
    invoke-virtual {v2}, LR0/l;->t()LR0/B;

    .line 1741
    .line 1742
    .line 1743
    move-result-object v2

    .line 1744
    invoke-static {v1, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v1

    .line 1748
    check-cast v1, LR0/a;

    .line 1749
    .line 1750
    if-eqz v1, :cond_4d

    .line 1751
    .line 1752
    invoke-virtual {v1}, LR0/a;->a()LTd/i;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v1

    .line 1756
    check-cast v1, Lie/a;

    .line 1757
    .line 1758
    if-eqz v1, :cond_4d

    .line 1759
    .line 1760
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v1

    .line 1764
    check-cast v1, Ljava/lang/Boolean;

    .line 1765
    .line 1766
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1767
    .line 1768
    .line 1769
    move-result v1

    .line 1770
    return v1

    .line 1771
    :cond_4d
    const/16 v18, 0x0

    .line 1772
    .line 1773
    return v18

    .line 1774
    :cond_4e
    const/4 v1, -0x1

    .line 1775
    if-eqz v3, :cond_4f

    .line 1776
    .line 1777
    const-string v2, "ACTION_ARGUMENT_SELECTION_START_INT"

    .line 1778
    .line 1779
    invoke-virtual {v3, v2, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1780
    .line 1781
    .line 1782
    move-result v2

    .line 1783
    goto :goto_18

    .line 1784
    :cond_4f
    move v2, v1

    .line 1785
    :goto_18
    if-eqz v3, :cond_50

    .line 1786
    .line 1787
    const-string v4, "ACTION_ARGUMENT_SELECTION_END_INT"

    .line 1788
    .line 1789
    invoke-virtual {v3, v4, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1790
    .line 1791
    .line 1792
    move-result v1

    .line 1793
    :cond_50
    const/4 v3, 0x0

    .line 1794
    invoke-direct {v0, v6, v2, v1, v3}, Landroidx/compose/ui/platform/y;->P0(LR0/s;IIZ)Z

    .line 1795
    .line 1796
    .line 1797
    move-result v7

    .line 1798
    if-eqz v7, :cond_51

    .line 1799
    .line 1800
    invoke-virtual {v6}, LR0/s;->q()I

    .line 1801
    .line 1802
    .line 1803
    move-result v1

    .line 1804
    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/y;->F0(I)I

    .line 1805
    .line 1806
    .line 1807
    move-result v1

    .line 1808
    const/16 v5, 0xc

    .line 1809
    .line 1810
    const/4 v6, 0x0

    .line 1811
    const/4 v2, 0x0

    .line 1812
    const/4 v3, 0x0

    .line 1813
    const/4 v4, 0x0

    .line 1814
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/y;->J0(Landroidx/compose/ui/platform/y;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    .line 1815
    .line 1816
    .line 1817
    :cond_51
    return v7

    .line 1818
    :cond_52
    invoke-virtual {v6}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1819
    .line 1820
    .line 1821
    move-result-object v1

    .line 1822
    sget-object v2, LR0/l;->a:LR0/l;

    .line 1823
    .line 1824
    invoke-virtual {v2}, LR0/l;->c()LR0/B;

    .line 1825
    .line 1826
    .line 1827
    move-result-object v2

    .line 1828
    invoke-static {v1, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1829
    .line 1830
    .line 1831
    move-result-object v1

    .line 1832
    check-cast v1, LR0/a;

    .line 1833
    .line 1834
    if-eqz v1, :cond_53

    .line 1835
    .line 1836
    invoke-virtual {v1}, LR0/a;->a()LTd/i;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v1

    .line 1840
    check-cast v1, Lie/a;

    .line 1841
    .line 1842
    if-eqz v1, :cond_53

    .line 1843
    .line 1844
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1845
    .line 1846
    .line 1847
    move-result-object v1

    .line 1848
    check-cast v1, Ljava/lang/Boolean;

    .line 1849
    .line 1850
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1851
    .line 1852
    .line 1853
    move-result v1

    .line 1854
    return v1

    .line 1855
    :cond_53
    const/16 v18, 0x0

    .line 1856
    .line 1857
    return v18

    .line 1858
    :cond_54
    if-eqz v3, :cond_56

    .line 1859
    .line 1860
    const-string v1, "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"

    .line 1861
    .line 1862
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1863
    .line 1864
    .line 1865
    move-result v1

    .line 1866
    const-string v4, "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"

    .line 1867
    .line 1868
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 1869
    .line 1870
    .line 1871
    move-result v3

    .line 1872
    if-ne v2, v8, :cond_55

    .line 1873
    .line 1874
    move v7, v11

    .line 1875
    goto :goto_19

    .line 1876
    :cond_55
    const/4 v7, 0x0

    .line 1877
    :goto_19
    invoke-direct {v0, v6, v1, v7, v3}, Landroidx/compose/ui/platform/y;->a1(LR0/s;IZZ)Z

    .line 1878
    .line 1879
    .line 1880
    move-result v1

    .line 1881
    return v1

    .line 1882
    :cond_56
    const/16 v18, 0x0

    .line 1883
    .line 1884
    return v18

    .line 1885
    :cond_57
    invoke-direct/range {p0 .. p1}, Landroidx/compose/ui/platform/y;->T(I)Z

    .line 1886
    .line 1887
    .line 1888
    move-result v1

    .line 1889
    return v1

    .line 1890
    :cond_58
    invoke-direct/range {p0 .. p1}, Landroidx/compose/ui/platform/y;->C0(I)Z

    .line 1891
    .line 1892
    .line 1893
    move-result v1

    .line 1894
    return v1

    .line 1895
    :goto_1a
    return v18

    .line 1896
    nop

    .line 1897
    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_b
        0x20 -> :sswitch_a
        0x1000 -> :sswitch_9
        0x2000 -> :sswitch_9
        0x8000 -> :sswitch_8
        0x10000 -> :sswitch_7
        0x40000 -> :sswitch_6
        0x80000 -> :sswitch_5
        0x100000 -> :sswitch_4
        0x200000 -> :sswitch_3
        0x1020036 -> :sswitch_2
        0x102003d -> :sswitch_1
        0x1020054 -> :sswitch_0
    .end sparse-switch

    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    :pswitch_data_0
    .packed-switch 0x1020038
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch

    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    :pswitch_data_1
    .packed-switch 0x1020046
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final synthetic w(Landroidx/compose/ui/platform/y;)LL1/B;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/y;->r:LL1/B;

    .line 2
    .line 3
    return-object p0
.end method

.method private static final w0(LR0/j;F)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-gez v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, LR0/j;->c()Lie/a;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    cmpl-float v1, v1, v0

    .line 21
    .line 22
    if-gtz v1, :cond_1

    .line 23
    .line 24
    :cond_0
    cmpl-float p1, p1, v0

    .line 25
    .line 26
    if-lez p1, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0}, LR0/j;->c()Lie/a;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Ljava/lang/Number;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-virtual {p0}, LR0/j;->a()Lie/a;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-interface {p0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, Ljava/lang/Number;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    cmpg-float p0, p1, p0

    .line 57
    .line 58
    if-gez p0, :cond_2

    .line 59
    .line 60
    :cond_1
    const/4 p0, 0x1

    .line 61
    return p0

    .line 62
    :cond_2
    const/4 p0, 0x0

    .line 63
    return p0
.end method

.method public static final synthetic x(Landroidx/compose/ui/platform/y;)LL1/B;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/y;->s:LL1/B;

    .line 2
    .line 3
    return-object p0
.end method

.method private static final x0(FF)F
    .locals 2

    .line 1
    invoke-static {p0}, Ljava/lang/Math;->signum(F)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    cmpg-float v0, v0, v1

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    cmpg-float v0, v0, v1

    .line 22
    .line 23
    if-gez v0, :cond_0

    .line 24
    .line 25
    return p0

    .line 26
    :cond_0
    return p1

    .line 27
    :cond_1
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public static final synthetic y(Landroidx/compose/ui/platform/y;)Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/y;->j:Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

    .line 2
    .line 3
    return-object p0
.end method

.method private final y0(ILL1/B;LR0/s;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 10
    .line 11
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const-string v5, "android.view.View"

    .line 20
    .line 21
    invoke-virtual {v2, v5}, LL1/B;->z0(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    sget-object v6, LR0/x;->a:LR0/x;

    .line 29
    .line 30
    invoke-virtual {v6}, LR0/x;->g()LR0/B;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    invoke-virtual {v5, v7}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_0

    .line 39
    .line 40
    const-string v5, "android.widget.EditText"

    .line 41
    .line 42
    invoke-virtual {v2, v5}, LL1/B;->z0(Ljava/lang/CharSequence;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v6}, LR0/x;->J()LR0/B;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-virtual {v5, v7}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_1

    .line 58
    .line 59
    const-string v5, "android.widget.TextView"

    .line 60
    .line 61
    invoke-virtual {v2, v5}, LL1/B;->z0(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {v6}, LR0/x;->D()LR0/B;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-static {v5, v6}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    check-cast v5, LR0/h;

    .line 77
    .line 78
    if-eqz v5, :cond_7

    .line 79
    .line 80
    invoke-virtual {v5}, LR0/h;->p()I

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3}, LR0/s;->z()Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-nez v6, :cond_2

    .line 88
    .line 89
    invoke-virtual {v3}, LR0/s;->v()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-eqz v6, :cond_6

    .line 98
    .line 99
    :cond_2
    sget-object v6, LR0/h;->b:LR0/h$a;

    .line 100
    .line 101
    invoke-virtual {v6}, LR0/h$a;->h()I

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    invoke-virtual {v5}, LR0/h;->p()I

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    invoke-static {v8, v7}, LR0/h;->m(II)Z

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    if-eqz v7, :cond_3

    .line 114
    .line 115
    sget v6, Ll0/m;->l:I

    .line 116
    .line 117
    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    invoke-virtual {v2, v6}, LL1/B;->a1(Ljava/lang/CharSequence;)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_3
    invoke-virtual {v6}, LR0/h$a;->g()I

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    invoke-virtual {v5}, LR0/h;->p()I

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    invoke-static {v8, v7}, LR0/h;->m(II)Z

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-eqz v7, :cond_4

    .line 138
    .line 139
    sget v6, Ll0/m;->k:I

    .line 140
    .line 141
    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    invoke-virtual {v2, v6}, LL1/B;->a1(Ljava/lang/CharSequence;)V

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_4
    invoke-virtual {v5}, LR0/h;->p()I

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    invoke-static {v7}, Landroidx/compose/ui/platform/m1;->e(I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    invoke-virtual {v6}, LR0/h$a;->e()I

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    invoke-virtual {v5}, LR0/h;->p()I

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    invoke-static {v8, v6}, LR0/h;->m(II)Z

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    if-eqz v6, :cond_5

    .line 170
    .line 171
    invoke-virtual {v3}, LR0/s;->C()Z

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    if-nez v6, :cond_5

    .line 176
    .line 177
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-virtual {v6}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->v()Z

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    if-eqz v6, :cond_6

    .line 186
    .line 187
    :cond_5
    invoke-virtual {v2, v7}, LL1/B;->z0(Ljava/lang/CharSequence;)V

    .line 188
    .line 189
    .line 190
    :cond_6
    :goto_0
    sget-object v6, LTd/L;->a:LTd/L;

    .line 191
    .line 192
    :cond_7
    iget-object v6, v0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 193
    .line 194
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    invoke-virtual {v2, v6}, LL1/B;->U0(Ljava/lang/CharSequence;)V

    .line 203
    .line 204
    .line 205
    invoke-static {v3}, LR0/w;->d(LR0/s;)Z

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    invoke-virtual {v2, v6}, LL1/B;->N0(Z)V

    .line 210
    .line 211
    .line 212
    invoke-direct {v0}, Landroidx/compose/ui/platform/y;->q0()Z

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    invoke-virtual {v3}, LR0/s;->v()Ljava/util/List;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 221
    .line 222
    .line 223
    move-result v8

    .line 224
    const/4 v9, 0x0

    .line 225
    move v10, v9

    .line 226
    move v11, v10

    .line 227
    :goto_1
    const/4 v12, -0x1

    .line 228
    if-ge v10, v8, :cond_e

    .line 229
    .line 230
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v13

    .line 234
    check-cast v13, LR0/s;

    .line 235
    .line 236
    invoke-direct {v0}, Landroidx/compose/ui/platform/y;->d0()Lt/o;

    .line 237
    .line 238
    .line 239
    move-result-object v14

    .line 240
    invoke-virtual {v13}, LR0/s;->q()I

    .line 241
    .line 242
    .line 243
    move-result v15

    .line 244
    invoke-virtual {v14, v15}, Lt/o;->b(I)Z

    .line 245
    .line 246
    .line 247
    move-result v14

    .line 248
    if-eqz v14, :cond_d

    .line 249
    .line 250
    iget-object v14, v0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 251
    .line 252
    invoke-virtual {v14}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/a0;

    .line 253
    .line 254
    .line 255
    move-result-object v14

    .line 256
    invoke-virtual {v14}, Landroidx/compose/ui/platform/a0;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 257
    .line 258
    .line 259
    move-result-object v14

    .line 260
    invoke-virtual {v13}, LR0/s;->s()LK0/J;

    .line 261
    .line 262
    .line 263
    move-result-object v15

    .line 264
    invoke-virtual {v14, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v14

    .line 268
    check-cast v14, Landroidx/compose/ui/viewinterop/b;

    .line 269
    .line 270
    invoke-virtual {v13}, LR0/s;->q()I

    .line 271
    .line 272
    .line 273
    move-result v15

    .line 274
    if-ne v15, v12, :cond_8

    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_8
    if-eqz v14, :cond_9

    .line 278
    .line 279
    invoke-virtual {v2, v14}, LL1/B;->c(Landroid/view/View;)V

    .line 280
    .line 281
    .line 282
    goto :goto_3

    .line 283
    :cond_9
    invoke-direct {v0}, Landroidx/compose/ui/platform/y;->d0()Lt/o;

    .line 284
    .line 285
    .line 286
    move-result-object v12

    .line 287
    invoke-virtual {v13}, LR0/s;->q()I

    .line 288
    .line 289
    .line 290
    move-result v14

    .line 291
    invoke-virtual {v12, v14}, Lt/o;->c(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v12

    .line 295
    check-cast v12, LR0/u;

    .line 296
    .line 297
    if-eqz v12, :cond_a

    .line 298
    .line 299
    invoke-virtual {v12}, LR0/u;->b()LR0/s;

    .line 300
    .line 301
    .line 302
    move-result-object v12

    .line 303
    if-eqz v12, :cond_a

    .line 304
    .line 305
    invoke-virtual {v12}, LR0/s;->p()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 306
    .line 307
    .line 308
    move-result-object v12

    .line 309
    if-eqz v12, :cond_a

    .line 310
    .line 311
    sget-object v14, LR0/x;->a:LR0/x;

    .line 312
    .line 313
    invoke-virtual {v14}, LR0/x;->u()LR0/B;

    .line 314
    .line 315
    .line 316
    move-result-object v14

    .line 317
    invoke-static {v12, v14}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v12

    .line 321
    sget-object v14, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 322
    .line 323
    invoke-static {v12, v14}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v12

    .line 327
    goto :goto_2

    .line 328
    :cond_a
    move v12, v9

    .line 329
    :goto_2
    if-nez v6, :cond_b

    .line 330
    .line 331
    if-nez v12, :cond_c

    .line 332
    .line 333
    :cond_b
    iget-object v12, v0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 334
    .line 335
    invoke-virtual {v13}, LR0/s;->q()I

    .line 336
    .line 337
    .line 338
    move-result v14

    .line 339
    invoke-virtual {v2, v12, v14}, LL1/B;->d(Landroid/view/View;I)V

    .line 340
    .line 341
    .line 342
    :cond_c
    :goto_3
    iget-object v12, v0, Landroidx/compose/ui/platform/y;->O:Lt/D;

    .line 343
    .line 344
    invoke-virtual {v13}, LR0/s;->q()I

    .line 345
    .line 346
    .line 347
    move-result v13

    .line 348
    invoke-virtual {v12, v13, v11}, Lt/D;->p(II)V

    .line 349
    .line 350
    .line 351
    add-int/lit8 v11, v11, 0x1

    .line 352
    .line 353
    :cond_d
    :goto_4
    add-int/lit8 v10, v10, 0x1

    .line 354
    .line 355
    goto/16 :goto_1

    .line 356
    .line 357
    :cond_e
    iget v6, v0, Landroidx/compose/ui/platform/y;->p:I

    .line 358
    .line 359
    const/4 v7, 0x1

    .line 360
    if-ne v1, v6, :cond_f

    .line 361
    .line 362
    invoke-virtual {v2, v7}, LL1/B;->s0(Z)V

    .line 363
    .line 364
    .line 365
    sget-object v6, LL1/B$a;->l:LL1/B$a;

    .line 366
    .line 367
    invoke-virtual {v2, v6}, LL1/B;->b(LL1/B$a;)V

    .line 368
    .line 369
    .line 370
    goto :goto_5

    .line 371
    :cond_f
    invoke-virtual {v2, v9}, LL1/B;->s0(Z)V

    .line 372
    .line 373
    .line 374
    sget-object v6, LL1/B$a;->k:LL1/B$a;

    .line 375
    .line 376
    invoke-virtual {v2, v6}, LL1/B;->b(LL1/B$a;)V

    .line 377
    .line 378
    .line 379
    :goto_5
    invoke-direct {v0, v3, v2}, Landroidx/compose/ui/platform/y;->S0(LR0/s;LL1/B;)V

    .line 380
    .line 381
    .line 382
    invoke-direct {v0, v3, v2}, Landroidx/compose/ui/platform/y;->Q0(LR0/s;LL1/B;)V

    .line 383
    .line 384
    .line 385
    invoke-static {v3, v4}, Landroidx/compose/ui/platform/z;->f(LR0/s;Landroid/content/res/Resources;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v6

    .line 389
    invoke-virtual {v2, v6}, LL1/B;->h1(Ljava/lang/CharSequence;)V

    .line 390
    .line 391
    .line 392
    invoke-static {v3}, Landroidx/compose/ui/platform/z;->e(LR0/s;)Z

    .line 393
    .line 394
    .line 395
    move-result v6

    .line 396
    invoke-virtual {v2, v6}, LL1/B;->x0(Z)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    sget-object v8, LR0/x;->a:LR0/x;

    .line 404
    .line 405
    invoke-virtual {v8}, LR0/x;->M()LR0/B;

    .line 406
    .line 407
    .line 408
    move-result-object v10

    .line 409
    invoke-static {v6, v10}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v6

    .line 413
    check-cast v6, LT0/a;

    .line 414
    .line 415
    if-eqz v6, :cond_12

    .line 416
    .line 417
    sget-object v10, LT0/a;->a:LT0/a;

    .line 418
    .line 419
    if-ne v6, v10, :cond_10

    .line 420
    .line 421
    invoke-virtual {v2, v7}, LL1/B;->y0(Z)V

    .line 422
    .line 423
    .line 424
    goto :goto_6

    .line 425
    :cond_10
    sget-object v10, LT0/a;->b:LT0/a;

    .line 426
    .line 427
    if-ne v6, v10, :cond_11

    .line 428
    .line 429
    invoke-virtual {v2, v9}, LL1/B;->y0(Z)V

    .line 430
    .line 431
    .line 432
    :cond_11
    :goto_6
    sget-object v6, LTd/L;->a:LTd/L;

    .line 433
    .line 434
    :cond_12
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 435
    .line 436
    .line 437
    move-result-object v6

    .line 438
    invoke-virtual {v8}, LR0/x;->F()LR0/B;

    .line 439
    .line 440
    .line 441
    move-result-object v10

    .line 442
    invoke-static {v6, v10}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v6

    .line 446
    check-cast v6, Ljava/lang/Boolean;

    .line 447
    .line 448
    if-eqz v6, :cond_15

    .line 449
    .line 450
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 451
    .line 452
    .line 453
    move-result v6

    .line 454
    sget-object v10, LR0/h;->b:LR0/h$a;

    .line 455
    .line 456
    invoke-virtual {v10}, LR0/h$a;->h()I

    .line 457
    .line 458
    .line 459
    move-result v10

    .line 460
    if-nez v5, :cond_13

    .line 461
    .line 462
    move v10, v9

    .line 463
    goto :goto_7

    .line 464
    :cond_13
    invoke-virtual {v5}, LR0/h;->p()I

    .line 465
    .line 466
    .line 467
    move-result v11

    .line 468
    invoke-static {v11, v10}, LR0/h;->m(II)Z

    .line 469
    .line 470
    .line 471
    move-result v10

    .line 472
    :goto_7
    if-eqz v10, :cond_14

    .line 473
    .line 474
    invoke-virtual {v2, v6}, LL1/B;->d1(Z)V

    .line 475
    .line 476
    .line 477
    goto :goto_8

    .line 478
    :cond_14
    invoke-virtual {v2, v6}, LL1/B;->y0(Z)V

    .line 479
    .line 480
    .line 481
    :goto_8
    sget-object v6, LTd/L;->a:LTd/L;

    .line 482
    .line 483
    :cond_15
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 484
    .line 485
    .line 486
    move-result-object v6

    .line 487
    invoke-virtual {v6}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->v()Z

    .line 488
    .line 489
    .line 490
    move-result v6

    .line 491
    if-eqz v6, :cond_16

    .line 492
    .line 493
    invoke-virtual {v3}, LR0/s;->v()Ljava/util/List;

    .line 494
    .line 495
    .line 496
    move-result-object v6

    .line 497
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 498
    .line 499
    .line 500
    move-result v6

    .line 501
    if-eqz v6, :cond_18

    .line 502
    .line 503
    :cond_16
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 504
    .line 505
    .line 506
    move-result-object v6

    .line 507
    invoke-virtual {v8}, LR0/x;->d()LR0/B;

    .line 508
    .line 509
    .line 510
    move-result-object v11

    .line 511
    invoke-static {v6, v11}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v6

    .line 515
    check-cast v6, Ljava/util/List;

    .line 516
    .line 517
    if-eqz v6, :cond_17

    .line 518
    .line 519
    invoke-static {v6}, LUd/u;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v6

    .line 523
    check-cast v6, Ljava/lang/String;

    .line 524
    .line 525
    goto :goto_9

    .line 526
    :cond_17
    const/4 v6, 0x0

    .line 527
    :goto_9
    invoke-virtual {v2, v6}, LL1/B;->D0(Ljava/lang/CharSequence;)V

    .line 528
    .line 529
    .line 530
    :cond_18
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 531
    .line 532
    .line 533
    move-result-object v6

    .line 534
    invoke-virtual {v8}, LR0/x;->I()LR0/B;

    .line 535
    .line 536
    .line 537
    move-result-object v8

    .line 538
    invoke-static {v6, v8}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v6

    .line 542
    check-cast v6, Ljava/lang/String;

    .line 543
    .line 544
    if-eqz v6, :cond_1b

    .line 545
    .line 546
    move-object v8, v3

    .line 547
    :goto_a
    if-eqz v8, :cond_1a

    .line 548
    .line 549
    invoke-virtual {v8}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 550
    .line 551
    .line 552
    move-result-object v11

    .line 553
    sget-object v13, LR0/y;->a:LR0/y;

    .line 554
    .line 555
    invoke-virtual {v13}, LR0/y;->b()LR0/B;

    .line 556
    .line 557
    .line 558
    move-result-object v14

    .line 559
    invoke-virtual {v11, v14}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 560
    .line 561
    .line 562
    move-result v11

    .line 563
    if-eqz v11, :cond_19

    .line 564
    .line 565
    invoke-virtual {v8}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 566
    .line 567
    .line 568
    move-result-object v8

    .line 569
    invoke-virtual {v13}, LR0/y;->b()LR0/B;

    .line 570
    .line 571
    .line 572
    move-result-object v11

    .line 573
    invoke-virtual {v8, v11}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->l(LR0/B;)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v8

    .line 577
    check-cast v8, Ljava/lang/Boolean;

    .line 578
    .line 579
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 580
    .line 581
    .line 582
    move-result v8

    .line 583
    goto :goto_b

    .line 584
    :cond_19
    invoke-virtual {v8}, LR0/s;->t()LR0/s;

    .line 585
    .line 586
    .line 587
    move-result-object v8

    .line 588
    goto :goto_a

    .line 589
    :cond_1a
    move v8, v9

    .line 590
    :goto_b
    if-eqz v8, :cond_1b

    .line 591
    .line 592
    invoke-virtual {v2, v6}, LL1/B;->p1(Ljava/lang/String;)V

    .line 593
    .line 594
    .line 595
    :cond_1b
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 596
    .line 597
    .line 598
    move-result-object v6

    .line 599
    sget-object v8, LR0/x;->a:LR0/x;

    .line 600
    .line 601
    invoke-virtual {v8}, LR0/x;->j()LR0/B;

    .line 602
    .line 603
    .line 604
    move-result-object v11

    .line 605
    invoke-static {v6, v11}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v6

    .line 609
    check-cast v6, LTd/L;

    .line 610
    .line 611
    if-eqz v6, :cond_1c

    .line 612
    .line 613
    invoke-virtual {v2, v7}, LL1/B;->L0(Z)V

    .line 614
    .line 615
    .line 616
    sget-object v6, LTd/L;->a:LTd/L;

    .line 617
    .line 618
    :cond_1c
    if-eq v1, v12, :cond_1e

    .line 619
    .line 620
    iget-object v6, v0, Landroidx/compose/ui/platform/y;->O:Lt/D;

    .line 621
    .line 622
    invoke-virtual {v3}, LR0/s;->q()I

    .line 623
    .line 624
    .line 625
    move-result v11

    .line 626
    invoke-virtual {v6, v11, v12}, Lt/j;->e(II)I

    .line 627
    .line 628
    .line 629
    move-result v6

    .line 630
    if-eq v6, v12, :cond_1d

    .line 631
    .line 632
    invoke-virtual {v2, v6}, LL1/B;->F0(I)V

    .line 633
    .line 634
    .line 635
    sget-object v6, LTd/L;->a:LTd/L;

    .line 636
    .line 637
    goto :goto_c

    .line 638
    :cond_1d
    const-string v6, "AccessibilityDelegate"

    .line 639
    .line 640
    const-string v11, "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?"

    .line 641
    .line 642
    invoke-static {v6, v11}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 643
    .line 644
    .line 645
    :cond_1e
    :goto_c
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 646
    .line 647
    .line 648
    move-result-object v6

    .line 649
    invoke-virtual {v8}, LR0/x;->B()LR0/B;

    .line 650
    .line 651
    .line 652
    move-result-object v11

    .line 653
    invoke-virtual {v6, v11}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 654
    .line 655
    .line 656
    move-result v6

    .line 657
    invoke-virtual {v2, v6}, LL1/B;->Y0(Z)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 661
    .line 662
    .line 663
    move-result-object v6

    .line 664
    invoke-virtual {v8}, LR0/x;->s()LR0/B;

    .line 665
    .line 666
    .line 667
    move-result-object v11

    .line 668
    invoke-virtual {v6, v11}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 669
    .line 670
    .line 671
    move-result v6

    .line 672
    invoke-virtual {v2, v6}, LL1/B;->G0(Z)V

    .line 673
    .line 674
    .line 675
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 676
    .line 677
    .line 678
    move-result-object v6

    .line 679
    invoke-virtual {v8}, LR0/x;->z()LR0/B;

    .line 680
    .line 681
    .line 682
    move-result-object v11

    .line 683
    invoke-static {v6, v11}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v6

    .line 687
    check-cast v6, Ljava/lang/Integer;

    .line 688
    .line 689
    if-eqz v6, :cond_1f

    .line 690
    .line 691
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 692
    .line 693
    .line 694
    move-result v6

    .line 695
    goto :goto_d

    .line 696
    :cond_1f
    move v6, v12

    .line 697
    :goto_d
    invoke-virtual {v2, v6}, LL1/B;->S0(I)V

    .line 698
    .line 699
    .line 700
    invoke-static {v3}, Landroidx/compose/ui/platform/z;->b(LR0/s;)Z

    .line 701
    .line 702
    .line 703
    move-result v6

    .line 704
    invoke-virtual {v2, v6}, LL1/B;->H0(Z)V

    .line 705
    .line 706
    .line 707
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 708
    .line 709
    .line 710
    move-result-object v6

    .line 711
    invoke-virtual {v8}, LR0/x;->i()LR0/B;

    .line 712
    .line 713
    .line 714
    move-result-object v11

    .line 715
    invoke-virtual {v6, v11}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 716
    .line 717
    .line 718
    move-result v6

    .line 719
    invoke-virtual {v2, v6}, LL1/B;->J0(Z)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v2}, LL1/B;->Y()Z

    .line 723
    .line 724
    .line 725
    move-result v6

    .line 726
    const/4 v11, 0x2

    .line 727
    if-eqz v6, :cond_21

    .line 728
    .line 729
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 730
    .line 731
    .line 732
    move-result-object v6

    .line 733
    invoke-virtual {v8}, LR0/x;->i()LR0/B;

    .line 734
    .line 735
    .line 736
    move-result-object v13

    .line 737
    invoke-virtual {v6, v13}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->l(LR0/B;)Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v6

    .line 741
    check-cast v6, Ljava/lang/Boolean;

    .line 742
    .line 743
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 744
    .line 745
    .line 746
    move-result v6

    .line 747
    invoke-virtual {v2, v6}, LL1/B;->K0(Z)V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v2}, LL1/B;->Z()Z

    .line 751
    .line 752
    .line 753
    move-result v6

    .line 754
    if-eqz v6, :cond_20

    .line 755
    .line 756
    invoke-virtual {v2, v11}, LL1/B;->a(I)V

    .line 757
    .line 758
    .line 759
    iput v1, v0, Landroidx/compose/ui/platform/y;->q:I

    .line 760
    .line 761
    goto :goto_e

    .line 762
    :cond_20
    invoke-virtual {v2, v7}, LL1/B;->a(I)V

    .line 763
    .line 764
    .line 765
    :cond_21
    :goto_e
    invoke-static {v3}, LR0/w;->c(LR0/s;)Z

    .line 766
    .line 767
    .line 768
    move-result v6

    .line 769
    xor-int/2addr v6, v7

    .line 770
    invoke-virtual {v2, v6}, LL1/B;->q1(Z)V

    .line 771
    .line 772
    .line 773
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 774
    .line 775
    .line 776
    move-result-object v6

    .line 777
    invoke-virtual {v8}, LR0/x;->y()LR0/B;

    .line 778
    .line 779
    .line 780
    move-result-object v13

    .line 781
    invoke-static {v6, v13}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v6

    .line 785
    check-cast v6, LR0/e;

    .line 786
    .line 787
    if-eqz v6, :cond_24

    .line 788
    .line 789
    invoke-virtual {v6}, LR0/e;->i()I

    .line 790
    .line 791
    .line 792
    move-result v6

    .line 793
    sget-object v13, LR0/e;->b:LR0/e$a;

    .line 794
    .line 795
    invoke-virtual {v13}, LR0/e$a;->b()I

    .line 796
    .line 797
    .line 798
    move-result v14

    .line 799
    invoke-static {v6, v14}, LR0/e;->f(II)Z

    .line 800
    .line 801
    .line 802
    move-result v14

    .line 803
    if-eqz v14, :cond_23

    .line 804
    .line 805
    :cond_22
    move v6, v7

    .line 806
    goto :goto_f

    .line 807
    :cond_23
    invoke-virtual {v13}, LR0/e$a;->a()I

    .line 808
    .line 809
    .line 810
    move-result v13

    .line 811
    invoke-static {v6, v13}, LR0/e;->f(II)Z

    .line 812
    .line 813
    .line 814
    move-result v6

    .line 815
    if-eqz v6, :cond_22

    .line 816
    .line 817
    move v6, v11

    .line 818
    :goto_f
    invoke-virtual {v2, v6}, LL1/B;->Q0(I)V

    .line 819
    .line 820
    .line 821
    sget-object v6, LTd/L;->a:LTd/L;

    .line 822
    .line 823
    :cond_24
    invoke-virtual {v2, v9}, LL1/B;->A0(Z)V

    .line 824
    .line 825
    .line 826
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 827
    .line 828
    .line 829
    move-result-object v6

    .line 830
    sget-object v13, LR0/l;->a:LR0/l;

    .line 831
    .line 832
    invoke-virtual {v13}, LR0/l;->l()LR0/B;

    .line 833
    .line 834
    .line 835
    move-result-object v14

    .line 836
    invoke-static {v6, v14}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    move-result-object v6

    .line 840
    check-cast v6, LR0/a;

    .line 841
    .line 842
    if-eqz v6, :cond_2c

    .line 843
    .line 844
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 845
    .line 846
    .line 847
    move-result-object v14

    .line 848
    invoke-virtual {v8}, LR0/x;->F()LR0/B;

    .line 849
    .line 850
    .line 851
    move-result-object v15

    .line 852
    invoke-static {v14, v15}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 853
    .line 854
    .line 855
    move-result-object v14

    .line 856
    sget-object v15, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 857
    .line 858
    invoke-static {v14, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 859
    .line 860
    .line 861
    move-result v14

    .line 862
    sget-object v15, LR0/h;->b:LR0/h$a;

    .line 863
    .line 864
    move/from16 v16, v11

    .line 865
    .line 866
    invoke-virtual {v15}, LR0/h$a;->h()I

    .line 867
    .line 868
    .line 869
    move-result v11

    .line 870
    if-nez v5, :cond_25

    .line 871
    .line 872
    move v11, v9

    .line 873
    goto :goto_10

    .line 874
    :cond_25
    invoke-virtual {v5}, LR0/h;->p()I

    .line 875
    .line 876
    .line 877
    move-result v12

    .line 878
    invoke-static {v12, v11}, LR0/h;->m(II)Z

    .line 879
    .line 880
    .line 881
    move-result v11

    .line 882
    :goto_10
    if-nez v11, :cond_28

    .line 883
    .line 884
    invoke-virtual {v15}, LR0/h$a;->f()I

    .line 885
    .line 886
    .line 887
    move-result v11

    .line 888
    if-nez v5, :cond_26

    .line 889
    .line 890
    move v5, v9

    .line 891
    goto :goto_11

    .line 892
    :cond_26
    invoke-virtual {v5}, LR0/h;->p()I

    .line 893
    .line 894
    .line 895
    move-result v5

    .line 896
    invoke-static {v5, v11}, LR0/h;->m(II)Z

    .line 897
    .line 898
    .line 899
    move-result v5

    .line 900
    :goto_11
    if-eqz v5, :cond_27

    .line 901
    .line 902
    goto :goto_12

    .line 903
    :cond_27
    move v5, v9

    .line 904
    goto :goto_13

    .line 905
    :cond_28
    :goto_12
    move v5, v7

    .line 906
    :goto_13
    if-eqz v5, :cond_2a

    .line 907
    .line 908
    if-eqz v5, :cond_29

    .line 909
    .line 910
    if-nez v14, :cond_29

    .line 911
    .line 912
    goto :goto_14

    .line 913
    :cond_29
    move v5, v9

    .line 914
    goto :goto_15

    .line 915
    :cond_2a
    :goto_14
    move v5, v7

    .line 916
    :goto_15
    invoke-virtual {v2, v5}, LL1/B;->A0(Z)V

    .line 917
    .line 918
    .line 919
    invoke-static {v3}, Landroidx/compose/ui/platform/z;->b(LR0/s;)Z

    .line 920
    .line 921
    .line 922
    move-result v5

    .line 923
    if-eqz v5, :cond_2b

    .line 924
    .line 925
    invoke-virtual {v2}, LL1/B;->U()Z

    .line 926
    .line 927
    .line 928
    move-result v5

    .line 929
    if-eqz v5, :cond_2b

    .line 930
    .line 931
    new-instance v5, LL1/B$a;

    .line 932
    .line 933
    const/16 v11, 0x10

    .line 934
    .line 935
    invoke-virtual {v6}, LR0/a;->b()Ljava/lang/String;

    .line 936
    .line 937
    .line 938
    move-result-object v6

    .line 939
    invoke-direct {v5, v11, v6}, LL1/B$a;-><init>(ILjava/lang/CharSequence;)V

    .line 940
    .line 941
    .line 942
    invoke-virtual {v2, v5}, LL1/B;->b(LL1/B$a;)V

    .line 943
    .line 944
    .line 945
    :cond_2b
    sget-object v5, LTd/L;->a:LTd/L;

    .line 946
    .line 947
    goto :goto_16

    .line 948
    :cond_2c
    move/from16 v16, v11

    .line 949
    .line 950
    :goto_16
    invoke-virtual {v2, v9}, LL1/B;->R0(Z)V

    .line 951
    .line 952
    .line 953
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 954
    .line 955
    .line 956
    move-result-object v5

    .line 957
    invoke-virtual {v13}, LR0/l;->n()LR0/B;

    .line 958
    .line 959
    .line 960
    move-result-object v6

    .line 961
    invoke-static {v5, v6}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    move-result-object v5

    .line 965
    check-cast v5, LR0/a;

    .line 966
    .line 967
    if-eqz v5, :cond_2e

    .line 968
    .line 969
    invoke-virtual {v2, v7}, LL1/B;->R0(Z)V

    .line 970
    .line 971
    .line 972
    invoke-static {v3}, Landroidx/compose/ui/platform/z;->b(LR0/s;)Z

    .line 973
    .line 974
    .line 975
    move-result v6

    .line 976
    if-eqz v6, :cond_2d

    .line 977
    .line 978
    new-instance v6, LL1/B$a;

    .line 979
    .line 980
    const/16 v11, 0x20

    .line 981
    .line 982
    invoke-virtual {v5}, LR0/a;->b()Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    move-result-object v5

    .line 986
    invoke-direct {v6, v11, v5}, LL1/B$a;-><init>(ILjava/lang/CharSequence;)V

    .line 987
    .line 988
    .line 989
    invoke-virtual {v2, v6}, LL1/B;->b(LL1/B$a;)V

    .line 990
    .line 991
    .line 992
    :cond_2d
    sget-object v5, LTd/L;->a:LTd/L;

    .line 993
    .line 994
    :cond_2e
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 995
    .line 996
    .line 997
    move-result-object v5

    .line 998
    invoke-virtual {v13}, LR0/l;->c()LR0/B;

    .line 999
    .line 1000
    .line 1001
    move-result-object v6

    .line 1002
    invoke-static {v5, v6}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v5

    .line 1006
    check-cast v5, LR0/a;

    .line 1007
    .line 1008
    if-eqz v5, :cond_2f

    .line 1009
    .line 1010
    new-instance v6, LL1/B$a;

    .line 1011
    .line 1012
    const/16 v11, 0x4000

    .line 1013
    .line 1014
    invoke-virtual {v5}, LR0/a;->b()Ljava/lang/String;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v5

    .line 1018
    invoke-direct {v6, v11, v5}, LL1/B$a;-><init>(ILjava/lang/CharSequence;)V

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {v2, v6}, LL1/B;->b(LL1/B$a;)V

    .line 1022
    .line 1023
    .line 1024
    sget-object v5, LTd/L;->a:LTd/L;

    .line 1025
    .line 1026
    :cond_2f
    invoke-static {v3}, Landroidx/compose/ui/platform/z;->b(LR0/s;)Z

    .line 1027
    .line 1028
    .line 1029
    move-result v5

    .line 1030
    if-eqz v5, :cond_34

    .line 1031
    .line 1032
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v5

    .line 1036
    invoke-virtual {v13}, LR0/l;->z()LR0/B;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v6

    .line 1040
    invoke-static {v5, v6}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v5

    .line 1044
    check-cast v5, LR0/a;

    .line 1045
    .line 1046
    if-eqz v5, :cond_30

    .line 1047
    .line 1048
    new-instance v6, LL1/B$a;

    .line 1049
    .line 1050
    const/high16 v11, 0x200000

    .line 1051
    .line 1052
    invoke-virtual {v5}, LR0/a;->b()Ljava/lang/String;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v5

    .line 1056
    invoke-direct {v6, v11, v5}, LL1/B$a;-><init>(ILjava/lang/CharSequence;)V

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v2, v6}, LL1/B;->b(LL1/B$a;)V

    .line 1060
    .line 1061
    .line 1062
    sget-object v5, LTd/L;->a:LTd/L;

    .line 1063
    .line 1064
    :cond_30
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v5

    .line 1068
    invoke-virtual {v13}, LR0/l;->m()LR0/B;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v6

    .line 1072
    invoke-static {v5, v6}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v5

    .line 1076
    check-cast v5, LR0/a;

    .line 1077
    .line 1078
    if-eqz v5, :cond_31

    .line 1079
    .line 1080
    new-instance v6, LL1/B$a;

    .line 1081
    .line 1082
    const v11, 0x1020054

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v5}, LR0/a;->b()Ljava/lang/String;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v5

    .line 1089
    invoke-direct {v6, v11, v5}, LL1/B$a;-><init>(ILjava/lang/CharSequence;)V

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v2, v6}, LL1/B;->b(LL1/B$a;)V

    .line 1093
    .line 1094
    .line 1095
    sget-object v5, LTd/L;->a:LTd/L;

    .line 1096
    .line 1097
    :cond_31
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v5

    .line 1101
    invoke-virtual {v13}, LR0/l;->e()LR0/B;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v6

    .line 1105
    invoke-static {v5, v6}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v5

    .line 1109
    check-cast v5, LR0/a;

    .line 1110
    .line 1111
    if-eqz v5, :cond_32

    .line 1112
    .line 1113
    new-instance v6, LL1/B$a;

    .line 1114
    .line 1115
    const/high16 v11, 0x10000

    .line 1116
    .line 1117
    invoke-virtual {v5}, LR0/a;->b()Ljava/lang/String;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v5

    .line 1121
    invoke-direct {v6, v11, v5}, LL1/B$a;-><init>(ILjava/lang/CharSequence;)V

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v2, v6}, LL1/B;->b(LL1/B$a;)V

    .line 1125
    .line 1126
    .line 1127
    sget-object v5, LTd/L;->a:LTd/L;

    .line 1128
    .line 1129
    :cond_32
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v5

    .line 1133
    invoke-virtual {v13}, LR0/l;->s()LR0/B;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v6

    .line 1137
    invoke-static {v5, v6}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v5

    .line 1141
    check-cast v5, LR0/a;

    .line 1142
    .line 1143
    if-eqz v5, :cond_34

    .line 1144
    .line 1145
    invoke-virtual {v2}, LL1/B;->Z()Z

    .line 1146
    .line 1147
    .line 1148
    move-result v6

    .line 1149
    if-eqz v6, :cond_33

    .line 1150
    .line 1151
    iget-object v6, v0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 1152
    .line 1153
    invoke-virtual {v6}, Landroidx/compose/ui/platform/AndroidComposeView;->getClipboardManager()Landroidx/compose/ui/platform/l;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v6

    .line 1157
    invoke-virtual {v6}, Landroidx/compose/ui/platform/l;->b()Z

    .line 1158
    .line 1159
    .line 1160
    move-result v6

    .line 1161
    if-eqz v6, :cond_33

    .line 1162
    .line 1163
    new-instance v6, LL1/B$a;

    .line 1164
    .line 1165
    const v11, 0x8000

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual {v5}, LR0/a;->b()Ljava/lang/String;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v5

    .line 1172
    invoke-direct {v6, v11, v5}, LL1/B$a;-><init>(ILjava/lang/CharSequence;)V

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v2, v6}, LL1/B;->b(LL1/B$a;)V

    .line 1176
    .line 1177
    .line 1178
    :cond_33
    sget-object v5, LTd/L;->a:LTd/L;

    .line 1179
    .line 1180
    :cond_34
    invoke-direct {v0, v3}, Landroidx/compose/ui/platform/y;->i0(LR0/s;)Ljava/lang/String;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v5

    .line 1184
    if-eqz v5, :cond_36

    .line 1185
    .line 1186
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 1187
    .line 1188
    .line 1189
    move-result v5

    .line 1190
    if-nez v5, :cond_35

    .line 1191
    .line 1192
    goto :goto_17

    .line 1193
    :cond_35
    move v5, v9

    .line 1194
    goto :goto_18

    .line 1195
    :cond_36
    :goto_17
    move v5, v7

    .line 1196
    :goto_18
    if-nez v5, :cond_3a

    .line 1197
    .line 1198
    invoke-direct {v0, v3}, Landroidx/compose/ui/platform/y;->c0(LR0/s;)I

    .line 1199
    .line 1200
    .line 1201
    move-result v5

    .line 1202
    invoke-direct {v0, v3}, Landroidx/compose/ui/platform/y;->b0(LR0/s;)I

    .line 1203
    .line 1204
    .line 1205
    move-result v6

    .line 1206
    invoke-virtual {v2, v5, v6}, LL1/B;->j1(II)V

    .line 1207
    .line 1208
    .line 1209
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v5

    .line 1213
    invoke-virtual {v13}, LR0/l;->y()LR0/B;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v6

    .line 1217
    invoke-static {v5, v6}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v5

    .line 1221
    check-cast v5, LR0/a;

    .line 1222
    .line 1223
    new-instance v6, LL1/B$a;

    .line 1224
    .line 1225
    if-eqz v5, :cond_37

    .line 1226
    .line 1227
    invoke-virtual {v5}, LR0/a;->b()Ljava/lang/String;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v5

    .line 1231
    goto :goto_19

    .line 1232
    :cond_37
    const/4 v5, 0x0

    .line 1233
    :goto_19
    const/high16 v11, 0x20000

    .line 1234
    .line 1235
    invoke-direct {v6, v11, v5}, LL1/B$a;-><init>(ILjava/lang/CharSequence;)V

    .line 1236
    .line 1237
    .line 1238
    invoke-virtual {v2, v6}, LL1/B;->b(LL1/B$a;)V

    .line 1239
    .line 1240
    .line 1241
    const/16 v5, 0x100

    .line 1242
    .line 1243
    invoke-virtual {v2, v5}, LL1/B;->a(I)V

    .line 1244
    .line 1245
    .line 1246
    const/16 v5, 0x200

    .line 1247
    .line 1248
    invoke-virtual {v2, v5}, LL1/B;->a(I)V

    .line 1249
    .line 1250
    .line 1251
    const/16 v5, 0xb

    .line 1252
    .line 1253
    invoke-virtual {v2, v5}, LL1/B;->T0(I)V

    .line 1254
    .line 1255
    .line 1256
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v5

    .line 1260
    invoke-virtual {v8}, LR0/x;->d()LR0/B;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v6

    .line 1264
    invoke-static {v5, v6}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v5

    .line 1268
    check-cast v5, Ljava/util/List;

    .line 1269
    .line 1270
    if-eqz v5, :cond_39

    .line 1271
    .line 1272
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 1273
    .line 1274
    .line 1275
    move-result v5

    .line 1276
    if-eqz v5, :cond_38

    .line 1277
    .line 1278
    goto :goto_1a

    .line 1279
    :cond_38
    move v5, v9

    .line 1280
    goto :goto_1b

    .line 1281
    :cond_39
    :goto_1a
    move v5, v7

    .line 1282
    :goto_1b
    if-eqz v5, :cond_3a

    .line 1283
    .line 1284
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v5

    .line 1288
    invoke-virtual {v13}, LR0/l;->i()LR0/B;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v6

    .line 1292
    invoke-virtual {v5, v6}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 1293
    .line 1294
    .line 1295
    move-result v5

    .line 1296
    if-eqz v5, :cond_3a

    .line 1297
    .line 1298
    invoke-static {v3}, Landroidx/compose/ui/platform/z;->c(LR0/s;)Z

    .line 1299
    .line 1300
    .line 1301
    move-result v5

    .line 1302
    if-nez v5, :cond_3a

    .line 1303
    .line 1304
    invoke-virtual {v2}, LL1/B;->D()I

    .line 1305
    .line 1306
    .line 1307
    move-result v5

    .line 1308
    or-int/lit8 v5, v5, 0x14

    .line 1309
    .line 1310
    invoke-virtual {v2, v5}, LL1/B;->T0(I)V

    .line 1311
    .line 1312
    .line 1313
    :cond_3a
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1314
    .line 1315
    const/16 v6, 0x1a

    .line 1316
    .line 1317
    if-lt v5, v6, :cond_46

    .line 1318
    .line 1319
    new-instance v5, Ljava/util/ArrayList;

    .line 1320
    .line 1321
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1322
    .line 1323
    .line 1324
    const-string v6, "androidx.compose.ui.semantics.id"

    .line 1325
    .line 1326
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1327
    .line 1328
    .line 1329
    invoke-virtual {v2}, LL1/B;->K()Ljava/lang/CharSequence;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v6

    .line 1333
    if-eqz v6, :cond_3c

    .line 1334
    .line 1335
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 1336
    .line 1337
    .line 1338
    move-result v6

    .line 1339
    if-nez v6, :cond_3b

    .line 1340
    .line 1341
    goto :goto_1c

    .line 1342
    :cond_3b
    move v6, v9

    .line 1343
    goto :goto_1d

    .line 1344
    :cond_3c
    :goto_1c
    move v6, v7

    .line 1345
    :goto_1d
    if-nez v6, :cond_3d

    .line 1346
    .line 1347
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v6

    .line 1351
    invoke-virtual {v13}, LR0/l;->i()LR0/B;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v11

    .line 1355
    invoke-virtual {v6, v11}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 1356
    .line 1357
    .line 1358
    move-result v6

    .line 1359
    if-eqz v6, :cond_3d

    .line 1360
    .line 1361
    const-string v6, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"

    .line 1362
    .line 1363
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1364
    .line 1365
    .line 1366
    :cond_3d
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v6

    .line 1370
    invoke-virtual {v8}, LR0/x;->I()LR0/B;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v11

    .line 1374
    invoke-virtual {v6, v11}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 1375
    .line 1376
    .line 1377
    move-result v6

    .line 1378
    if-eqz v6, :cond_3e

    .line 1379
    .line 1380
    const-string v6, "androidx.compose.ui.semantics.testTag"

    .line 1381
    .line 1382
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1383
    .line 1384
    .line 1385
    :cond_3e
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v6

    .line 1389
    invoke-virtual {v8}, LR0/x;->G()LR0/B;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v8

    .line 1393
    invoke-virtual {v6, v8}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 1394
    .line 1395
    .line 1396
    move-result v6

    .line 1397
    if-eqz v6, :cond_3f

    .line 1398
    .line 1399
    const-string v6, "androidx.compose.ui.semantics.shapeType"

    .line 1400
    .line 1401
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1402
    .line 1403
    .line 1404
    const-string v6, "androidx.compose.ui.semantics.shapeRect"

    .line 1405
    .line 1406
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1407
    .line 1408
    .line 1409
    const-string v6, "androidx.compose.ui.semantics.shapeCorners"

    .line 1410
    .line 1411
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1412
    .line 1413
    .line 1414
    const-string v6, "androidx.compose.ui.semantics.shapeRegion"

    .line 1415
    .line 1416
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1417
    .line 1418
    .line 1419
    :cond_3f
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v6

    .line 1423
    invoke-virtual {v6}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->n()Lt/e0;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v6

    .line 1427
    if-eqz v6, :cond_45

    .line 1428
    .line 1429
    iget-object v8, v6, Lt/e0;->b:[Ljava/lang/Object;

    .line 1430
    .line 1431
    iget-object v6, v6, Lt/e0;->a:[J

    .line 1432
    .line 1433
    array-length v11, v6

    .line 1434
    add-int/lit8 v11, v11, -0x2

    .line 1435
    .line 1436
    if-ltz v11, :cond_44

    .line 1437
    .line 1438
    move v12, v9

    .line 1439
    :goto_1e
    aget-wide v13, v6, v12

    .line 1440
    .line 1441
    not-long v9, v13

    .line 1442
    const/16 v17, 0x7

    .line 1443
    .line 1444
    shl-long v9, v9, v17

    .line 1445
    .line 1446
    and-long/2addr v9, v13

    .line 1447
    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    and-long v9, v9, v17

    .line 1453
    .line 1454
    cmp-long v9, v9, v17

    .line 1455
    .line 1456
    if-eqz v9, :cond_43

    .line 1457
    .line 1458
    sub-int v9, v12, v11

    .line 1459
    .line 1460
    not-int v9, v9

    .line 1461
    ushr-int/lit8 v9, v9, 0x1f

    .line 1462
    .line 1463
    const/16 v10, 0x8

    .line 1464
    .line 1465
    rsub-int/lit8 v9, v9, 0x8

    .line 1466
    .line 1467
    const/4 v15, 0x0

    .line 1468
    :goto_1f
    if-ge v15, v9, :cond_42

    .line 1469
    .line 1470
    const-wide/16 v18, 0xff

    .line 1471
    .line 1472
    and-long v18, v13, v18

    .line 1473
    .line 1474
    const-wide/16 v20, 0x80

    .line 1475
    .line 1476
    cmp-long v18, v18, v20

    .line 1477
    .line 1478
    if-gez v18, :cond_40

    .line 1479
    .line 1480
    move/from16 v18, v7

    .line 1481
    .line 1482
    goto :goto_20

    .line 1483
    :cond_40
    const/16 v18, 0x0

    .line 1484
    .line 1485
    :goto_20
    if-eqz v18, :cond_41

    .line 1486
    .line 1487
    shl-int/lit8 v18, v12, 0x3

    .line 1488
    .line 1489
    add-int v18, v18, v15

    .line 1490
    .line 1491
    aget-object v18, v8, v18

    .line 1492
    .line 1493
    check-cast v18, LR0/B;

    .line 1494
    .line 1495
    invoke-virtual/range {v18 .. v18}, LR0/B;->a()Ljava/lang/String;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v7

    .line 1499
    if-eqz v7, :cond_41

    .line 1500
    .line 1501
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1502
    .line 1503
    .line 1504
    sget-object v7, LTd/L;->a:LTd/L;

    .line 1505
    .line 1506
    :cond_41
    shr-long/2addr v13, v10

    .line 1507
    add-int/lit8 v15, v15, 0x1

    .line 1508
    .line 1509
    const/4 v7, 0x1

    .line 1510
    goto :goto_1f

    .line 1511
    :cond_42
    if-ne v9, v10, :cond_44

    .line 1512
    .line 1513
    :cond_43
    if-eq v12, v11, :cond_44

    .line 1514
    .line 1515
    add-int/lit8 v12, v12, 0x1

    .line 1516
    .line 1517
    const/4 v7, 0x1

    .line 1518
    const/4 v9, 0x0

    .line 1519
    goto :goto_1e

    .line 1520
    :cond_44
    sget-object v6, LTd/L;->a:LTd/L;

    .line 1521
    .line 1522
    :cond_45
    invoke-virtual {v2, v5}, LL1/B;->t0(Ljava/util/List;)V

    .line 1523
    .line 1524
    .line 1525
    :cond_46
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v5

    .line 1529
    sget-object v6, LR0/x;->a:LR0/x;

    .line 1530
    .line 1531
    invoke-virtual {v6}, LR0/x;->C()LR0/B;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v7

    .line 1535
    invoke-static {v5, v7}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v5

    .line 1539
    check-cast v5, LR0/g;

    .line 1540
    .line 1541
    if-eqz v5, :cond_4a

    .line 1542
    .line 1543
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v7

    .line 1547
    sget-object v8, LR0/l;->a:LR0/l;

    .line 1548
    .line 1549
    invoke-virtual {v8}, LR0/l;->x()LR0/B;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v9

    .line 1553
    invoke-virtual {v7, v9}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 1554
    .line 1555
    .line 1556
    move-result v7

    .line 1557
    if-eqz v7, :cond_47

    .line 1558
    .line 1559
    const-string v7, "android.widget.SeekBar"

    .line 1560
    .line 1561
    invoke-virtual {v2, v7}, LL1/B;->z0(Ljava/lang/CharSequence;)V

    .line 1562
    .line 1563
    .line 1564
    goto :goto_21

    .line 1565
    :cond_47
    const-string v7, "android.widget.ProgressBar"

    .line 1566
    .line 1567
    invoke-virtual {v2, v7}, LL1/B;->z0(Ljava/lang/CharSequence;)V

    .line 1568
    .line 1569
    .line 1570
    :goto_21
    sget-object v7, LR0/g;->d:LR0/g$a;

    .line 1571
    .line 1572
    invoke-virtual {v7}, LR0/g$a;->a()LR0/g;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v7

    .line 1576
    if-eq v5, v7, :cond_48

    .line 1577
    .line 1578
    invoke-virtual {v5}, LR0/g;->c()Loe/b;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v7

    .line 1582
    invoke-interface {v7}, Loe/c;->b()Ljava/lang/Comparable;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v7

    .line 1586
    check-cast v7, Ljava/lang/Number;

    .line 1587
    .line 1588
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 1589
    .line 1590
    .line 1591
    move-result v7

    .line 1592
    invoke-virtual {v5}, LR0/g;->c()Loe/b;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v9

    .line 1596
    invoke-interface {v9}, Loe/c;->e()Ljava/lang/Comparable;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v9

    .line 1600
    check-cast v9, Ljava/lang/Number;

    .line 1601
    .line 1602
    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    .line 1603
    .line 1604
    .line 1605
    move-result v9

    .line 1606
    invoke-virtual {v5}, LR0/g;->b()F

    .line 1607
    .line 1608
    .line 1609
    move-result v10

    .line 1610
    const/4 v11, 0x1

    .line 1611
    invoke-static {v11, v7, v9, v10}, LL1/B$h;->d(IFFF)LL1/B$h;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v7

    .line 1615
    invoke-virtual {v2, v7}, LL1/B;->Z0(LL1/B$h;)V

    .line 1616
    .line 1617
    .line 1618
    :cond_48
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v7

    .line 1622
    invoke-virtual {v8}, LR0/l;->x()LR0/B;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v8

    .line 1626
    invoke-virtual {v7, v8}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 1627
    .line 1628
    .line 1629
    move-result v7

    .line 1630
    if-eqz v7, :cond_4a

    .line 1631
    .line 1632
    invoke-static {v3}, Landroidx/compose/ui/platform/z;->b(LR0/s;)Z

    .line 1633
    .line 1634
    .line 1635
    move-result v7

    .line 1636
    if-eqz v7, :cond_4a

    .line 1637
    .line 1638
    invoke-virtual {v5}, LR0/g;->b()F

    .line 1639
    .line 1640
    .line 1641
    move-result v7

    .line 1642
    invoke-virtual {v5}, LR0/g;->c()Loe/b;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v8

    .line 1646
    invoke-interface {v8}, Loe/c;->e()Ljava/lang/Comparable;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v8

    .line 1650
    check-cast v8, Ljava/lang/Number;

    .line 1651
    .line 1652
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 1653
    .line 1654
    .line 1655
    move-result v8

    .line 1656
    invoke-virtual {v5}, LR0/g;->c()Loe/b;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v9

    .line 1660
    invoke-interface {v9}, Loe/c;->b()Ljava/lang/Comparable;

    .line 1661
    .line 1662
    .line 1663
    move-result-object v9

    .line 1664
    check-cast v9, Ljava/lang/Number;

    .line 1665
    .line 1666
    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    .line 1667
    .line 1668
    .line 1669
    move-result v9

    .line 1670
    invoke-static {v8, v9}, Loe/j;->d(FF)F

    .line 1671
    .line 1672
    .line 1673
    move-result v8

    .line 1674
    cmpg-float v7, v7, v8

    .line 1675
    .line 1676
    if-gez v7, :cond_49

    .line 1677
    .line 1678
    sget-object v7, LL1/B$a;->q:LL1/B$a;

    .line 1679
    .line 1680
    invoke-virtual {v2, v7}, LL1/B;->b(LL1/B$a;)V

    .line 1681
    .line 1682
    .line 1683
    :cond_49
    invoke-virtual {v5}, LR0/g;->b()F

    .line 1684
    .line 1685
    .line 1686
    move-result v7

    .line 1687
    invoke-virtual {v5}, LR0/g;->c()Loe/b;

    .line 1688
    .line 1689
    .line 1690
    move-result-object v8

    .line 1691
    invoke-interface {v8}, Loe/c;->b()Ljava/lang/Comparable;

    .line 1692
    .line 1693
    .line 1694
    move-result-object v8

    .line 1695
    check-cast v8, Ljava/lang/Number;

    .line 1696
    .line 1697
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 1698
    .line 1699
    .line 1700
    move-result v8

    .line 1701
    invoke-virtual {v5}, LR0/g;->c()Loe/b;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v5

    .line 1705
    invoke-interface {v5}, Loe/c;->e()Ljava/lang/Comparable;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v5

    .line 1709
    check-cast v5, Ljava/lang/Number;

    .line 1710
    .line 1711
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 1712
    .line 1713
    .line 1714
    move-result v5

    .line 1715
    invoke-static {v8, v5}, Loe/j;->h(FF)F

    .line 1716
    .line 1717
    .line 1718
    move-result v5

    .line 1719
    cmpl-float v5, v7, v5

    .line 1720
    .line 1721
    if-lez v5, :cond_4a

    .line 1722
    .line 1723
    sget-object v5, LL1/B$a;->r:LL1/B$a;

    .line 1724
    .line 1725
    invoke-virtual {v2, v5}, LL1/B;->b(LL1/B$a;)V

    .line 1726
    .line 1727
    .line 1728
    :cond_4a
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1729
    .line 1730
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/platform/y$b;->a(LL1/B;LR0/s;)V

    .line 1731
    .line 1732
    .line 1733
    invoke-static {v3, v2}, LL0/a;->d(LR0/s;LL1/B;)V

    .line 1734
    .line 1735
    .line 1736
    invoke-static {v3, v2}, LL0/a;->e(LR0/s;LL1/B;)V

    .line 1737
    .line 1738
    .line 1739
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v7

    .line 1743
    invoke-virtual {v6}, LR0/x;->l()LR0/B;

    .line 1744
    .line 1745
    .line 1746
    move-result-object v8

    .line 1747
    invoke-static {v7, v8}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v7

    .line 1751
    check-cast v7, LR0/j;

    .line 1752
    .line 1753
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v8

    .line 1757
    sget-object v9, LR0/l;->a:LR0/l;

    .line 1758
    .line 1759
    invoke-virtual {v9}, LR0/l;->u()LR0/B;

    .line 1760
    .line 1761
    .line 1762
    move-result-object v10

    .line 1763
    invoke-static {v8, v10}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1764
    .line 1765
    .line 1766
    move-result-object v8

    .line 1767
    check-cast v8, LR0/a;

    .line 1768
    .line 1769
    const/4 v10, 0x0

    .line 1770
    if-eqz v7, :cond_50

    .line 1771
    .line 1772
    if-eqz v8, :cond_50

    .line 1773
    .line 1774
    invoke-static {v3}, LL0/a;->b(LR0/s;)Z

    .line 1775
    .line 1776
    .line 1777
    move-result v11

    .line 1778
    if-nez v11, :cond_4b

    .line 1779
    .line 1780
    const-string v11, "android.widget.HorizontalScrollView"

    .line 1781
    .line 1782
    invoke-virtual {v2, v11}, LL1/B;->z0(Ljava/lang/CharSequence;)V

    .line 1783
    .line 1784
    .line 1785
    :cond_4b
    invoke-virtual {v7}, LR0/j;->a()Lie/a;

    .line 1786
    .line 1787
    .line 1788
    move-result-object v11

    .line 1789
    invoke-interface {v11}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1790
    .line 1791
    .line 1792
    move-result-object v11

    .line 1793
    check-cast v11, Ljava/lang/Number;

    .line 1794
    .line 1795
    invoke-virtual {v11}, Ljava/lang/Number;->floatValue()F

    .line 1796
    .line 1797
    .line 1798
    move-result v11

    .line 1799
    cmpl-float v11, v11, v10

    .line 1800
    .line 1801
    if-lez v11, :cond_4c

    .line 1802
    .line 1803
    const/4 v11, 0x1

    .line 1804
    invoke-virtual {v2, v11}, LL1/B;->c1(Z)V

    .line 1805
    .line 1806
    .line 1807
    :cond_4c
    invoke-static {v3}, Landroidx/compose/ui/platform/z;->b(LR0/s;)Z

    .line 1808
    .line 1809
    .line 1810
    move-result v11

    .line 1811
    if-eqz v11, :cond_50

    .line 1812
    .line 1813
    invoke-static {v7}, Landroidx/compose/ui/platform/y;->A0(LR0/j;)Z

    .line 1814
    .line 1815
    .line 1816
    move-result v11

    .line 1817
    if-eqz v11, :cond_4e

    .line 1818
    .line 1819
    sget-object v11, LL1/B$a;->q:LL1/B$a;

    .line 1820
    .line 1821
    invoke-virtual {v2, v11}, LL1/B;->b(LL1/B$a;)V

    .line 1822
    .line 1823
    .line 1824
    invoke-static {v3}, Landroidx/compose/ui/platform/z;->h(LR0/s;)Z

    .line 1825
    .line 1826
    .line 1827
    move-result v11

    .line 1828
    if-nez v11, :cond_4d

    .line 1829
    .line 1830
    sget-object v11, LL1/B$a;->F:LL1/B$a;

    .line 1831
    .line 1832
    goto :goto_22

    .line 1833
    :cond_4d
    sget-object v11, LL1/B$a;->D:LL1/B$a;

    .line 1834
    .line 1835
    :goto_22
    invoke-virtual {v2, v11}, LL1/B;->b(LL1/B$a;)V

    .line 1836
    .line 1837
    .line 1838
    :cond_4e
    invoke-static {v7}, Landroidx/compose/ui/platform/y;->z0(LR0/j;)Z

    .line 1839
    .line 1840
    .line 1841
    move-result v7

    .line 1842
    if-eqz v7, :cond_50

    .line 1843
    .line 1844
    sget-object v7, LL1/B$a;->r:LL1/B$a;

    .line 1845
    .line 1846
    invoke-virtual {v2, v7}, LL1/B;->b(LL1/B$a;)V

    .line 1847
    .line 1848
    .line 1849
    invoke-static {v3}, Landroidx/compose/ui/platform/z;->h(LR0/s;)Z

    .line 1850
    .line 1851
    .line 1852
    move-result v7

    .line 1853
    if-nez v7, :cond_4f

    .line 1854
    .line 1855
    sget-object v7, LL1/B$a;->D:LL1/B$a;

    .line 1856
    .line 1857
    goto :goto_23

    .line 1858
    :cond_4f
    sget-object v7, LL1/B$a;->F:LL1/B$a;

    .line 1859
    .line 1860
    :goto_23
    invoke-virtual {v2, v7}, LL1/B;->b(LL1/B$a;)V

    .line 1861
    .line 1862
    .line 1863
    :cond_50
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1864
    .line 1865
    .line 1866
    move-result-object v7

    .line 1867
    invoke-virtual {v6}, LR0/x;->O()LR0/B;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v11

    .line 1871
    invoke-static {v7, v11}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v7

    .line 1875
    check-cast v7, LR0/j;

    .line 1876
    .line 1877
    if-eqz v7, :cond_54

    .line 1878
    .line 1879
    if-eqz v8, :cond_54

    .line 1880
    .line 1881
    invoke-static {v3}, LL0/a;->b(LR0/s;)Z

    .line 1882
    .line 1883
    .line 1884
    move-result v8

    .line 1885
    if-nez v8, :cond_51

    .line 1886
    .line 1887
    const-string v8, "android.widget.ScrollView"

    .line 1888
    .line 1889
    invoke-virtual {v2, v8}, LL1/B;->z0(Ljava/lang/CharSequence;)V

    .line 1890
    .line 1891
    .line 1892
    :cond_51
    invoke-virtual {v7}, LR0/j;->a()Lie/a;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v8

    .line 1896
    invoke-interface {v8}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v8

    .line 1900
    check-cast v8, Ljava/lang/Number;

    .line 1901
    .line 1902
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 1903
    .line 1904
    .line 1905
    move-result v8

    .line 1906
    cmpl-float v8, v8, v10

    .line 1907
    .line 1908
    if-lez v8, :cond_52

    .line 1909
    .line 1910
    const/4 v11, 0x1

    .line 1911
    invoke-virtual {v2, v11}, LL1/B;->c1(Z)V

    .line 1912
    .line 1913
    .line 1914
    :cond_52
    invoke-static {v3}, Landroidx/compose/ui/platform/z;->b(LR0/s;)Z

    .line 1915
    .line 1916
    .line 1917
    move-result v8

    .line 1918
    if-eqz v8, :cond_54

    .line 1919
    .line 1920
    invoke-static {v7}, Landroidx/compose/ui/platform/y;->A0(LR0/j;)Z

    .line 1921
    .line 1922
    .line 1923
    move-result v8

    .line 1924
    if-eqz v8, :cond_53

    .line 1925
    .line 1926
    sget-object v8, LL1/B$a;->q:LL1/B$a;

    .line 1927
    .line 1928
    invoke-virtual {v2, v8}, LL1/B;->b(LL1/B$a;)V

    .line 1929
    .line 1930
    .line 1931
    sget-object v8, LL1/B$a;->E:LL1/B$a;

    .line 1932
    .line 1933
    invoke-virtual {v2, v8}, LL1/B;->b(LL1/B$a;)V

    .line 1934
    .line 1935
    .line 1936
    :cond_53
    invoke-static {v7}, Landroidx/compose/ui/platform/y;->z0(LR0/j;)Z

    .line 1937
    .line 1938
    .line 1939
    move-result v7

    .line 1940
    if-eqz v7, :cond_54

    .line 1941
    .line 1942
    sget-object v7, LL1/B$a;->r:LL1/B$a;

    .line 1943
    .line 1944
    invoke-virtual {v2, v7}, LL1/B;->b(LL1/B$a;)V

    .line 1945
    .line 1946
    .line 1947
    sget-object v7, LL1/B$a;->C:LL1/B$a;

    .line 1948
    .line 1949
    invoke-virtual {v2, v7}, LL1/B;->b(LL1/B$a;)V

    .line 1950
    .line 1951
    .line 1952
    :cond_54
    const/16 v7, 0x1d

    .line 1953
    .line 1954
    if-lt v5, v7, :cond_55

    .line 1955
    .line 1956
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/platform/y$c;->a(LL1/B;LR0/s;)V

    .line 1957
    .line 1958
    .line 1959
    :cond_55
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1960
    .line 1961
    .line 1962
    move-result-object v5

    .line 1963
    invoke-virtual {v6}, LR0/x;->A()LR0/B;

    .line 1964
    .line 1965
    .line 1966
    move-result-object v6

    .line 1967
    invoke-static {v5, v6}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1968
    .line 1969
    .line 1970
    move-result-object v5

    .line 1971
    check-cast v5, Ljava/lang/CharSequence;

    .line 1972
    .line 1973
    invoke-virtual {v2, v5}, LL1/B;->V0(Ljava/lang/CharSequence;)V

    .line 1974
    .line 1975
    .line 1976
    invoke-static {v3}, Landroidx/compose/ui/platform/z;->b(LR0/s;)Z

    .line 1977
    .line 1978
    .line 1979
    move-result v5

    .line 1980
    if-eqz v5, :cond_5f

    .line 1981
    .line 1982
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 1983
    .line 1984
    .line 1985
    move-result-object v5

    .line 1986
    invoke-virtual {v9}, LR0/l;->g()LR0/B;

    .line 1987
    .line 1988
    .line 1989
    move-result-object v6

    .line 1990
    invoke-static {v5, v6}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 1991
    .line 1992
    .line 1993
    move-result-object v5

    .line 1994
    check-cast v5, LR0/a;

    .line 1995
    .line 1996
    if-eqz v5, :cond_56

    .line 1997
    .line 1998
    new-instance v6, LL1/B$a;

    .line 1999
    .line 2000
    const/high16 v7, 0x40000

    .line 2001
    .line 2002
    invoke-virtual {v5}, LR0/a;->b()Ljava/lang/String;

    .line 2003
    .line 2004
    .line 2005
    move-result-object v5

    .line 2006
    invoke-direct {v6, v7, v5}, LL1/B$a;-><init>(ILjava/lang/CharSequence;)V

    .line 2007
    .line 2008
    .line 2009
    invoke-virtual {v2, v6}, LL1/B;->b(LL1/B$a;)V

    .line 2010
    .line 2011
    .line 2012
    sget-object v5, LTd/L;->a:LTd/L;

    .line 2013
    .line 2014
    :cond_56
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 2015
    .line 2016
    .line 2017
    move-result-object v5

    .line 2018
    invoke-virtual {v9}, LR0/l;->b()LR0/B;

    .line 2019
    .line 2020
    .line 2021
    move-result-object v6

    .line 2022
    invoke-static {v5, v6}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 2023
    .line 2024
    .line 2025
    move-result-object v5

    .line 2026
    check-cast v5, LR0/a;

    .line 2027
    .line 2028
    if-eqz v5, :cond_57

    .line 2029
    .line 2030
    new-instance v6, LL1/B$a;

    .line 2031
    .line 2032
    const/high16 v7, 0x80000

    .line 2033
    .line 2034
    invoke-virtual {v5}, LR0/a;->b()Ljava/lang/String;

    .line 2035
    .line 2036
    .line 2037
    move-result-object v5

    .line 2038
    invoke-direct {v6, v7, v5}, LL1/B$a;-><init>(ILjava/lang/CharSequence;)V

    .line 2039
    .line 2040
    .line 2041
    invoke-virtual {v2, v6}, LL1/B;->b(LL1/B$a;)V

    .line 2042
    .line 2043
    .line 2044
    sget-object v5, LTd/L;->a:LTd/L;

    .line 2045
    .line 2046
    :cond_57
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 2047
    .line 2048
    .line 2049
    move-result-object v5

    .line 2050
    invoke-virtual {v9}, LR0/l;->f()LR0/B;

    .line 2051
    .line 2052
    .line 2053
    move-result-object v6

    .line 2054
    invoke-static {v5, v6}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 2055
    .line 2056
    .line 2057
    move-result-object v5

    .line 2058
    check-cast v5, LR0/a;

    .line 2059
    .line 2060
    if-eqz v5, :cond_58

    .line 2061
    .line 2062
    new-instance v6, LL1/B$a;

    .line 2063
    .line 2064
    const/high16 v7, 0x100000

    .line 2065
    .line 2066
    invoke-virtual {v5}, LR0/a;->b()Ljava/lang/String;

    .line 2067
    .line 2068
    .line 2069
    move-result-object v5

    .line 2070
    invoke-direct {v6, v7, v5}, LL1/B$a;-><init>(ILjava/lang/CharSequence;)V

    .line 2071
    .line 2072
    .line 2073
    invoke-virtual {v2, v6}, LL1/B;->b(LL1/B$a;)V

    .line 2074
    .line 2075
    .line 2076
    sget-object v5, LTd/L;->a:LTd/L;

    .line 2077
    .line 2078
    :cond_58
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 2079
    .line 2080
    .line 2081
    move-result-object v5

    .line 2082
    invoke-virtual {v9}, LR0/l;->d()LR0/B;

    .line 2083
    .line 2084
    .line 2085
    move-result-object v6

    .line 2086
    invoke-virtual {v5, v6}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 2087
    .line 2088
    .line 2089
    move-result v5

    .line 2090
    if-eqz v5, :cond_5f

    .line 2091
    .line 2092
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 2093
    .line 2094
    .line 2095
    move-result-object v5

    .line 2096
    invoke-virtual {v9}, LR0/l;->d()LR0/B;

    .line 2097
    .line 2098
    .line 2099
    move-result-object v6

    .line 2100
    invoke-virtual {v5, v6}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->l(LR0/B;)Ljava/lang/Object;

    .line 2101
    .line 2102
    .line 2103
    move-result-object v5

    .line 2104
    check-cast v5, Ljava/util/List;

    .line 2105
    .line 2106
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 2107
    .line 2108
    .line 2109
    move-result v6

    .line 2110
    sget-object v7, Landroidx/compose/ui/platform/y;->U:Lt/m;

    .line 2111
    .line 2112
    iget v8, v7, Lt/m;->b:I

    .line 2113
    .line 2114
    if-ge v6, v8, :cond_5e

    .line 2115
    .line 2116
    new-instance v6, Lt/j0;

    .line 2117
    .line 2118
    const/4 v8, 0x0

    .line 2119
    const/4 v11, 0x1

    .line 2120
    const/4 v15, 0x0

    .line 2121
    invoke-direct {v6, v15, v11, v8}, Lt/j0;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2122
    .line 2123
    .line 2124
    invoke-static {}, Lt/U;->b()Lt/K;

    .line 2125
    .line 2126
    .line 2127
    move-result-object v9

    .line 2128
    iget-object v10, v0, Landroidx/compose/ui/platform/y;->x:Lt/j0;

    .line 2129
    .line 2130
    invoke-virtual {v10, v1}, Lt/j0;->e(I)Z

    .line 2131
    .line 2132
    .line 2133
    move-result v10

    .line 2134
    if-eqz v10, :cond_5c

    .line 2135
    .line 2136
    iget-object v10, v0, Landroidx/compose/ui/platform/y;->x:Lt/j0;

    .line 2137
    .line 2138
    invoke-virtual {v10, v1}, Lt/j0;->f(I)Ljava/lang/Object;

    .line 2139
    .line 2140
    .line 2141
    move-result-object v10

    .line 2142
    check-cast v10, Lt/K;

    .line 2143
    .line 2144
    new-instance v12, Lt/E;

    .line 2145
    .line 2146
    invoke-direct {v12, v15, v11, v8}, Lt/E;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2147
    .line 2148
    .line 2149
    iget-object v8, v7, Lt/m;->a:[I

    .line 2150
    .line 2151
    iget v7, v7, Lt/m;->b:I

    .line 2152
    .line 2153
    const/4 v11, 0x0

    .line 2154
    :goto_24
    if-ge v11, v7, :cond_59

    .line 2155
    .line 2156
    aget v13, v8, v11

    .line 2157
    .line 2158
    invoke-virtual {v12, v13}, Lt/E;->h(I)Z

    .line 2159
    .line 2160
    .line 2161
    add-int/lit8 v11, v11, 0x1

    .line 2162
    .line 2163
    goto :goto_24

    .line 2164
    :cond_59
    new-instance v7, Ljava/util/ArrayList;

    .line 2165
    .line 2166
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 2167
    .line 2168
    .line 2169
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 2170
    .line 2171
    .line 2172
    move-result v8

    .line 2173
    if-gtz v8, :cond_5b

    .line 2174
    .line 2175
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 2176
    .line 2177
    .line 2178
    move-result v5

    .line 2179
    if-gtz v5, :cond_5a

    .line 2180
    .line 2181
    goto :goto_25

    .line 2182
    :cond_5a
    const/4 v15, 0x0

    .line 2183
    invoke-interface {v7, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2184
    .line 2185
    .line 2186
    move-result-object v1

    .line 2187
    invoke-static {v1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 2188
    .line 2189
    .line 2190
    invoke-virtual {v12, v15}, Lt/m;->b(I)I

    .line 2191
    .line 2192
    .line 2193
    const/16 v16, 0x0

    .line 2194
    .line 2195
    throw v16

    .line 2196
    :cond_5b
    const/4 v15, 0x0

    .line 2197
    const/16 v16, 0x0

    .line 2198
    .line 2199
    invoke-interface {v5, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2200
    .line 2201
    .line 2202
    move-result-object v1

    .line 2203
    invoke-static {v1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 2204
    .line 2205
    .line 2206
    invoke-static {v10}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 2207
    .line 2208
    .line 2209
    throw v16

    .line 2210
    :cond_5c
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 2211
    .line 2212
    .line 2213
    move-result v8

    .line 2214
    if-gtz v8, :cond_5d

    .line 2215
    .line 2216
    :goto_25
    iget-object v5, v0, Landroidx/compose/ui/platform/y;->w:Lt/j0;

    .line 2217
    .line 2218
    invoke-virtual {v5, v1, v6}, Lt/j0;->j(ILjava/lang/Object;)V

    .line 2219
    .line 2220
    .line 2221
    iget-object v5, v0, Landroidx/compose/ui/platform/y;->x:Lt/j0;

    .line 2222
    .line 2223
    invoke-virtual {v5, v1, v9}, Lt/j0;->j(ILjava/lang/Object;)V

    .line 2224
    .line 2225
    .line 2226
    goto :goto_26

    .line 2227
    :cond_5d
    const/4 v15, 0x0

    .line 2228
    invoke-interface {v5, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2229
    .line 2230
    .line 2231
    move-result-object v1

    .line 2232
    invoke-static {v1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 2233
    .line 2234
    .line 2235
    invoke-virtual {v7, v15}, Lt/m;->b(I)I

    .line 2236
    .line 2237
    .line 2238
    const/16 v16, 0x0

    .line 2239
    .line 2240
    throw v16

    .line 2241
    :cond_5e
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 2242
    .line 2243
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2244
    .line 2245
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 2246
    .line 2247
    .line 2248
    const-string v3, "Can\'t have more than "

    .line 2249
    .line 2250
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2251
    .line 2252
    .line 2253
    iget v3, v7, Lt/m;->b:I

    .line 2254
    .line 2255
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2256
    .line 2257
    .line 2258
    const-string v3, " custom actions for one widget"

    .line 2259
    .line 2260
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2261
    .line 2262
    .line 2263
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2264
    .line 2265
    .line 2266
    move-result-object v2

    .line 2267
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2268
    .line 2269
    .line 2270
    throw v1

    .line 2271
    :cond_5f
    :goto_26
    invoke-static {v3, v4}, Landroidx/compose/ui/platform/z;->i(LR0/s;Landroid/content/res/Resources;)Z

    .line 2272
    .line 2273
    .line 2274
    move-result v4

    .line 2275
    invoke-virtual {v2, v4}, LL1/B;->b1(Z)V

    .line 2276
    .line 2277
    .line 2278
    iget-object v4, v0, Landroidx/compose/ui/platform/y;->G:Lt/D;

    .line 2279
    .line 2280
    const/4 v5, -0x1

    .line 2281
    invoke-virtual {v4, v1, v5}, Lt/j;->e(II)I

    .line 2282
    .line 2283
    .line 2284
    move-result v4

    .line 2285
    if-eq v4, v5, :cond_61

    .line 2286
    .line 2287
    iget-object v5, v0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2288
    .line 2289
    invoke-virtual {v5}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/a0;

    .line 2290
    .line 2291
    .line 2292
    move-result-object v5

    .line 2293
    invoke-static {v5, v4}, Landroidx/compose/ui/platform/m1;->d(Landroidx/compose/ui/platform/a0;I)Landroid/view/View;

    .line 2294
    .line 2295
    .line 2296
    move-result-object v5

    .line 2297
    if-eqz v5, :cond_60

    .line 2298
    .line 2299
    invoke-virtual {v2, v5}, LL1/B;->n1(Landroid/view/View;)V

    .line 2300
    .line 2301
    .line 2302
    goto :goto_27

    .line 2303
    :cond_60
    iget-object v5, v0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2304
    .line 2305
    invoke-virtual {v2, v5, v4}, LL1/B;->o1(Landroid/view/View;I)V

    .line 2306
    .line 2307
    .line 2308
    :goto_27
    iget-object v4, v0, Landroidx/compose/ui/platform/y;->I:Ljava/lang/String;

    .line 2309
    .line 2310
    const/4 v8, 0x0

    .line 2311
    invoke-direct {v0, v1, v2, v4, v8}, Landroidx/compose/ui/platform/y;->N(ILL1/B;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 2312
    .line 2313
    .line 2314
    :cond_61
    iget-object v4, v0, Landroidx/compose/ui/platform/y;->H:Lt/D;

    .line 2315
    .line 2316
    const/4 v5, -0x1

    .line 2317
    invoke-virtual {v4, v1, v5}, Lt/j;->e(II)I

    .line 2318
    .line 2319
    .line 2320
    move-result v4

    .line 2321
    if-eq v4, v5, :cond_62

    .line 2322
    .line 2323
    iget-object v5, v0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2324
    .line 2325
    invoke-virtual {v5}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/a0;

    .line 2326
    .line 2327
    .line 2328
    move-result-object v5

    .line 2329
    invoke-static {v5, v4}, Landroidx/compose/ui/platform/m1;->d(Landroidx/compose/ui/platform/a0;I)Landroid/view/View;

    .line 2330
    .line 2331
    .line 2332
    move-result-object v4

    .line 2333
    if-eqz v4, :cond_62

    .line 2334
    .line 2335
    invoke-virtual {v2, v4}, LL1/B;->l1(Landroid/view/View;)V

    .line 2336
    .line 2337
    .line 2338
    iget-object v4, v0, Landroidx/compose/ui/platform/y;->J:Ljava/lang/String;

    .line 2339
    .line 2340
    const/4 v8, 0x0

    .line 2341
    invoke-direct {v0, v1, v2, v4, v8}, Landroidx/compose/ui/platform/y;->N(ILL1/B;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 2342
    .line 2343
    .line 2344
    :cond_62
    invoke-virtual {v3}, LR0/s;->y()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 2345
    .line 2346
    .line 2347
    move-result-object v1

    .line 2348
    sget-object v3, LR0/y;->a:LR0/y;

    .line 2349
    .line 2350
    invoke-virtual {v3}, LR0/y;->a()LR0/B;

    .line 2351
    .line 2352
    .line 2353
    move-result-object v3

    .line 2354
    invoke-static {v1, v3}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 2355
    .line 2356
    .line 2357
    move-result-object v1

    .line 2358
    check-cast v1, Ljava/lang/String;

    .line 2359
    .line 2360
    if-eqz v1, :cond_63

    .line 2361
    .line 2362
    invoke-virtual {v2, v1}, LL1/B;->z0(Ljava/lang/CharSequence;)V

    .line 2363
    .line 2364
    .line 2365
    sget-object v1, LTd/L;->a:LTd/L;

    .line 2366
    .line 2367
    :cond_63
    return-void
.end method

.method public static final synthetic z(Landroidx/compose/ui/platform/y;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/compose/ui/platform/y;->q:I

    .line 2
    .line 3
    return p0
.end method

.method private static final z0(LR0/j;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LR0/j;->c()Lie/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    cmpl-float v0, v0, v1

    .line 17
    .line 18
    if-lez v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, LR0/j;->b()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, LR0/j;->c()Lie/a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Ljava/lang/Number;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p0}, LR0/j;->a()Lie/a;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Ljava/lang/Number;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    cmpg-float v0, v0, v1

    .line 55
    .line 56
    if-gez v0, :cond_2

    .line 57
    .line 58
    invoke-virtual {p0}, LR0/j;->b()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_2

    .line 63
    .line 64
    :cond_1
    const/4 p0, 0x1

    .line 65
    return p0

    .line 66
    :cond_2
    const/4 p0, 0x0

    .line 67
    return p0
.end method


# virtual methods
.method public final P(LZd/e;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p1, Landroidx/compose/ui/platform/y$g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroidx/compose/ui/platform/y$g;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/ui/platform/y$g;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/ui/platform/y$g;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/ui/platform/y$g;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Landroidx/compose/ui/platform/y$g;-><init>(Landroidx/compose/ui/platform/y;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Landroidx/compose/ui/platform/y$g;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/ui/platform/y$g;->e:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v5, :cond_3

    .line 39
    .line 40
    if-ne v2, v4, :cond_2

    .line 41
    .line 42
    iget-object v2, v0, Landroidx/compose/ui/platform/y$g;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, LIf/i;

    .line 45
    .line 46
    iget-object v6, v0, Landroidx/compose/ui/platform/y$g;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v6, Lt/G;

    .line 49
    .line 50
    :try_start_0
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    :cond_1
    move-object p1, v6

    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto/16 :goto_5

    .line 57
    .line 58
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :cond_3
    iget-object v2, v0, Landroidx/compose/ui/platform/y$g;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, LIf/i;

    .line 69
    .line 70
    iget-object v6, v0, Landroidx/compose/ui/platform/y$g;->a:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v6, Lt/G;

    .line 73
    .line 74
    :try_start_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :try_start_2
    new-instance p1, Lt/G;

    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    invoke-direct {p1, v3, v5, v2}, Lt/G;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 85
    .line 86
    .line 87
    iget-object v2, p0, Landroidx/compose/ui/platform/y;->B:LIf/g;

    .line 88
    .line 89
    invoke-interface {v2}, LIf/v;->iterator()LIf/i;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    :goto_1
    iput-object p1, v0, Landroidx/compose/ui/platform/y$g;->a:Ljava/lang/Object;

    .line 94
    .line 95
    iput-object v2, v0, Landroidx/compose/ui/platform/y$g;->b:Ljava/lang/Object;

    .line 96
    .line 97
    iput v5, v0, Landroidx/compose/ui/platform/y$g;->e:I

    .line 98
    .line 99
    invoke-interface {v2, v0}, LIf/i;->a(LZd/e;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    if-ne v6, v1, :cond_5

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_5
    move-object v9, v6

    .line 107
    move-object v6, p1

    .line 108
    move-object p1, v9

    .line 109
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_8

    .line 116
    .line 117
    invoke-interface {v2}, LIf/i;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Landroidx/compose/ui/platform/y;->p0()Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-eqz p1, :cond_7

    .line 125
    .line 126
    iget-object p1, p0, Landroidx/compose/ui/platform/y;->A:Lt/b;

    .line 127
    .line 128
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    move v7, v3

    .line 133
    :goto_3
    if-ge v7, p1, :cond_6

    .line 134
    .line 135
    iget-object v8, p0, Landroidx/compose/ui/platform/y;->A:Lt/b;

    .line 136
    .line 137
    invoke-virtual {v8, v7}, Lt/b;->t(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    check-cast v8, LK0/J;

    .line 142
    .line 143
    invoke-direct {p0, v8, v6}, Landroidx/compose/ui/platform/y;->N0(LK0/J;Lt/G;)V

    .line 144
    .line 145
    .line 146
    invoke-direct {p0, v8}, Landroidx/compose/ui/platform/y;->O0(LK0/J;)V

    .line 147
    .line 148
    .line 149
    add-int/lit8 v7, v7, 0x1

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_6
    invoke-virtual {v6}, Lt/G;->i()V

    .line 153
    .line 154
    .line 155
    iget-boolean p1, p0, Landroidx/compose/ui/platform/y;->N:Z

    .line 156
    .line 157
    if-nez p1, :cond_7

    .line 158
    .line 159
    iput-boolean v5, p0, Landroidx/compose/ui/platform/y;->N:Z

    .line 160
    .line 161
    iget-object p1, p0, Landroidx/compose/ui/platform/y;->n:Landroid/os/Handler;

    .line 162
    .line 163
    iget-object v7, p0, Landroidx/compose/ui/platform/y;->P:Ljava/lang/Runnable;

    .line 164
    .line 165
    invoke-virtual {p1, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 166
    .line 167
    .line 168
    :cond_7
    iget-object p1, p0, Landroidx/compose/ui/platform/y;->A:Lt/b;

    .line 169
    .line 170
    invoke-virtual {p1}, Lt/b;->clear()V

    .line 171
    .line 172
    .line 173
    iget-object p1, p0, Landroidx/compose/ui/platform/y;->u:Lt/F;

    .line 174
    .line 175
    invoke-virtual {p1}, Lt/F;->h()V

    .line 176
    .line 177
    .line 178
    iget-object p1, p0, Landroidx/compose/ui/platform/y;->v:Lt/F;

    .line 179
    .line 180
    invoke-virtual {p1}, Lt/F;->h()V

    .line 181
    .line 182
    .line 183
    iget-wide v7, p0, Landroidx/compose/ui/platform/y;->i:J

    .line 184
    .line 185
    iput-object v6, v0, Landroidx/compose/ui/platform/y$g;->a:Ljava/lang/Object;

    .line 186
    .line 187
    iput-object v2, v0, Landroidx/compose/ui/platform/y$g;->b:Ljava/lang/Object;

    .line 188
    .line 189
    iput v4, v0, Landroidx/compose/ui/platform/y$g;->e:I

    .line 190
    .line 191
    invoke-static {v7, v8, v0}, LGf/Z;->a(JLZd/e;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 195
    if-ne p1, v1, :cond_1

    .line 196
    .line 197
    :goto_4
    return-object v1

    .line 198
    :cond_8
    iget-object p1, p0, Landroidx/compose/ui/platform/y;->A:Lt/b;

    .line 199
    .line 200
    invoke-virtual {p1}, Lt/b;->clear()V

    .line 201
    .line 202
    .line 203
    sget-object p1, LTd/L;->a:LTd/L;

    .line 204
    .line 205
    return-object p1

    .line 206
    :goto_5
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->A:Lt/b;

    .line 207
    .line 208
    invoke-virtual {v0}, Lt/b;->clear()V

    .line 209
    .line 210
    .line 211
    throw p1
.end method

.method public final Q(ZIJ)Z
    .locals 6

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    return p1

    .line 21
    :cond_0
    invoke-direct {p0}, Landroidx/compose/ui/platform/y;->d0()Lt/o;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    move-object v0, p0

    .line 26
    move v2, p1

    .line 27
    move v3, p2

    .line 28
    move-wide v4, p3

    .line 29
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/y;->R(Lt/o;ZIJ)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1
.end method

.method public final R0(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/ui/platform/y;->i:J

    .line 2
    .line 3
    return-void
.end method

.method public final Y(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/platform/y;->r0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x7

    .line 14
    const/4 v3, 0x1

    .line 15
    const/high16 v4, -0x80000000

    .line 16
    .line 17
    if-eq v0, v2, :cond_3

    .line 18
    .line 19
    const/16 v2, 0x9

    .line 20
    .line 21
    if-eq v0, v2, :cond_3

    .line 22
    .line 23
    const/16 v2, 0xa

    .line 24
    .line 25
    if-eq v0, v2, :cond_1

    .line 26
    .line 27
    return v1

    .line 28
    :cond_1
    iget v0, p0, Landroidx/compose/ui/platform/y;->e:I

    .line 29
    .line 30
    if-eq v0, v4, :cond_2

    .line 31
    .line 32
    invoke-direct {p0, v4}, Landroidx/compose/ui/platform/y;->c1(I)V

    .line 33
    .line 34
    .line 35
    return v3

    .line 36
    :cond_2
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/a0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    return p1

    .line 47
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/platform/y;->m0(FF)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object v1, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 60
    .line 61
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/a0;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/y;->c1(I)V

    .line 70
    .line 71
    .line 72
    if-ne v0, v4, :cond_4

    .line 73
    .line 74
    return p1

    .line 75
    :cond_4
    return v3
.end method

.method public b(Landroid/view/View;)LL1/C;
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/compose/ui/platform/y;->o:Landroidx/compose/ui/platform/y$e;

    .line 2
    .line 3
    return-object p1
.end method

.method public final e0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->J:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->I:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g0()Lt/D;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->H:Lt/D;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h0()Lt/D;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->G:Lt/D;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l0()Landroidx/compose/ui/platform/AndroidComposeView;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m0(FF)I
    .locals 12

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-static {v0, v3, v1, v2}, LK0/p0;->j(LK0/p0;ZILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    new-instance v7, LK0/w;

    .line 10
    .line 11
    invoke-direct {v7}, LK0/w;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()LK0/J;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    int-to-long v0, p1

    .line 25
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    int-to-long p1, p1

    .line 30
    const/16 v2, 0x20

    .line 31
    .line 32
    shl-long/2addr v0, v2

    .line 33
    const-wide v5, 0xffffffffL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long/2addr p1, v5

    .line 39
    or-long/2addr p1, v0

    .line 40
    invoke-static {p1, p2}, Lr0/f;->e(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v5

    .line 44
    const/16 v10, 0xc

    .line 45
    .line 46
    const/4 v11, 0x0

    .line 47
    const/4 v8, 0x0

    .line 48
    const/4 v9, 0x0

    .line 49
    invoke-static/range {v4 .. v11}, LK0/J;->N0(LK0/J;JLK0/w;IZILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v7}, LUd/u;->o(Ljava/util/List;)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    :goto_0
    const/high16 p2, -0x80000000

    .line 57
    .line 58
    const/4 v0, -0x1

    .line 59
    if-ge v0, p1, :cond_3

    .line 60
    .line 61
    invoke-virtual {v7, p1}, LK0/w;->r(I)Landroidx/compose/ui/e$c;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, LK0/k;->n(LK0/j;)LK0/J;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-object v1, p0, Landroidx/compose/ui/platform/y;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 70
    .line 71
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/a0;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Landroidx/compose/ui/platform/a0;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, Landroidx/compose/ui/viewinterop/b;

    .line 84
    .line 85
    if-eqz v1, :cond_0

    .line 86
    .line 87
    return p2

    .line 88
    :cond_0
    invoke-virtual {v0}, LK0/J;->t0()LK0/c0;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    const/16 v1, 0x8

    .line 93
    .line 94
    invoke-static {v1}, LK0/g0;->a(I)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    invoke-virtual {p2, v1}, LK0/c0;->q(I)Z

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    if-nez p2, :cond_1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_1
    invoke-virtual {v0}, LK0/J;->y()I

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    invoke-direct {p0, p2}, Landroidx/compose/ui/platform/y;->F0(I)I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    invoke-static {v0, v3}, LR0/t;->a(LK0/J;Z)LR0/s;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v0}, LR0/w;->d(LR0/s;)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-nez v1, :cond_2

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_2
    invoke-virtual {v0}, LR0/s;->p()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    sget-object v1, LR0/x;->a:LR0/x;

    .line 129
    .line 130
    invoke-virtual {v1}, LR0/x;->x()LR0/B;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v0, v1}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_3

    .line 139
    .line 140
    :goto_1
    add-int/lit8 p1, p1, -0x1

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_3
    return p2
.end method

.method public final p0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/platform/y;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->g:Landroid/view/accessibility/AccessibilityManager;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->l:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0

    .line 24
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 25
    return v0
.end method

.method public final t0(LK0/J;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/compose/ui/platform/y;->C:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/compose/ui/platform/y;->p0()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/y;->s0(LK0/J;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final u0()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/compose/ui/platform/y;->C:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/compose/ui/platform/y;->p0()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-boolean v1, p0, Landroidx/compose/ui/platform/y;->N:Z

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    iput-boolean v0, p0, Landroidx/compose/ui/platform/y;->N:Z

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->n:Landroid/os/Handler;

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/compose/ui/platform/y;->P:Ljava/lang/Runnable;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
