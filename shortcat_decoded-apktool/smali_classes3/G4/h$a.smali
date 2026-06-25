.class public final LG4/h$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG4/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private A:LGf/K;

.field private B:LG4/n$a;

.field private C:LE4/c$b;

.field private D:Ljava/lang/Integer;

.field private E:Landroid/graphics/drawable/Drawable;

.field private F:Ljava/lang/Integer;

.field private G:Landroid/graphics/drawable/Drawable;

.field private H:Ljava/lang/Integer;

.field private I:Landroid/graphics/drawable/Drawable;

.field private J:Landroidx/lifecycle/k;

.field private K:LH4/i;

.field private L:LH4/g;

.field private M:Landroidx/lifecycle/k;

.field private N:LH4/i;

.field private O:LH4/g;

.field private final a:Landroid/content/Context;

.field private b:LG4/c;

.field private c:Ljava/lang/Object;

.field private d:LI4/a;

.field private e:LG4/h$b;

.field private f:LE4/c$b;

.field private g:Ljava/lang/String;

.field private h:Landroid/graphics/Bitmap$Config;

.field private i:Landroid/graphics/ColorSpace;

.field private j:LH4/e;

.field private k:Lkotlin/Pair;

.field private l:Lx4/i$a;

.field private m:Ljava/util/List;

.field private n:LK4/c$a;

.field private o:Ldg/t$a;

.field private p:Ljava/util/Map;

.field private q:Z

.field private r:Ljava/lang/Boolean;

.field private s:Ljava/lang/Boolean;

.field private t:Z

.field private u:LG4/b;

.field private v:LG4/b;

.field private w:LG4/b;

.field private x:LGf/K;

.field private y:LGf/K;

.field private z:LGf/K;


