.class final Landroidx/compose/ui/window/l;
.super Landroidx/activity/r;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/compose/ui/platform/C1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/window/l$c;
    }
.end annotation


# instance fields
.field private d:Lie/a;

.field private e:Landroidx/compose/ui/window/k;

.field private final f:Landroid/view/View;

.field private final g:Landroidx/compose/ui/window/j;

.field private final h:F

.field private i:Z


# direct methods
.method public constructor <init>(Lie/a;Landroidx/compose/ui/window/k;Landroid/view/View;Li1/t;Li1/d;Ljava/util/UUID;)V
    .locals 6

    .line 1
    new-instance v0, Landroid/view/ContextThemeWrapper;

    .line 2
    .line 3
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p2}, Landroidx/compose/ui/window/k;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    sget v2, Ll0/n;->a:I

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget v2, Ll0/n;->b:I

    .line 17
    .line 18
    :goto_0
    invoke-direct {v0, v1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-direct {p0, v0, v2, v1, v3}, Landroidx/activity/r;-><init>(Landroid/content/Context;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Landroidx/compose/ui/window/l;->d:Lie/a;

    .line 28
    .line 29
    iput-object p2, p0, Landroidx/compose/ui/window/l;->e:Landroidx/compose/ui/window/k;

    .line 30
    .line 31
    iput-object p3, p0, Landroidx/compose/ui/window/l;->f:Landroid/view/View;

    .line 32
    .line 33
    const/16 p1, 0x8

    .line 34
    .line 35
    int-to-float p1, p1

    .line 36
    invoke-static {p1}, Li1/h;->n(F)F

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iput p1, p0, Landroidx/compose/ui/window/l;->h:F

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    if-eqz p2, :cond_6

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    invoke-virtual {p2, v0}, Landroid/view/Window;->requestFeature(I)Z

    .line 50
    .line 51
    .line 52
    const v0, 0x106000d

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, v0}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Landroidx/compose/ui/window/l;->e:Landroidx/compose/ui/window/k;

    .line 59
    .line 60
    invoke-virtual {v0}, Landroidx/compose/ui/window/k;->a()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-static {p2, v0}, Landroidx/core/view/o0;->b(Landroid/view/Window;Z)V

    .line 65
    .line 66
    .line 67
    const/16 v0, 0x11

    .line 68
    .line 69
    invoke-virtual {p2, v0}, Landroid/view/Window;->setGravity(I)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Landroidx/compose/ui/window/l;->e:Landroidx/compose/ui/window/k;

    .line 73
    .line 74
    invoke-virtual {v0}, Landroidx/compose/ui/window/k;->a()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_3

    .line 79
    .line 80
    const v0, 0x10100

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, v0}, Landroid/view/Window;->addFlags(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 91
    .line 92
    const/16 v4, 0x1c

    .line 93
    .line 94
    if-lt v1, v4, :cond_1

    .line 95
    .line 96
    sget-object v4, Landroidx/compose/ui/window/d;->a:Landroidx/compose/ui/window/d;

    .line 97
    .line 98
    invoke-virtual {v4, v0}, Landroidx/compose/ui/window/d;->a(Landroid/view/WindowManager$LayoutParams;)V

    .line 99
    .line 100
    .line 101
    :cond_1
    const/16 v4, 0x1e

    .line 102
    .line 103
    if-lt v1, v4, :cond_2

    .line 104
    .line 105
    sget-object v1, Landroidx/compose/ui/window/e;->a:Landroidx/compose/ui/window/e;

    .line 106
    .line 107
    invoke-virtual {v1, v0, v2}, Landroidx/compose/ui/window/e;->a(Landroid/view/WindowManager$LayoutParams;I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v0, v2}, Landroidx/compose/ui/window/e;->b(Landroid/view/WindowManager$LayoutParams;I)V

    .line 111
    .line 112
    .line 113
    :cond_2
    invoke-virtual {p2, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 114
    .line 115
    .line 116
    :cond_3
    new-instance v0, Landroidx/compose/ui/window/j;

    .line 117
    .line 118
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-direct {v0, v1, p2}, Landroidx/compose/ui/window/j;-><init>(Landroid/content/Context;Landroid/view/Window;)V

    .line 123
    .line 124
    .line 125
    iget-object v1, p0, Landroidx/compose/ui/window/l;->e:Landroidx/compose/ui/window/k;

    .line 126
    .line 127
    invoke-virtual {v1}, Landroidx/compose/ui/window/k;->f()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {p0, v1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 132
    .line 133
    .line 134
    sget v1, Ll0/l;->H:I

    .line 135
    .line 136
    new-instance v4, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 139
    .line 140
    .line 141
    const-string v5, "Dialog:"

    .line 142
    .line 143
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p6

    .line 153
    invoke-virtual {v0, v1, p6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 157
    .line 158
    .line 159
    invoke-interface {p5, p1}, Li1/d;->l1(F)F

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    invoke-virtual {v0, p1}, Landroid/view/View;->setElevation(F)V

    .line 164
    .line 165
    .line 166
    new-instance p1, Landroidx/compose/ui/window/l$a;

    .line 167
    .line 168
    invoke-direct {p1}, Landroidx/compose/ui/window/l$a;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, p1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 172
    .line 173
    .line 174
    iput-object v0, p0, Landroidx/compose/ui/window/l;->g:Landroidx/compose/ui/window/j;

    .line 175
    .line 176
    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    instance-of p2, p1, Landroid/view/ViewGroup;

    .line 181
    .line 182
    if-eqz p2, :cond_4

    .line 183
    .line 184
    move-object v3, p1

    .line 185
    check-cast v3, Landroid/view/ViewGroup;

    .line 186
    .line 187
    :cond_4
    if-eqz v3, :cond_5

    .line 188
    .line 189
    invoke-static {v3}, Landroidx/compose/ui/window/l;->h(Landroid/view/ViewGroup;)V

    .line 190
    .line 191
    .line 192
    :cond_5
    invoke-virtual {p0, v0}, Landroidx/activity/r;->setContentView(Landroid/view/View;)V

    .line 193
    .line 194
    .line 195
    invoke-static {p3}, Landroidx/lifecycle/Z;->a(Landroid/view/View;)Landroidx/lifecycle/r;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-static {v0, p1}, Landroidx/lifecycle/Z;->b(Landroid/view/View;Landroidx/lifecycle/r;)V

    .line 200
    .line 201
    .line 202
    invoke-static {p3}, Landroidx/lifecycle/a0;->a(Landroid/view/View;)Landroidx/lifecycle/Y;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-static {v0, p1}, Landroidx/lifecycle/a0;->b(Landroid/view/View;Landroidx/lifecycle/Y;)V

    .line 207
    .line 208
    .line 209
    invoke-static {p3}, LP3/m;->a(Landroid/view/View;)LP3/i;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-static {v0, p1}, LP3/m;->b(Landroid/view/View;LP3/i;)V

    .line 214
    .line 215
    .line 216
    iget-object p1, p0, Landroidx/compose/ui/window/l;->d:Lie/a;

    .line 217
    .line 218
    iget-object p2, p0, Landroidx/compose/ui/window/l;->e:Landroidx/compose/ui/window/k;

    .line 219
    .line 220
    invoke-virtual {p0, p1, p2, p4}, Landroidx/compose/ui/window/l;->o(Lie/a;Landroidx/compose/ui/window/k;Li1/t;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0}, Landroidx/activity/r;->getOnBackPressedDispatcher()Landroidx/activity/H;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    new-instance v3, Landroidx/compose/ui/window/l$b;

    .line 228
    .line 229
    invoke-direct {v3, p0}, Landroidx/compose/ui/window/l$b;-><init>(Landroidx/compose/ui/window/l;)V

    .line 230
    .line 231
    .line 232
    const/4 v4, 0x2

    .line 233
    const/4 v5, 0x0

    .line 234
    const/4 v2, 0x0

    .line 235
    move-object v1, p0

    .line 236
    invoke-static/range {v0 .. v5}, Landroidx/activity/J;->b(Landroidx/activity/H;Landroidx/lifecycle/r;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/activity/G;

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 241
    .line 242
    const-string p2, "Dialog has no window"

    .line 243
    .line 244
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    throw p1
.end method

.method private static final h(Landroid/view/ViewGroup;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 3
    .line 4
    .line 5
    instance-of v1, p0, Landroidx/compose/ui/window/j;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    :goto_0
    if-ge v0, v1, :cond_3

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    check-cast v2, Landroid/view/ViewGroup;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 v2, 0x0

    .line 28
    :goto_1
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-static {v2}, Landroidx/compose/ui/window/l;->h(Landroid/view/ViewGroup;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    return-void
.end method

.method public static final synthetic i(Landroidx/compose/ui/window/l;)Lie/a;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/window/l;->d:Lie/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic j(Landroidx/compose/ui/window/l;)Landroidx/compose/ui/window/k;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/window/l;->e:Landroidx/compose/ui/window/k;

    .line 2
    .line 3
    return-object p0
.end method

.method private final m(Li1/t;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/window/l;->g:Landroidx/compose/ui/window/j;

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/ui/window/l$c;->a:[I

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    aget p1, v1, p1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq p1, v1, :cond_1

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-ne p1, v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, LTd/r;

    .line 19
    .line 20
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    const/4 v1, 0x0

    .line 25
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private final n(Landroidx/compose/ui/window/u;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/window/l;->f:Landroid/view/View;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/window/b;->i(Landroid/view/View;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {p1, v0}, Landroidx/compose/ui/window/v;->a(Landroidx/compose/ui/window/u;Z)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const/16 v1, 0x2000

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    move p1, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/16 p1, -0x2001

    .line 25
    .line 26
    :goto_0
    invoke-virtual {v0, p1, v1}, Landroid/view/Window;->setFlags(II)V

    .line 27
    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 0

    .line 1
    return-void
.end method

.method public final k()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/window/l;->g:Landroidx/compose/ui/window/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/platform/a;->disposeComposition()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l(LY/y;Lkotlin/jvm/functions/Function2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/window/l;->g:Landroidx/compose/ui/window/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/window/j;->j(LY/y;Lkotlin/jvm/functions/Function2;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final o(Lie/a;Landroidx/compose/ui/window/k;Li1/t;)V
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/l;->d:Lie/a;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/window/l;->e:Landroidx/compose/ui/window/k;

    .line 4
    .line 5
    invoke-virtual {p2}, Landroidx/compose/ui/window/k;->d()Landroidx/compose/ui/window/u;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {p0, p1}, Landroidx/compose/ui/window/l;->n(Landroidx/compose/ui/window/u;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p3}, Landroidx/compose/ui/window/l;->m(Li1/t;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Landroidx/compose/ui/window/k;->a()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget-object p3, p0, Landroidx/compose/ui/window/l;->g:Landroidx/compose/ui/window/j;

    .line 20
    .line 21
    invoke-virtual {p2}, Landroidx/compose/ui/window/k;->e()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p3, v0, p1}, Landroidx/compose/ui/window/j;->k(ZZ)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Landroidx/compose/ui/window/k;->c()Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    invoke-virtual {p0, p2}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    if-eqz p2, :cond_2

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 46
    .line 47
    const/16 p3, 0x1f

    .line 48
    .line 49
    if-ge p1, p3, :cond_1

    .line 50
    .line 51
    const/16 p1, 0x10

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const/16 p1, 0x30

    .line 55
    .line 56
    :goto_0
    invoke-virtual {p2, p1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 57
    .line 58
    .line 59
    :cond_2
    return-void
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/window/l;->e:Landroidx/compose/ui/window/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/window/k;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isTracking()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCanceled()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/16 v0, 0x6f

    .line 22
    .line 23
    if-ne p1, v0, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Landroidx/compose/ui/window/l;->d:Lie/a;

    .line 26
    .line 27
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    return p1

    .line 32
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyUp(ILandroid/view/KeyEvent;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Landroidx/compose/ui/window/l;->e:Landroidx/compose/ui/window/k;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/compose/ui/window/k;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x3

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    if-eqz v1, :cond_3

    .line 15
    .line 16
    iget-object v1, p0, Landroidx/compose/ui/window/l;->g:Landroidx/compose/ui/window/j;

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Landroidx/compose/ui/window/j;->i(Landroid/view/MotionEvent;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_3

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    if-eq p1, v4, :cond_1

    .line 31
    .line 32
    if-eq p1, v2, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iput-boolean v3, p0, Landroidx/compose/ui/window/l;->i:Z

    .line 36
    .line 37
    return v0

    .line 38
    :cond_1
    iget-boolean p1, p0, Landroidx/compose/ui/window/l;->i:Z

    .line 39
    .line 40
    if-eqz p1, :cond_4

    .line 41
    .line 42
    iget-object p1, p0, Landroidx/compose/ui/window/l;->d:Lie/a;

    .line 43
    .line 44
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    iput-boolean v3, p0, Landroidx/compose/ui/window/l;->i:Z

    .line 48
    .line 49
    return v4

    .line 50
    :cond_2
    iput-boolean v4, p0, Landroidx/compose/ui/window/l;->i:Z

    .line 51
    .line 52
    return v4

    .line 53
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_5

    .line 58
    .line 59
    if-eq p1, v4, :cond_5

    .line 60
    .line 61
    if-eq p1, v2, :cond_5

    .line 62
    .line 63
    :cond_4
    :goto_0
    return v0

    .line 64
    :cond_5
    iput-boolean v3, p0, Landroidx/compose/ui/window/l;->i:Z

    .line 65
    .line 66
    return v0
.end method
