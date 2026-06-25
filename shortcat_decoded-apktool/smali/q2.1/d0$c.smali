.class public Lq2/d0$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private D:Ljava/util/HashMap;

.field private E:Ljava/util/HashSet;

.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:Z

.field private l:Z

.field private m:LP9/u;

.field private n:LP9/u;

.field private o:I

.field private p:LP9/u;

.field private q:I

.field private r:I

.field private s:I

.field private t:LP9/u;

.field private u:Lq2/d0$b;

.field private v:LP9/u;

.field private w:I

.field private x:Z

.field private y:I

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    .line 2
    iput v0, p0, Lq2/d0$c;->a:I

    .line 3
    iput v0, p0, Lq2/d0$c;->b:I

    .line 4
    iput v0, p0, Lq2/d0$c;->c:I

    .line 5
    iput v0, p0, Lq2/d0$c;->d:I

    .line 6
    iput v0, p0, Lq2/d0$c;->i:I

    .line 7
    iput v0, p0, Lq2/d0$c;->j:I

    const/4 v1, 0x1

    .line 8
    iput-boolean v1, p0, Lq2/d0$c;->k:Z

    .line 9
    iput-boolean v1, p0, Lq2/d0$c;->l:Z

    .line 10
    invoke-static {}, LP9/u;->A()LP9/u;

    move-result-object v2

    iput-object v2, p0, Lq2/d0$c;->m:LP9/u;

    .line 11
    invoke-static {}, LP9/u;->A()LP9/u;

    move-result-object v2

    iput-object v2, p0, Lq2/d0$c;->n:LP9/u;

    const/4 v2, 0x0

    .line 12
    iput v2, p0, Lq2/d0$c;->o:I

    .line 13
    invoke-static {}, LP9/u;->A()LP9/u;

    move-result-object v3

    iput-object v3, p0, Lq2/d0$c;->p:LP9/u;

    .line 14
    iput v2, p0, Lq2/d0$c;->q:I

    .line 15
    iput v0, p0, Lq2/d0$c;->r:I

    .line 16
    iput v0, p0, Lq2/d0$c;->s:I

    .line 17
    invoke-static {}, LP9/u;->A()LP9/u;

    move-result-object v0

    iput-object v0, p0, Lq2/d0$c;->t:LP9/u;

    .line 18
    sget-object v0, Lq2/d0$b;->d:Lq2/d0$b;

    iput-object v0, p0, Lq2/d0$c;->u:Lq2/d0$b;

    .line 19
    invoke-static {}, LP9/u;->A()LP9/u;

    move-result-object v0

    iput-object v0, p0, Lq2/d0$c;->v:LP9/u;

    .line 20
    iput v2, p0, Lq2/d0$c;->w:I

    .line 21
    iput-boolean v1, p0, Lq2/d0$c;->x:Z

    .line 22
    iput v2, p0, Lq2/d0$c;->y:I

    .line 23
    iput-boolean v2, p0, Lq2/d0$c;->z:Z

    .line 24
    iput-boolean v2, p0, Lq2/d0$c;->A:Z

    .line 25
    iput-boolean v2, p0, Lq2/d0$c;->B:Z

    .line 26
    iput-boolean v2, p0, Lq2/d0$c;->C:Z

    .line 27
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lq2/d0$c;->D:Ljava/util/HashMap;

    .line 28
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lq2/d0$c;->E:Ljava/util/HashSet;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Bundle;)V
    .locals 6

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    invoke-static {}, Lq2/d0;->a()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lq2/d0;->F:Lq2/d0;

    iget v2, v1, Lq2/d0;->a:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq2/d0$c;->a:I

    .line 33
    invoke-static {}, Lq2/d0;->b()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq2/d0;->b:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq2/d0$c;->b:I

    .line 34
    invoke-static {}, Lq2/d0;->m()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq2/d0;->c:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq2/d0$c;->c:I

    .line 35
    invoke-static {}, Lq2/d0;->x()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq2/d0;->d:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq2/d0$c;->d:I

    .line 36
    invoke-static {}, Lq2/d0;->C()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq2/d0;->e:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq2/d0$c;->e:I

    .line 37
    invoke-static {}, Lq2/d0;->D()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq2/d0;->f:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq2/d0$c;->f:I

    .line 38
    invoke-static {}, Lq2/d0;->E()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq2/d0;->g:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq2/d0$c;->g:I

    .line 39
    invoke-static {}, Lq2/d0;->F()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq2/d0;->h:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq2/d0$c;->h:I

    .line 40
    invoke-static {}, Lq2/d0;->G()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq2/d0;->i:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq2/d0$c;->i:I

    .line 41
    invoke-static {}, Lq2/d0;->H()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq2/d0;->j:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq2/d0$c;->j:I

    .line 42
    iget v2, p0, Lq2/d0$c;->i:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    const v5, 0x7fffffff

    if-ne v2, v5, :cond_0

    if-ne v0, v5, :cond_0

    .line 43
    invoke-static {}, Lq2/d0;->c()Ljava/lang/String;

    move-result-object v0

    iget-boolean v2, v1, Lq2/d0;->k:Z

    .line 44
    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v4

    :goto_0
    iput-boolean v0, p0, Lq2/d0$c;->k:Z

    .line 45
    invoke-static {}, Lq2/d0;->d()Ljava/lang/String;

    move-result-object v0

    iget-boolean v2, v1, Lq2/d0;->l:Z

    .line 46
    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lq2/d0$c;->l:Z

    .line 47
    invoke-static {}, Lq2/d0;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v2, v4, [Ljava/lang/String;

    invoke-static {v0, v2}, LO9/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 48
    invoke-static {v0}, LP9/u;->x([Ljava/lang/Object;)LP9/u;

    move-result-object v0

    iput-object v0, p0, Lq2/d0$c;->m:LP9/u;

    .line 49
    invoke-static {}, Lq2/d0;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v2, v4, [Ljava/lang/String;

    invoke-static {v0, v2}, LO9/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 50
    invoke-static {v0}, LP9/u;->x([Ljava/lang/Object;)LP9/u;

    move-result-object v0

    iput-object v0, p0, Lq2/d0$c;->n:LP9/u;

    .line 51
    invoke-static {}, Lq2/d0;->g()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq2/d0;->o:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq2/d0$c;->o:I

    .line 52
    invoke-static {}, Lq2/d0;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v2, v4, [Ljava/lang/String;

    invoke-static {v0, v2}, LO9/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 53
    invoke-static {v0}, Lq2/d0$c;->L([Ljava/lang/String;)LP9/u;

    move-result-object v0

    iput-object v0, p0, Lq2/d0$c;->p:LP9/u;

    .line 54
    invoke-static {}, Lq2/d0;->i()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq2/d0;->q:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq2/d0$c;->q:I

    .line 55
    invoke-static {}, Lq2/d0;->j()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq2/d0;->r:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq2/d0$c;->r:I

    .line 56
    invoke-static {}, Lq2/d0;->k()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq2/d0;->s:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq2/d0$c;->s:I

    .line 57
    invoke-static {}, Lq2/d0;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v2, v4, [Ljava/lang/String;

    invoke-static {v0, v2}, LO9/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 58
    invoke-static {v0}, LP9/u;->x([Ljava/lang/Object;)LP9/u;

    move-result-object v0

    iput-object v0, p0, Lq2/d0$c;->t:LP9/u;

    .line 59
    invoke-static {p1}, Lq2/d0$c;->J(Landroid/os/Bundle;)Lq2/d0$b;

    move-result-object v0

    iput-object v0, p0, Lq2/d0$c;->u:Lq2/d0$b;

    .line 60
    invoke-static {}, Lq2/d0;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v2, v4, [Ljava/lang/String;

    invoke-static {v0, v2}, LO9/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 61
    invoke-static {v0}, Lq2/d0$c;->L([Ljava/lang/String;)LP9/u;

    move-result-object v0

    iput-object v0, p0, Lq2/d0$c;->v:LP9/u;

    .line 62
    invoke-static {}, Lq2/d0;->o()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq2/d0;->w:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq2/d0$c;->w:I

    .line 63
    iget-object v0, p0, Lq2/d0$c;->v:LP9/u;

    .line 64
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lq2/d0$c;->w:I

    if-nez v0, :cond_1

    .line 65
    invoke-static {}, Lq2/d0;->p()Ljava/lang/String;

    move-result-object v0

    iget-boolean v2, v1, Lq2/d0;->x:Z

    .line 66
    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    iput-boolean v3, p0, Lq2/d0$c;->x:Z

    .line 67
    invoke-static {}, Lq2/d0;->q()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq2/d0;->y:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq2/d0$c;->y:I

    .line 68
    invoke-static {}, Lq2/d0;->r()Ljava/lang/String;

    move-result-object v0

    iget-boolean v2, v1, Lq2/d0;->z:Z

    .line 69
    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lq2/d0$c;->z:Z

    .line 70
    invoke-static {}, Lq2/d0;->s()Ljava/lang/String;

    move-result-object v0

    iget-boolean v2, v1, Lq2/d0;->A:Z

    .line 71
    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lq2/d0$c;->A:Z

    .line 72
    invoke-static {}, Lq2/d0;->t()Ljava/lang/String;

    move-result-object v0

    iget-boolean v2, v1, Lq2/d0;->B:Z

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lq2/d0$c;->B:Z

    .line 73
    invoke-static {}, Lq2/d0;->u()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, v1, Lq2/d0;->C:Z

    .line 74
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lq2/d0$c;->C:Z

    .line 75
    invoke-static {}, Lq2/d0;->v()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_2

    .line 76
    invoke-static {}, LP9/u;->A()LP9/u;

    move-result-object v0

    goto :goto_2

    .line 77
    :cond_2
    new-instance v1, Lq2/e0;

    invoke-direct {v1}, Lq2/e0;-><init>()V

    invoke-static {v1, v0}, Lt2/i;->d(LO9/f;Ljava/util/List;)LP9/u;

    move-result-object v0

    .line 78
    :goto_2
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lq2/d0$c;->D:Ljava/util/HashMap;

    move v1, v4

    .line 79
    :goto_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 80
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq2/b0;

    .line 81
    iget-object v3, p0, Lq2/d0$c;->D:Ljava/util/HashMap;

    iget-object v5, v2, Lq2/b0;->a:Lq2/a0;

    invoke-virtual {v3, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 82
    :cond_3
    invoke-static {}, Lq2/d0;->w()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object p1

    new-array v0, v4, [I

    invoke-static {p1, v0}, LO9/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    .line 83
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lq2/d0$c;->E:Ljava/util/HashSet;

    .line 84
    array-length v0, p1

    :goto_4
    if-ge v4, v0, :cond_4

    aget v1, p1, v4

    .line 85
    iget-object v2, p0, Lq2/d0$c;->E:Ljava/util/HashSet;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_4
    return-void
.end method

.method protected constructor <init>(Lq2/d0;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-direct {p0, p1}, Lq2/d0$c;->K(Lq2/d0;)V

    return-void
.end method

.method static synthetic A(Lq2/d0$c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lq2/d0$c;->A:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic B(Lq2/d0$c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lq2/d0$c;->B:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic C(Lq2/d0$c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lq2/d0$c;->C:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic D(Lq2/d0$c;)Ljava/util/HashMap;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/d0$c;->D:Ljava/util/HashMap;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic E(Lq2/d0$c;)Ljava/util/HashSet;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/d0$c;->E:Ljava/util/HashSet;

    .line 2
    .line 3
    return-object p0
.end method

.method private static J(Landroid/os/Bundle;)Lq2/d0$b;
    .locals 4

    .line 1
    invoke-static {}, Lq2/d0;->y()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Lq2/d0$b;->a(Landroid/os/Bundle;)Lq2/d0$b;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance v0, Lq2/d0$b$a;

    .line 17
    .line 18
    invoke-direct {v0}, Lq2/d0$b$a;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lq2/d0;->B()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    sget-object v2, Lq2/d0$b;->d:Lq2/d0$b;

    .line 26
    .line 27
    iget v3, v2, Lq2/d0$b;->a:I

    .line 28
    .line 29
    invoke-virtual {p0, v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {v0, v1}, Lq2/d0$b$a;->e(I)Lq2/d0$b$a;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {}, Lq2/d0;->A()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-boolean v3, v2, Lq2/d0$b;->b:Z

    .line 42
    .line 43
    invoke-virtual {p0, v1, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {v0, v1}, Lq2/d0$b$a;->f(Z)Lq2/d0$b$a;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {}, Lq2/d0;->z()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-boolean v2, v2, Lq2/d0$b;->c:Z

    .line 56
    .line 57
    invoke-virtual {p0, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    invoke-virtual {v0, p0}, Lq2/d0$b$a;->g(Z)Lq2/d0$b$a;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p0}, Lq2/d0$b$a;->d()Lq2/d0$b;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method

.method private K(Lq2/d0;)V
    .locals 2

    .line 1
    iget v0, p1, Lq2/d0;->a:I

    .line 2
    .line 3
    iput v0, p0, Lq2/d0$c;->a:I

    .line 4
    .line 5
    iget v0, p1, Lq2/d0;->b:I

    .line 6
    .line 7
    iput v0, p0, Lq2/d0$c;->b:I

    .line 8
    .line 9
    iget v0, p1, Lq2/d0;->c:I

    .line 10
    .line 11
    iput v0, p0, Lq2/d0$c;->c:I

    .line 12
    .line 13
    iget v0, p1, Lq2/d0;->d:I

    .line 14
    .line 15
    iput v0, p0, Lq2/d0$c;->d:I

    .line 16
    .line 17
    iget v0, p1, Lq2/d0;->e:I

    .line 18
    .line 19
    iput v0, p0, Lq2/d0$c;->e:I

    .line 20
    .line 21
    iget v0, p1, Lq2/d0;->f:I

    .line 22
    .line 23
    iput v0, p0, Lq2/d0$c;->f:I

    .line 24
    .line 25
    iget v0, p1, Lq2/d0;->g:I

    .line 26
    .line 27
    iput v0, p0, Lq2/d0$c;->g:I

    .line 28
    .line 29
    iget v0, p1, Lq2/d0;->h:I

    .line 30
    .line 31
    iput v0, p0, Lq2/d0$c;->h:I

    .line 32
    .line 33
    iget v0, p1, Lq2/d0;->i:I

    .line 34
    .line 35
    iput v0, p0, Lq2/d0$c;->i:I

    .line 36
    .line 37
    iget v0, p1, Lq2/d0;->j:I

    .line 38
    .line 39
    iput v0, p0, Lq2/d0$c;->j:I

    .line 40
    .line 41
    iget-boolean v0, p1, Lq2/d0;->k:Z

    .line 42
    .line 43
    iput-boolean v0, p0, Lq2/d0$c;->k:Z

    .line 44
    .line 45
    iget-boolean v0, p1, Lq2/d0;->l:Z

    .line 46
    .line 47
    iput-boolean v0, p0, Lq2/d0$c;->l:Z

    .line 48
    .line 49
    iget-object v0, p1, Lq2/d0;->m:LP9/u;

    .line 50
    .line 51
    iput-object v0, p0, Lq2/d0$c;->m:LP9/u;

    .line 52
    .line 53
    iget-object v0, p1, Lq2/d0;->n:LP9/u;

    .line 54
    .line 55
    iput-object v0, p0, Lq2/d0$c;->n:LP9/u;

    .line 56
    .line 57
    iget v0, p1, Lq2/d0;->o:I

    .line 58
    .line 59
    iput v0, p0, Lq2/d0$c;->o:I

    .line 60
    .line 61
    iget-object v0, p1, Lq2/d0;->p:LP9/u;

    .line 62
    .line 63
    iput-object v0, p0, Lq2/d0$c;->p:LP9/u;

    .line 64
    .line 65
    iget v0, p1, Lq2/d0;->q:I

    .line 66
    .line 67
    iput v0, p0, Lq2/d0$c;->q:I

    .line 68
    .line 69
    iget v0, p1, Lq2/d0;->r:I

    .line 70
    .line 71
    iput v0, p0, Lq2/d0$c;->r:I

    .line 72
    .line 73
    iget v0, p1, Lq2/d0;->s:I

    .line 74
    .line 75
    iput v0, p0, Lq2/d0$c;->s:I

    .line 76
    .line 77
    iget-object v0, p1, Lq2/d0;->t:LP9/u;

    .line 78
    .line 79
    iput-object v0, p0, Lq2/d0$c;->t:LP9/u;

    .line 80
    .line 81
    iget-object v0, p1, Lq2/d0;->u:Lq2/d0$b;

    .line 82
    .line 83
    iput-object v0, p0, Lq2/d0$c;->u:Lq2/d0$b;

    .line 84
    .line 85
    iget-object v0, p1, Lq2/d0;->v:LP9/u;

    .line 86
    .line 87
    iput-object v0, p0, Lq2/d0$c;->v:LP9/u;

    .line 88
    .line 89
    iget v0, p1, Lq2/d0;->w:I

    .line 90
    .line 91
    iput v0, p0, Lq2/d0$c;->w:I

    .line 92
    .line 93
    iget-boolean v0, p1, Lq2/d0;->x:Z

    .line 94
    .line 95
    iput-boolean v0, p0, Lq2/d0$c;->x:Z

    .line 96
    .line 97
    iget v0, p1, Lq2/d0;->y:I

    .line 98
    .line 99
    iput v0, p0, Lq2/d0$c;->y:I

    .line 100
    .line 101
    iget-boolean v0, p1, Lq2/d0;->z:Z

    .line 102
    .line 103
    iput-boolean v0, p0, Lq2/d0$c;->z:Z

    .line 104
    .line 105
    iget-boolean v0, p1, Lq2/d0;->A:Z

    .line 106
    .line 107
    iput-boolean v0, p0, Lq2/d0$c;->A:Z

    .line 108
    .line 109
    iget-boolean v0, p1, Lq2/d0;->B:Z

    .line 110
    .line 111
    iput-boolean v0, p0, Lq2/d0$c;->B:Z

    .line 112
    .line 113
    iget-boolean v0, p1, Lq2/d0;->C:Z

    .line 114
    .line 115
    iput-boolean v0, p0, Lq2/d0$c;->C:Z

    .line 116
    .line 117
    new-instance v0, Ljava/util/HashSet;

    .line 118
    .line 119
    iget-object v1, p1, Lq2/d0;->E:LP9/w;

    .line 120
    .line 121
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 122
    .line 123
    .line 124
    iput-object v0, p0, Lq2/d0$c;->E:Ljava/util/HashSet;

    .line 125
    .line 126
    new-instance v0, Ljava/util/HashMap;

    .line 127
    .line 128
    iget-object p1, p1, Lq2/d0;->D:LP9/v;

    .line 129
    .line 130
    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 131
    .line 132
    .line 133
    iput-object v0, p0, Lq2/d0$c;->D:Ljava/util/HashMap;

    .line 134
    .line 135
    return-void
.end method

.method private static L([Ljava/lang/String;)LP9/u;
    .locals 4

    .line 1
    invoke-static {}, LP9/u;->t()LP9/u$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, [Ljava/lang/String;

    .line 10
    .line 11
    array-length v1, p0

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v1, :cond_0

    .line 14
    .line 15
    aget-object v3, p0, v2

    .line 16
    .line 17
    invoke-static {v3}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v3}, Lt2/a0;->Y0(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v0, v3}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    .line 28
    .line 29
    .line 30
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v0}, LP9/u$a;->k()LP9/u;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method static synthetic a(Lq2/d0$c;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/d0$c;->a:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic b(Lq2/d0$c;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/d0$c;->b:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic c(Lq2/d0$c;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/d0$c;->c:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic d(Lq2/d0$c;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/d0$c;->d:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic e(Lq2/d0$c;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/d0$c;->e:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic f(Lq2/d0$c;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/d0$c;->f:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic g(Lq2/d0$c;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/d0$c;->g:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic h(Lq2/d0$c;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/d0$c;->h:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic i(Lq2/d0$c;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/d0$c;->i:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic j(Lq2/d0$c;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/d0$c;->j:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic k(Lq2/d0$c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lq2/d0$c;->k:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic l(Lq2/d0$c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lq2/d0$c;->l:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic m(Lq2/d0$c;)LP9/u;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/d0$c;->m:LP9/u;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic n(Lq2/d0$c;)LP9/u;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/d0$c;->n:LP9/u;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic o(Lq2/d0$c;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/d0$c;->o:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic p(Lq2/d0$c;)LP9/u;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/d0$c;->p:LP9/u;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic q(Lq2/d0$c;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/d0$c;->q:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic r(Lq2/d0$c;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/d0$c;->r:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic s(Lq2/d0$c;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/d0$c;->s:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic t(Lq2/d0$c;)LP9/u;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/d0$c;->t:LP9/u;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic u(Lq2/d0$c;)Lq2/d0$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/d0$c;->u:Lq2/d0$b;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic v(Lq2/d0$c;)LP9/u;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/d0$c;->v:LP9/u;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic w(Lq2/d0$c;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/d0$c;->w:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic x(Lq2/d0$c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lq2/d0$c;->x:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic y(Lq2/d0$c;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/d0$c;->y:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic z(Lq2/d0$c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lq2/d0$c;->z:Z

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public F(Lq2/b0;)Lq2/d0$c;
    .locals 2

    .line 1
    iget-object v0, p0, Lq2/d0$c;->D:Ljava/util/HashMap;

    .line 2
    .line 3
    iget-object v1, p1, Lq2/b0;->a:Lq2/a0;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public G()Lq2/d0;
    .locals 1

    .line 1
    new-instance v0, Lq2/d0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lq2/d0;-><init>(Lq2/d0$c;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public H()Lq2/d0$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lq2/d0$c;->D:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public I(I)Lq2/d0$c;
    .locals 2

    .line 1
    iget-object v0, p0, Lq2/d0$c;->D:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lq2/b0;

    .line 22
    .line 23
    invoke-virtual {v1}, Lq2/b0;->b()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-ne v1, p1, :cond_0

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-object p0
.end method

.method protected M(Lq2/d0;)Lq2/d0$c;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lq2/d0$c;->K(Lq2/d0;)V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public N(Ljava/util/Set;)Lq2/d0$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lq2/d0$c;->E:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq2/d0$c;->E:Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public O(Z)Lq2/d0$c;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lq2/d0$c;->B:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public P(I)Lq2/d0$c;
    .locals 0

    .line 1
    iput p1, p0, Lq2/d0$c;->y:I

    .line 2
    .line 3
    return-object p0
.end method

.method public Q(II)Lq2/d0$c;
    .locals 0

    .line 1
    iput p1, p0, Lq2/d0$c;->a:I

    .line 2
    .line 3
    iput p2, p0, Lq2/d0$c;->b:I

    .line 4
    .line 5
    return-object p0
.end method

.method public R(Lq2/b0;)Lq2/d0$c;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lq2/b0;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Lq2/d0$c;->I(I)Lq2/d0$c;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lq2/d0$c;->D:Ljava/util/HashMap;

    .line 9
    .line 10
    iget-object v1, p1, Lq2/b0;->a:Lq2/a0;

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public S(Ljava/lang/String;)Lq2/d0$c;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    new-array p1, p1, [Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lq2/d0$c;->T([Ljava/lang/String;)Lq2/d0$c;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :cond_0
    filled-new-array {p1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Lq2/d0$c;->T([Ljava/lang/String;)Lq2/d0$c;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method public varargs T([Ljava/lang/String;)Lq2/d0$c;
    .locals 0

    .line 1
    invoke-static {p1}, Lq2/d0$c;->L([Ljava/lang/String;)LP9/u;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lq2/d0$c;->v:LP9/u;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Lq2/d0$c;->x:Z

    .line 9
    .line 10
    return-object p0
.end method

.method public U(I)Lq2/d0$c;
    .locals 0

    .line 1
    iput p1, p0, Lq2/d0$c;->w:I

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lq2/d0$c;->x:Z

    .line 5
    .line 6
    return-object p0
.end method

.method public V(IZ)Lq2/d0$c;
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, Lq2/d0$c;->E:Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    iget-object p2, p0, Lq2/d0$c;->E:Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-object p0
.end method