# direct methods
.method public constructor <init>(LG4/h;Landroid/content/Context;)V
    .locals 2

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p2, p0, LG4/h$a;->a:Landroid/content/Context;

    .line 45
    invoke-virtual {p1}, LG4/h;->p()LG4/c;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->b:LG4/c;

    .line 46
    invoke-virtual {p1}, LG4/h;->m()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->c:Ljava/lang/Object;

    .line 47
    invoke-virtual {p1}, LG4/h;->M()LI4/a;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->d:LI4/a;

    .line 48
    invoke-virtual {p1}, LG4/h;->A()LG4/h$b;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->e:LG4/h$b;

    .line 49
    invoke-virtual {p1}, LG4/h;->B()LE4/c$b;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->f:LE4/c$b;

    .line 50
    invoke-virtual {p1}, LG4/h;->r()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->g:Ljava/lang/String;

    .line 51
    invoke-virtual {p1}, LG4/h;->q()LG4/d;

    move-result-object v0

    invoke-virtual {v0}, LG4/d;->c()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->h:Landroid/graphics/Bitmap$Config;

    .line 52
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, LG4/h;->k()Landroid/graphics/ColorSpace;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->i:Landroid/graphics/ColorSpace;

    .line 53
    :cond_0
    invoke-virtual {p1}, LG4/h;->q()LG4/d;

    move-result-object v0

    invoke-virtual {v0}, LG4/d;->k()LH4/e;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->j:LH4/e;

    .line 54
    invoke-virtual {p1}, LG4/h;->w()Lkotlin/Pair;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->k:Lkotlin/Pair;

    .line 55
    invoke-virtual {p1}, LG4/h;->o()Lx4/i$a;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->l:Lx4/i$a;

    .line 56
    invoke-virtual {p1}, LG4/h;->O()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->m:Ljava/util/List;

    .line 57
    invoke-virtual {p1}, LG4/h;->q()LG4/d;

    move-result-object v0

    invoke-virtual {v0}, LG4/d;->o()LK4/c$a;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->n:LK4/c$a;

    .line 58
    invoke-virtual {p1}, LG4/h;->x()Ldg/t;

    move-result-object v0

    invoke-virtual {v0}, Ldg/t;->l()Ldg/t$a;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->o:Ldg/t$a;

    .line 59
    invoke-virtual {p1}, LG4/h;->L()LG4/r;

    move-result-object v0

    invoke-virtual {v0}, LG4/r;->a()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, LUd/S;->B(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->p:Ljava/util/Map;

    .line 60
    invoke-virtual {p1}, LG4/h;->g()Z

    move-result v0

    iput-boolean v0, p0, LG4/h$a;->q:Z

    .line 61
    invoke-virtual {p1}, LG4/h;->q()LG4/d;

    move-result-object v0

    invoke-virtual {v0}, LG4/d;->a()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->r:Ljava/lang/Boolean;

    .line 62
    invoke-virtual {p1}, LG4/h;->q()LG4/d;

    move-result-object v0

    invoke-virtual {v0}, LG4/d;->b()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->s:Ljava/lang/Boolean;

    .line 63
    invoke-virtual {p1}, LG4/h;->I()Z

    move-result v0

    iput-boolean v0, p0, LG4/h$a;->t:Z

    .line 64
    invoke-virtual {p1}, LG4/h;->q()LG4/d;

    move-result-object v0

    invoke-virtual {v0}, LG4/d;->i()LG4/b;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->u:LG4/b;

    .line 65
    invoke-virtual {p1}, LG4/h;->q()LG4/d;

    move-result-object v0

    invoke-virtual {v0}, LG4/d;->e()LG4/b;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->v:LG4/b;

    .line 66
    invoke-virtual {p1}, LG4/h;->q()LG4/d;

    move-result-object v0

    invoke-virtual {v0}, LG4/d;->j()LG4/b;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->w:LG4/b;

    .line 67
    invoke-virtual {p1}, LG4/h;->q()LG4/d;

    move-result-object v0

    invoke-virtual {v0}, LG4/d;->g()LGf/K;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->x:LGf/K;

    .line 68
    invoke-virtual {p1}, LG4/h;->q()LG4/d;

    move-result-object v0

    invoke-virtual {v0}, LG4/d;->f()LGf/K;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->y:LGf/K;

    .line 69
    invoke-virtual {p1}, LG4/h;->q()LG4/d;

    move-result-object v0

    invoke-virtual {v0}, LG4/d;->d()LGf/K;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->z:LGf/K;

    .line 70
    invoke-virtual {p1}, LG4/h;->q()LG4/d;

    move-result-object v0

    invoke-virtual {v0}, LG4/d;->n()LGf/K;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->A:LGf/K;

    .line 71
    invoke-virtual {p1}, LG4/h;->E()LG4/n;

    move-result-object v0

    invoke-virtual {v0}, LG4/n;->e()LG4/n$a;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->B:LG4/n$a;

    .line 72
    invoke-virtual {p1}, LG4/h;->G()LE4/c$b;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->C:LE4/c$b;

    .line 73
    invoke-static {p1}, LG4/h;->f(LG4/h;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->D:Ljava/lang/Integer;

    .line 74
    invoke-static {p1}, LG4/h;->e(LG4/h;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->E:Landroid/graphics/drawable/Drawable;

    .line 75
    invoke-static {p1}, LG4/h;->b(LG4/h;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->F:Ljava/lang/Integer;

    .line 76
    invoke-static {p1}, LG4/h;->a(LG4/h;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->G:Landroid/graphics/drawable/Drawable;

    .line 77
    invoke-static {p1}, LG4/h;->d(LG4/h;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->H:Ljava/lang/Integer;

    .line 78
    invoke-static {p1}, LG4/h;->c(LG4/h;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->I:Landroid/graphics/drawable/Drawable;

    .line 79
    invoke-virtual {p1}, LG4/h;->q()LG4/d;

    move-result-object v0

    invoke-virtual {v0}, LG4/d;->h()Landroidx/lifecycle/k;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->J:Landroidx/lifecycle/k;

    .line 80
    invoke-virtual {p1}, LG4/h;->q()LG4/d;

    move-result-object v0

    invoke-virtual {v0}, LG4/d;->m()LH4/i;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->K:LH4/i;

    .line 81
    invoke-virtual {p1}, LG4/h;->q()LG4/d;

    move-result-object v0

    invoke-virtual {v0}, LG4/d;->l()LH4/g;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->L:LH4/g;

    .line 82
    invoke-virtual {p1}, LG4/h;->l()Landroid/content/Context;

    move-result-object v0

    if-ne v0, p2, :cond_1

    .line 83
    invoke-virtual {p1}, LG4/h;->z()Landroidx/lifecycle/k;

    move-result-object p2

    iput-object p2, p0, LG4/h$a;->M:Landroidx/lifecycle/k;

    .line 84
    invoke-virtual {p1}, LG4/h;->K()LH4/i;

    move-result-object p2

    iput-object p2, p0, LG4/h$a;->N:LH4/i;

    .line 85
    invoke-virtual {p1}, LG4/h;->J()LH4/g;

    move-result-object p1

    iput-object p1, p0, LG4/h$a;->O:LH4/g;

    return-void

    :cond_1
    const/4 p1, 0x0

    .line 86
    iput-object p1, p0, LG4/h$a;->M:Landroidx/lifecycle/k;

    .line 87
    iput-object p1, p0, LG4/h$a;->N:LH4/i;

    .line 88
    iput-object p1, p0, LG4/h$a;->O:LH4/g;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LG4/h$a;->a:Landroid/content/Context;

    .line 3
    invoke-static {}, LL4/i;->b()LG4/c;

    move-result-object p1

    iput-object p1, p0, LG4/h$a;->b:LG4/c;

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, LG4/h$a;->c:Ljava/lang/Object;

    .line 5
    iput-object p1, p0, LG4/h$a;->d:LI4/a;

    .line 6
    iput-object p1, p0, LG4/h$a;->e:LG4/h$b;

    .line 7
    iput-object p1, p0, LG4/h$a;->f:LE4/c$b;

    .line 8
    iput-object p1, p0, LG4/h$a;->g:Ljava/lang/String;

    .line 9
    iput-object p1, p0, LG4/h$a;->h:Landroid/graphics/Bitmap$Config;

    .line 10
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    iput-object p1, p0, LG4/h$a;->i:Landroid/graphics/ColorSpace;

    .line 11
    :cond_0
    iput-object p1, p0, LG4/h$a;->j:LH4/e;

    .line 12
    iput-object p1, p0, LG4/h$a;->k:Lkotlin/Pair;

    .line 13
    iput-object p1, p0, LG4/h$a;->l:Lx4/i$a;

    .line 14
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LG4/h$a;->m:Ljava/util/List;

    .line 15
    iput-object p1, p0, LG4/h$a;->n:LK4/c$a;

    .line 16
    iput-object p1, p0, LG4/h$a;->o:Ldg/t$a;

    .line 17
    iput-object p1, p0, LG4/h$a;->p:Ljava/util/Map;

    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, LG4/h$a;->q:Z

    .line 19
    iput-object p1, p0, LG4/h$a;->r:Ljava/lang/Boolean;

    .line 20
    iput-object p1, p0, LG4/h$a;->s:Ljava/lang/Boolean;

    .line 21
    iput-boolean v0, p0, LG4/h$a;->t:Z

    .line 22
    iput-object p1, p0, LG4/h$a;->u:LG4/b;

    .line 23
    iput-object p1, p0, LG4/h$a;->v:LG4/b;

    .line 24
    iput-object p1, p0, LG4/h$a;->w:LG4/b;

    .line 25
    iput-object p1, p0, LG4/h$a;->x:LGf/K;

    .line 26
    iput-object p1, p0, LG4/h$a;->y:LGf/K;

    .line 27
    iput-object p1, p0, LG4/h$a;->z:LGf/K;

    .line 28
    iput-object p1, p0, LG4/h$a;->A:LGf/K;

    .line 29
    iput-object p1, p0, LG4/h$a;->B:LG4/n$a;

    .line 30
    iput-object p1, p0, LG4/h$a;->C:LE4/c$b;

    .line 31
    iput-object p1, p0, LG4/h$a;->D:Ljava/lang/Integer;

    .line 32
    iput-object p1, p0, LG4/h$a;->E:Landroid/graphics/drawable/Drawable;

    .line 33
    iput-object p1, p0, LG4/h$a;->F:Ljava/lang/Integer;

    .line 34
    iput-object p1, p0, LG4/h$a;->G:Landroid/graphics/drawable/Drawable;

    .line 35
    iput-object p1, p0, LG4/h$a;->H:Ljava/lang/Integer;

    .line 36
    iput-object p1, p0, LG4/h$a;->I:Landroid/graphics/drawable/Drawable;

    .line 37
    iput-object p1, p0, LG4/h$a;->J:Landroidx/lifecycle/k;

    .line 38
    iput-object p1, p0, LG4/h$a;->K:LH4/i;

    .line 39
    iput-object p1, p0, LG4/h$a;->L:LH4/g;

    .line 40
    iput-object p1, p0, LG4/h$a;->M:Landroidx/lifecycle/k;

    .line 41
    iput-object p1, p0, LG4/h$a;->N:LH4/i;

    .line 42
    iput-object p1, p0, LG4/h$a;->O:LH4/g;

    return-void
.end method

.method private final h()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LG4/h$a;->O:LH4/g;

    .line 3
    .line 4
    return-void
.end method

.method private final i()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LG4/h$a;->M:Landroidx/lifecycle/k;

    .line 3
    .line 4
    iput-object v0, p0, LG4/h$a;->N:LH4/i;

    .line 5
    .line 6
    iput-object v0, p0, LG4/h$a;->O:LH4/g;

    .line 7
    .line 8
    return-void
.end method

.method private final j()Landroidx/lifecycle/k;
    .locals 1

    .line 1
    iget-object v0, p0, LG4/h$a;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, LL4/d;->c(Landroid/content/Context;)Landroidx/lifecycle/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, LG4/g;->a:LG4/g;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method private final k()LH4/g;
    .locals 3

    .line 1
    iget-object v0, p0, LG4/h$a;->K:LH4/i;

    .line 2
    .line 3
    instance-of v1, v0, LH4/k;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, LH4/k;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v2

    .line 12
    :goto_0
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-interface {v0}, LH4/k;->a()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-object v2, v0

    .line 22
    :cond_2
    :goto_1
    nop

    .line 23
    instance-of v0, v2, Landroid/widget/ImageView;

    .line 24
    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    check-cast v2, Landroid/widget/ImageView;

    .line 28
    .line 29
    invoke-static {v2}, LL4/j;->m(Landroid/widget/ImageView;)LH4/g;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0

    .line 34
    :cond_3
    sget-object v0, LH4/g;->b:LH4/g;

    .line 35
    .line 36
    return-object v0
.end method

.method private final l()LH4/i;
    .locals 2

    .line 1
    new-instance v0, LH4/d;

    .line 2
    .line 3
    iget-object v1, p0, LG4/h$a;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LH4/d;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method


# virtual methods
.method public final a()LG4/h;
    .locals 55

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v2, v0, LG4/h$a;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, v0, LG4/h$a;->c:Ljava/lang/Object;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    sget-object v1, LG4/j;->a:LG4/j;

    .line 10
    .line 11
    :cond_0
    move-object v3, v1

    .line 12
    iget-object v4, v0, LG4/h$a;->d:LI4/a;

    .line 13
    .line 14
    iget-object v5, v0, LG4/h$a;->e:LG4/h$b;

    .line 15
    .line 16
    iget-object v6, v0, LG4/h$a;->f:LE4/c$b;

    .line 17
    .line 18
    iget-object v7, v0, LG4/h$a;->g:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, v0, LG4/h$a;->h:Landroid/graphics/Bitmap$Config;

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    iget-object v1, v0, LG4/h$a;->b:LG4/c;

    .line 25
    .line 26
    invoke-virtual {v1}, LG4/c;->c()Landroid/graphics/Bitmap$Config;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :cond_1
    move-object v8, v1

    .line 31
    iget-object v9, v0, LG4/h$a;->i:Landroid/graphics/ColorSpace;

    .line 32
    .line 33
    iget-object v1, v0, LG4/h$a;->j:LH4/e;

    .line 34
    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    iget-object v1, v0, LG4/h$a;->b:LG4/c;

    .line 38
    .line 39
    invoke-virtual {v1}, LG4/c;->m()LH4/e;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :cond_2
    move-object v10, v1

    .line 44
    iget-object v11, v0, LG4/h$a;->k:Lkotlin/Pair;

    .line 45
    .line 46
    iget-object v12, v0, LG4/h$a;->l:Lx4/i$a;

    .line 47
    .line 48
    iget-object v13, v0, LG4/h$a;->m:Ljava/util/List;

    .line 49
    .line 50
    iget-object v1, v0, LG4/h$a;->n:LK4/c$a;

    .line 51
    .line 52
    if-nez v1, :cond_3

    .line 53
    .line 54
    iget-object v1, v0, LG4/h$a;->b:LG4/c;

    .line 55
    .line 56
    invoke-virtual {v1}, LG4/c;->o()LK4/c$a;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :cond_3
    move-object v14, v1

    .line 61
    iget-object v1, v0, LG4/h$a;->o:Ldg/t$a;

    .line 62
    .line 63
    if-eqz v1, :cond_4

    .line 64
    .line 65
    invoke-virtual {v1}, Ldg/t$a;->e()Ldg/t;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    goto :goto_0

    .line 70
    :cond_4
    const/4 v1, 0x0

    .line 71
    :goto_0
    invoke-static {v1}, LL4/j;->w(Ldg/t;)Ldg/t;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iget-object v15, v0, LG4/h$a;->p:Ljava/util/Map;

    .line 76
    .line 77
    move-object/from16 v17, v1

    .line 78
    .line 79
    if-eqz v15, :cond_5

    .line 80
    .line 81
    sget-object v1, LG4/r;->b:LG4/r$a;

    .line 82
    .line 83
    invoke-virtual {v1, v15}, LG4/r$a;->a(Ljava/util/Map;)LG4/r;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    goto :goto_1

    .line 88
    :cond_5
    const/4 v1, 0x0

    .line 89
    :goto_1
    invoke-static {v1}, LL4/j;->v(LG4/r;)LG4/r;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    iget-boolean v15, v0, LG4/h$a;->q:Z

    .line 94
    .line 95
    move-object/from16 v18, v1

    .line 96
    .line 97
    iget-object v1, v0, LG4/h$a;->r:Ljava/lang/Boolean;

    .line 98
    .line 99
    if-eqz v1, :cond_6

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    :goto_2
    move/from16 v19, v1

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_6
    iget-object v1, v0, LG4/h$a;->b:LG4/c;

    .line 109
    .line 110
    invoke-virtual {v1}, LG4/c;->a()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    goto :goto_2

    .line 115
    :goto_3
    iget-object v1, v0, LG4/h$a;->s:Ljava/lang/Boolean;

    .line 116
    .line 117
    if-eqz v1, :cond_7

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    :goto_4
    move/from16 v20, v1

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_7
    iget-object v1, v0, LG4/h$a;->b:LG4/c;

    .line 127
    .line 128
    invoke-virtual {v1}, LG4/c;->b()Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    goto :goto_4

    .line 133
    :goto_5
    iget-boolean v1, v0, LG4/h$a;->t:Z

    .line 134
    .line 135
    move/from16 v21, v1

    .line 136
    .line 137
    iget-object v1, v0, LG4/h$a;->u:LG4/b;

    .line 138
    .line 139
    if-nez v1, :cond_8

    .line 140
    .line 141
    iget-object v1, v0, LG4/h$a;->b:LG4/c;

    .line 142
    .line 143
    invoke-virtual {v1}, LG4/c;->j()LG4/b;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    :cond_8
    move-object/from16 v22, v1

    .line 148
    .line 149
    iget-object v1, v0, LG4/h$a;->v:LG4/b;

    .line 150
    .line 151
    if-nez v1, :cond_9

    .line 152
    .line 153
    iget-object v1, v0, LG4/h$a;->b:LG4/c;

    .line 154
    .line 155
    invoke-virtual {v1}, LG4/c;->e()LG4/b;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    :cond_9
    move-object/from16 v23, v1

    .line 160
    .line 161
    iget-object v1, v0, LG4/h$a;->w:LG4/b;

    .line 162
    .line 163
    if-nez v1, :cond_a

    .line 164
    .line 165
    iget-object v1, v0, LG4/h$a;->b:LG4/c;

    .line 166
    .line 167
    invoke-virtual {v1}, LG4/c;->k()LG4/b;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    :cond_a
    move-object/from16 v24, v1

    .line 172
    .line 173
    iget-object v1, v0, LG4/h$a;->x:LGf/K;

    .line 174
    .line 175
    if-nez v1, :cond_b

    .line 176
    .line 177
    iget-object v1, v0, LG4/h$a;->b:LG4/c;

    .line 178
    .line 179
    invoke-virtual {v1}, LG4/c;->i()LGf/K;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    :cond_b
    move-object/from16 v25, v1

    .line 184
    .line 185
    iget-object v1, v0, LG4/h$a;->y:LGf/K;

    .line 186
    .line 187
    if-nez v1, :cond_c

    .line 188
    .line 189
    iget-object v1, v0, LG4/h$a;->b:LG4/c;

    .line 190
    .line 191
    invoke-virtual {v1}, LG4/c;->h()LGf/K;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    :cond_c
    move-object/from16 v26, v1

    .line 196
    .line 197
    iget-object v1, v0, LG4/h$a;->z:LGf/K;

    .line 198
    .line 199
    if-nez v1, :cond_d

    .line 200
    .line 201
    iget-object v1, v0, LG4/h$a;->b:LG4/c;

    .line 202
    .line 203
    invoke-virtual {v1}, LG4/c;->d()LGf/K;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    :cond_d
    move-object/from16 v27, v1

    .line 208
    .line 209
    iget-object v1, v0, LG4/h$a;->A:LGf/K;

    .line 210
    .line 211
    if-nez v1, :cond_e

    .line 212
    .line 213
    iget-object v1, v0, LG4/h$a;->b:LG4/c;

    .line 214
    .line 215
    invoke-virtual {v1}, LG4/c;->n()LGf/K;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    :cond_e
    move-object/from16 v28, v1

    .line 220
    .line 221
    iget-object v1, v0, LG4/h$a;->J:Landroidx/lifecycle/k;

    .line 222
    .line 223
    if-nez v1, :cond_f

    .line 224
    .line 225
    iget-object v1, v0, LG4/h$a;->M:Landroidx/lifecycle/k;

    .line 226
    .line 227
    if-nez v1, :cond_f

    .line 228
    .line 229
    invoke-direct {v0}, LG4/h$a;->j()Landroidx/lifecycle/k;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    :cond_f
    move-object/from16 v29, v1

    .line 234
    .line 235
    iget-object v1, v0, LG4/h$a;->K:LH4/i;

    .line 236
    .line 237
    if-nez v1, :cond_10

    .line 238
    .line 239
    iget-object v1, v0, LG4/h$a;->N:LH4/i;

    .line 240
    .line 241
    if-nez v1, :cond_10

    .line 242
    .line 243
    invoke-direct {v0}, LG4/h$a;->l()LH4/i;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    :cond_10
    move-object/from16 v30, v1

    .line 248
    .line 249
    iget-object v1, v0, LG4/h$a;->L:LH4/g;

    .line 250
    .line 251
    if-nez v1, :cond_11

    .line 252
    .line 253
    iget-object v1, v0, LG4/h$a;->O:LH4/g;

    .line 254
    .line 255
    if-nez v1, :cond_11

    .line 256
    .line 257
    invoke-direct {v0}, LG4/h$a;->k()LH4/g;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    :cond_11
    move-object/from16 v31, v1

    .line 262
    .line 263
    iget-object v1, v0, LG4/h$a;->B:LG4/n$a;

    .line 264
    .line 265
    if-eqz v1, :cond_12

    .line 266
    .line 267
    invoke-virtual {v1}, LG4/n$a;->a()LG4/n;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    move-object/from16 v16, v1

    .line 272
    .line 273
    goto :goto_6

    .line 274
    :cond_12
    const/16 v16, 0x0

    .line 275
    .line 276
    :goto_6
    invoke-static/range {v16 .. v16}, LL4/j;->u(LG4/n;)LG4/n;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    move-object/from16 v16, v1

    .line 281
    .line 282
    iget-object v1, v0, LG4/h$a;->C:LE4/c$b;

    .line 283
    .line 284
    move-object/from16 v32, v1

    .line 285
    .line 286
    iget-object v1, v0, LG4/h$a;->D:Ljava/lang/Integer;

    .line 287
    .line 288
    move-object/from16 v33, v1

    .line 289
    .line 290
    iget-object v1, v0, LG4/h$a;->E:Landroid/graphics/drawable/Drawable;

    .line 291
    .line 292
    move-object/from16 v34, v1

    .line 293
    .line 294
    iget-object v1, v0, LG4/h$a;->F:Ljava/lang/Integer;

    .line 295
    .line 296
    move-object/from16 v35, v1

    .line 297
    .line 298
    iget-object v1, v0, LG4/h$a;->G:Landroid/graphics/drawable/Drawable;

    .line 299
    .line 300
    move-object/from16 v36, v1

    .line 301
    .line 302
    iget-object v1, v0, LG4/h$a;->H:Ljava/lang/Integer;

    .line 303
    .line 304
    move-object/from16 v37, v1

    .line 305
    .line 306
    iget-object v1, v0, LG4/h$a;->I:Landroid/graphics/drawable/Drawable;

    .line 307
    .line 308
    new-instance v38, LG4/d;

    .line 309
    .line 310
    move-object/from16 v54, v1

    .line 311
    .line 312
    iget-object v1, v0, LG4/h$a;->J:Landroidx/lifecycle/k;

    .line 313
    .line 314
    move-object/from16 v39, v1

    .line 315
    .line 316
    iget-object v1, v0, LG4/h$a;->K:LH4/i;

    .line 317
    .line 318
    move-object/from16 v40, v1

    .line 319
    .line 320
    iget-object v1, v0, LG4/h$a;->L:LH4/g;

    .line 321
    .line 322
    move-object/from16 v41, v1

    .line 323
    .line 324
    iget-object v1, v0, LG4/h$a;->x:LGf/K;

    .line 325
    .line 326
    move-object/from16 v42, v1

    .line 327
    .line 328
    iget-object v1, v0, LG4/h$a;->y:LGf/K;

    .line 329
    .line 330
    move-object/from16 v43, v1

    .line 331
    .line 332
    iget-object v1, v0, LG4/h$a;->z:LGf/K;

    .line 333
    .line 334
    move-object/from16 v44, v1

    .line 335
    .line 336
    iget-object v1, v0, LG4/h$a;->A:LGf/K;

    .line 337
    .line 338
    move-object/from16 v45, v1

    .line 339
    .line 340
    iget-object v1, v0, LG4/h$a;->n:LK4/c$a;

    .line 341
    .line 342
    move-object/from16 v46, v1

    .line 343
    .line 344
    iget-object v1, v0, LG4/h$a;->j:LH4/e;

    .line 345
    .line 346
    move-object/from16 v47, v1

    .line 347
    .line 348
    iget-object v1, v0, LG4/h$a;->h:Landroid/graphics/Bitmap$Config;

    .line 349
    .line 350
    move-object/from16 v48, v1

    .line 351
    .line 352
    iget-object v1, v0, LG4/h$a;->r:Ljava/lang/Boolean;

    .line 353
    .line 354
    move-object/from16 v49, v1

    .line 355
    .line 356
    iget-object v1, v0, LG4/h$a;->s:Ljava/lang/Boolean;

    .line 357
    .line 358
    move-object/from16 v50, v1

    .line 359
    .line 360
    iget-object v1, v0, LG4/h$a;->u:LG4/b;

    .line 361
    .line 362
    move-object/from16 v51, v1

    .line 363
    .line 364
    iget-object v1, v0, LG4/h$a;->v:LG4/b;

    .line 365
    .line 366
    move-object/from16 v52, v1

    .line 367
    .line 368
    iget-object v1, v0, LG4/h$a;->w:LG4/b;

    .line 369
    .line 370
    move-object/from16 v53, v1

    .line 371
    .line 372
    invoke-direct/range {v38 .. v53}, LG4/d;-><init>(Landroidx/lifecycle/k;LH4/i;LH4/g;LGf/K;LGf/K;LGf/K;LGf/K;LK4/c$a;LH4/e;Landroid/graphics/Bitmap$Config;Ljava/lang/Boolean;Ljava/lang/Boolean;LG4/b;LG4/b;LG4/b;)V

    .line 373
    .line 374
    .line 375
    iget-object v1, v0, LG4/h$a;->b:LG4/c;

    .line 376
    .line 377
    move-object/from16 v40, v1

    .line 378
    .line 379
    new-instance v1, LG4/h;

    .line 380
    .line 381
    const/16 v41, 0x0

    .line 382
    .line 383
    move-object/from16 v39, v17

    .line 384
    .line 385
    move/from16 v17, v15

    .line 386
    .line 387
    move-object/from16 v15, v39

    .line 388
    .line 389
    move-object/from16 v39, v31

    .line 390
    .line 391
    move-object/from16 v31, v16

    .line 392
    .line 393
    move-object/from16 v16, v18

    .line 394
    .line 395
    move/from16 v18, v19

    .line 396
    .line 397
    move/from16 v19, v20

    .line 398
    .line 399
    move/from16 v20, v21

    .line 400
    .line 401
    move-object/from16 v21, v22

    .line 402
    .line 403
    move-object/from16 v22, v23

    .line 404
    .line 405
    move-object/from16 v23, v24

    .line 406
    .line 407
    move-object/from16 v24, v25

    .line 408
    .line 409
    move-object/from16 v25, v26

    .line 410
    .line 411
    move-object/from16 v26, v27

    .line 412
    .line 413
    move-object/from16 v27, v28

    .line 414
    .line 415
    move-object/from16 v28, v29

    .line 416
    .line 417
    move-object/from16 v29, v30

    .line 418
    .line 419
    move-object/from16 v30, v39

    .line 420
    .line 421
    move-object/from16 v39, v38

    .line 422
    .line 423
    move-object/from16 v38, v54

    .line 424
    .line 425
    invoke-direct/range {v1 .. v41}, LG4/h;-><init>(Landroid/content/Context;Ljava/lang/Object;LI4/a;LG4/h$b;LE4/c$b;Ljava/lang/String;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;LH4/e;Lkotlin/Pair;Lx4/i$a;Ljava/util/List;LK4/c$a;Ldg/t;LG4/r;ZZZZLG4/b;LG4/b;LG4/b;LGf/K;LGf/K;LGf/K;LGf/K;Landroidx/lifecycle/k;LH4/i;LH4/g;LG4/n;LE4/c$b;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;LG4/d;LG4/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 426
    .line 427
    .line 428
    return-object v1
.end method

.method public final b(I)LG4/h$a;
    .locals 4

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    new-instance v0, LK4/a$a;

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, p1, v3, v1, v2}, LK4/a$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, LK4/c$a;->b:LK4/c$a;

    .line 13
    .line 14
    :goto_0
    invoke-virtual {p0, v0}, LG4/h$a;->q(LK4/c$a;)LG4/h$a;

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public final c(Ljava/lang/Object;)LG4/h$a;
    .locals 0

    .line 1
    iput-object p1, p0, LG4/h$a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d(LG4/c;)LG4/h$a;
    .locals 0

    .line 1
    iput-object p1, p0, LG4/h$a;->b:LG4/c;

    .line 2
    .line 3
    invoke-direct {p0}, LG4/h$a;->h()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final e(LG4/b;)LG4/h$a;
    .locals 0

    .line 1
    iput-object p1, p0, LG4/h$a;->v:LG4/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f(LG4/b;)LG4/h$a;
    .locals 0

    .line 1
    iput-object p1, p0, LG4/h$a;->u:LG4/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g(LH4/e;)LG4/h$a;
    .locals 0

    .line 1
    iput-object p1, p0, LG4/h$a;->j:LH4/e;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m(LH4/g;)LG4/h$a;
    .locals 0

    .line 1
    iput-object p1, p0, LG4/h$a;->L:LH4/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n(LH4/i;)LG4/h$a;
    .locals 0

    .line 1
    iput-object p1, p0, LG4/h$a;->K:LH4/i;

    .line 2
    .line 3
    invoke-direct {p0}, LG4/h$a;->i()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final o(LI4/a;)LG4/h$a;
    .locals 0

    .line 1
    iput-object p1, p0, LG4/h$a;->d:LI4/a;

    .line 2
    .line 3
    invoke-direct {p0}, LG4/h$a;->i()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final p(Ljava/util/List;)LG4/h$a;
    .locals 0

    .line 1
    invoke-static {p1}, LL4/c;->a(Ljava/util/List;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, LG4/h$a;->m:Ljava/util/List;

    .line 6
    .line 7
    return-object p0
.end method

.method public final q(LK4/c$a;)LG4/h$a;
    .locals 0

    .line 1
    iput-object p1, p0, LG4/h$a;->n:LK4/c$a;

    .line 2
    .line 3
    return-object p0
.end method
