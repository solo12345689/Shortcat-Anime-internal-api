.class public Lr/g;
.super Landroidx/lifecycle/U;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/g$d;,
        Lr/g$b;,
        Lr/g$c;
    }
.end annotation


# instance fields
.field private a:Ljava/util/concurrent/Executor;

.field private b:Lr/f$a;

.field private c:Lr/f$d;

.field private d:Lr/f$c;

.field private e:Lr/a;

.field private f:Lr/h;

.field private g:Landroid/content/DialogInterface$OnClickListener;

.field private h:Ljava/lang/CharSequence;

.field private i:I

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Landroidx/lifecycle/A;

.field private p:Landroidx/lifecycle/A;

.field private q:Landroidx/lifecycle/A;

.field private r:Landroidx/lifecycle/A;

.field private s:Landroidx/lifecycle/A;

.field private t:Z

.field private u:Landroidx/lifecycle/A;

.field private v:I

.field private w:Landroidx/lifecycle/A;

.field private x:Landroidx/lifecycle/A;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/U;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lr/g;->i:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, p0, Lr/g;->t:Z

    .line 9
    .line 10
    iput v0, p0, Lr/g;->v:I

    .line 11
    .line 12
    return-void
.end method

.method private static Y(Landroidx/lifecycle/A;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroidx/lifecycle/A;->n(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/lifecycle/A;->l(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method A()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr/g;->n:Z

    .line 2
    .line 3
    return v0
.end method

.method B()Landroidx/lifecycle/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->s:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr/g;->s:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lr/g;->s:Landroidx/lifecycle/A;

    .line 13
    .line 14
    return-object v0
.end method

.method C()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr/g;->j:Z

    .line 2
    .line 3
    return v0
.end method

.method D(Lr/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->p:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr/g;->p:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lr/g;->p:Landroidx/lifecycle/A;

    .line 13
    .line 14
    invoke-static {v0, p1}, Lr/g;->Y(Landroidx/lifecycle/A;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method E(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->r:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr/g;->r:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lr/g;->r:Landroidx/lifecycle/A;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {v0, p1}, Lr/g;->Y(Landroidx/lifecycle/A;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method F(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->q:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr/g;->q:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lr/g;->q:Landroidx/lifecycle/A;

    .line 13
    .line 14
    invoke-static {v0, p1}, Lr/g;->Y(Landroidx/lifecycle/A;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method G(Lr/f$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->o:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr/g;->o:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lr/g;->o:Landroidx/lifecycle/A;

    .line 13
    .line 14
    invoke-static {v0, p1}, Lr/g;->Y(Landroidx/lifecycle/A;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method H(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr/g;->k:Z

    .line 2
    .line 3
    return-void
.end method

.method I(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr/g;->i:I

    .line 2
    .line 3
    return-void
.end method

.method J(Lr/f$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/g;->b:Lr/f$a;

    .line 2
    .line 3
    return-void
.end method

.method K(Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/g;->a:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    return-void
.end method

.method L(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr/g;->l:Z

    .line 2
    .line 3
    return-void
.end method

.method M(Lr/f$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/g;->d:Lr/f$c;

    .line 2
    .line 3
    return-void
.end method

.method N(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr/g;->m:Z

    .line 2
    .line 3
    return-void
.end method

.method O(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->u:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr/g;->u:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lr/g;->u:Landroidx/lifecycle/A;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {v0, p1}, Lr/g;->Y(Landroidx/lifecycle/A;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method P(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr/g;->t:Z

    .line 2
    .line 3
    return-void
.end method

.method Q(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->x:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr/g;->x:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lr/g;->x:Landroidx/lifecycle/A;

    .line 13
    .line 14
    invoke-static {v0, p1}, Lr/g;->Y(Landroidx/lifecycle/A;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method R(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr/g;->v:I

    .line 2
    .line 3
    return-void
.end method

.method S(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->w:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr/g;->w:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lr/g;->w:Landroidx/lifecycle/A;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {v0, p1}, Lr/g;->Y(Landroidx/lifecycle/A;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method T(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr/g;->n:Z

    .line 2
    .line 3
    return-void
.end method

.method U(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->s:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr/g;->s:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lr/g;->s:Landroidx/lifecycle/A;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {v0, p1}, Lr/g;->Y(Landroidx/lifecycle/A;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method V(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/g;->h:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-void
.end method

.method W(Lr/f$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/g;->c:Lr/f$d;

    .line 2
    .line 3
    return-void
.end method

.method X(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr/g;->j:Z

    .line 2
    .line 3
    return-void
.end method

.method a()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr/g;->c:Lr/f$d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lr/g;->d:Lr/f$c;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lr/b;->b(Lr/f$d;Lr/f$c;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
.end method

.method b()Lr/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lr/g;->e:Lr/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lr/a;

    .line 6
    .line 7
    new-instance v1, Lr/g$b;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lr/g$b;-><init>(Lr/g;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Lr/a;-><init>(Lr/a$d;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lr/g;->e:Lr/a;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lr/g;->e:Lr/a;

    .line 18
    .line 19
    return-object v0
.end method

.method c()Landroidx/lifecycle/A;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->p:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr/g;->p:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lr/g;->p:Landroidx/lifecycle/A;

    .line 13
    .line 14
    return-object v0
.end method

.method d()Landroidx/lifecycle/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->q:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr/g;->q:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lr/g;->q:Landroidx/lifecycle/A;

    .line 13
    .line 14
    return-object v0
.end method

.method e()Landroidx/lifecycle/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->o:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr/g;->o:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lr/g;->o:Landroidx/lifecycle/A;

    .line 13
    .line 14
    return-object v0
.end method

.method f()I
    .locals 1

    .line 1
    iget v0, p0, Lr/g;->i:I

    .line 2
    .line 3
    return v0
.end method

.method g()Lr/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->f:Lr/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lr/h;

    .line 6
    .line 7
    invoke-direct {v0}, Lr/h;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr/g;->f:Lr/h;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lr/g;->f:Lr/h;

    .line 13
    .line 14
    return-object v0
.end method

.method h()Lr/f$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->b:Lr/f$a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lr/g$a;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lr/g$a;-><init>(Lr/g;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr/g;->b:Lr/f$a;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lr/g;->b:Lr/f$a;

    .line 13
    .line 14
    return-object v0
.end method

.method i()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->a:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lr/g$c;

    .line 7
    .line 8
    invoke-direct {v0}, Lr/g$c;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method j()Lr/f$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->d:Lr/f$c;

    .line 2
    .line 3
    return-object v0
.end method

.method k()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->c:Lr/f$d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lr/f$d;->b()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method l()Landroidx/lifecycle/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->x:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr/g;->x:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lr/g;->x:Landroidx/lifecycle/A;

    .line 13
    .line 14
    return-object v0
.end method

.method m()I
    .locals 1

    .line 1
    iget v0, p0, Lr/g;->v:I

    .line 2
    .line 3
    return v0
.end method

.method n()Landroidx/lifecycle/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->w:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr/g;->w:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lr/g;->w:Landroidx/lifecycle/A;

    .line 13
    .line 14
    return-object v0
.end method

.method o()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lr/g;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lr/b;->d(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Lr/b;->c(I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, -0x1

    .line 20
    return v0
.end method

.method p()Landroid/content/DialogInterface$OnClickListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->g:Landroid/content/DialogInterface$OnClickListener;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lr/g$d;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lr/g$d;-><init>(Lr/g;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr/g;->g:Landroid/content/DialogInterface$OnClickListener;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lr/g;->g:Landroid/content/DialogInterface$OnClickListener;

    .line 13
    .line 14
    return-object v0
.end method

.method q()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->h:Ljava/lang/CharSequence;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lr/g;->c:Lr/f$d;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Lr/f$d;->c()Ljava/lang/CharSequence;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    return-object v0
.end method

.method r()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->c:Lr/f$d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lr/f$d;->d()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method s()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->c:Lr/f$d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lr/f$d;->e()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method t()Landroidx/lifecycle/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->r:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr/g;->r:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lr/g;->r:Landroidx/lifecycle/A;

    .line 13
    .line 14
    return-object v0
.end method

.method u()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr/g;->k:Z

    .line 2
    .line 3
    return v0
.end method

.method v()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->c:Lr/f$d;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lr/f$d;->f()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    return v0
.end method

.method w()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr/g;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method x()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr/g;->m:Z

    .line 2
    .line 3
    return v0
.end method

.method y()Landroidx/lifecycle/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/g;->u:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr/g;->u:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lr/g;->u:Landroidx/lifecycle/A;

    .line 13
    .line 14
    return-object v0
.end method

.method z()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr/g;->t:Z

    .line 2
    .line 3
    return v0
.end method
