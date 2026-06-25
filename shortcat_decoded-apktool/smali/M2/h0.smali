.class public final LM2/h0;
.super LM2/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM2/h0$b;
    }
.end annotation


# instance fields
.field private final h:Lw2/o;

.field private final i:Lw2/g$a;

.field private final j:Lq2/x;

.field private final k:J

.field private final l:LQ2/k;

.field private final m:Z

.field private final n:Lq2/Y;

.field private final o:Lq2/C;

.field private final p:LO9/t;

.field private q:Lw2/F;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lq2/C$k;Lw2/g$a;JLQ2/k;ZLjava/lang/Object;LO9/t;)V
    .locals 8

    .line 2
    invoke-direct {p0}, LM2/a;-><init>()V

    .line 3
    iput-object p3, p0, LM2/h0;->i:Lw2/g$a;

    .line 4
    iput-wide p4, p0, LM2/h0;->k:J

    .line 5
    iput-object p6, p0, LM2/h0;->l:LQ2/k;

    .line 6
    iput-boolean p7, p0, LM2/h0;->m:Z

    .line 7
    new-instance p3, Lq2/C$c;

    invoke-direct {p3}, Lq2/C$c;-><init>()V

    sget-object p6, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 8
    invoke-virtual {p3, p6}, Lq2/C$c;->j(Landroid/net/Uri;)Lq2/C$c;

    move-result-object p3

    iget-object p6, p2, Lq2/C$k;->a:Landroid/net/Uri;

    .line 9
    invoke-virtual {p6}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p6

    invoke-virtual {p3, p6}, Lq2/C$c;->d(Ljava/lang/String;)Lq2/C$c;

    move-result-object p3

    .line 10
    invoke-static {p2}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    move-result-object p6

    invoke-virtual {p3, p6}, Lq2/C$c;->h(Ljava/util/List;)Lq2/C$c;

    move-result-object p3

    move-object/from16 p6, p8

    .line 11
    invoke-virtual {p3, p6}, Lq2/C$c;->i(Ljava/lang/Object;)Lq2/C$c;

    move-result-object p3

    .line 12
    invoke-virtual {p3}, Lq2/C$c;->a()Lq2/C;

    move-result-object v7

    iput-object v7, p0, LM2/h0;->o:Lq2/C;

    .line 13
    new-instance p3, Lq2/x$b;

    invoke-direct {p3}, Lq2/x$b;-><init>()V

    iget-object p6, p2, Lq2/C$k;->b:Ljava/lang/String;

    const-string p7, "text/x-unknown"

    .line 14
    invoke-static {p6, p7}, LO9/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Ljava/lang/String;

    invoke-virtual {p3, p6}, Lq2/x$b;->y0(Ljava/lang/String;)Lq2/x$b;

    move-result-object p3

    iget-object p6, p2, Lq2/C$k;->c:Ljava/lang/String;

    .line 15
    invoke-virtual {p3, p6}, Lq2/x$b;->n0(Ljava/lang/String;)Lq2/x$b;

    move-result-object p3

    iget p6, p2, Lq2/C$k;->d:I

    .line 16
    invoke-virtual {p3, p6}, Lq2/x$b;->A0(I)Lq2/x$b;

    move-result-object p3

    iget p6, p2, Lq2/C$k;->e:I

    .line 17
    invoke-virtual {p3, p6}, Lq2/x$b;->w0(I)Lq2/x$b;

    move-result-object p3

    iget-object p6, p2, Lq2/C$k;->f:Ljava/lang/String;

    .line 18
    invoke-virtual {p3, p6}, Lq2/x$b;->l0(Ljava/lang/String;)Lq2/x$b;

    move-result-object p3

    .line 19
    iget-object p6, p2, Lq2/C$k;->g:Ljava/lang/String;

    if-eqz p6, :cond_0

    move-object p1, p6

    :cond_0
    invoke-virtual {p3, p1}, Lq2/x$b;->j0(Ljava/lang/String;)Lq2/x$b;

    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lq2/x$b;->P()Lq2/x;

    move-result-object p1

    iput-object p1, p0, LM2/h0;->j:Lq2/x;

    .line 21
    new-instance p1, Lw2/o$b;

    invoke-direct {p1}, Lw2/o$b;-><init>()V

    iget-object p2, p2, Lq2/C$k;->a:Landroid/net/Uri;

    .line 22
    invoke-virtual {p1, p2}, Lw2/o$b;->i(Landroid/net/Uri;)Lw2/o$b;

    move-result-object p1

    const/4 p2, 0x1

    .line 23
    invoke-virtual {p1, p2}, Lw2/o$b;->b(I)Lw2/o$b;

    move-result-object p1

    .line 24
    invoke-virtual {p1}, Lw2/o$b;->a()Lw2/o;

    move-result-object p1

    iput-object p1, p0, LM2/h0;->h:Lw2/o;

    .line 25
    new-instance v0, LM2/f0;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-wide v1, p4

    invoke-direct/range {v0 .. v7}, LM2/f0;-><init>(JZZZLjava/lang/Object;Lq2/C;)V

    iput-object v0, p0, LM2/h0;->n:Lq2/Y;

    move-object/from16 p1, p9

    .line 26
    iput-object p1, p0, LM2/h0;->p:LO9/t;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lq2/C$k;Lw2/g$a;JLQ2/k;ZLjava/lang/Object;LO9/t;LM2/h0$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p9}, LM2/h0;-><init>(Ljava/lang/String;Lq2/C$k;Lw2/g$a;JLQ2/k;ZLjava/lang/Object;LO9/t;)V

    return-void
.end method


# virtual methods
.method protected A(Lw2/F;)V
    .locals 0

    .line 1
    iput-object p1, p0, LM2/h0;->q:Lw2/F;

    .line 2
    .line 3
    iget-object p1, p0, LM2/h0;->n:Lq2/Y;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, LM2/a;->B(Lq2/Y;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method protected C()V
    .locals 0

    .line 1
    return-void
.end method

.method public a()Lq2/C;
    .locals 1

    .line 1
    iget-object v0, p0, LM2/h0;->o:Lq2/C;

    .line 2
    .line 3
    return-object v0
.end method

.method public f(LM2/D$b;LQ2/b;J)LM2/C;
    .locals 11

    .line 1
    new-instance v0, LM2/g0;

    .line 2
    .line 3
    iget-object v1, p0, LM2/h0;->h:Lw2/o;

    .line 4
    .line 5
    iget-object v2, p0, LM2/h0;->i:Lw2/g$a;

    .line 6
    .line 7
    iget-object v3, p0, LM2/h0;->q:Lw2/F;

    .line 8
    .line 9
    iget-object v4, p0, LM2/h0;->j:Lq2/x;

    .line 10
    .line 11
    iget-wide v5, p0, LM2/h0;->k:J

    .line 12
    .line 13
    iget-object v7, p0, LM2/h0;->l:LQ2/k;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, LM2/a;->v(LM2/D$b;)LM2/L$a;

    .line 16
    .line 17
    .line 18
    move-result-object v8

    .line 19
    iget-boolean v9, p0, LM2/h0;->m:Z

    .line 20
    .line 21
    iget-object p1, p0, LM2/h0;->p:LO9/t;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, LO9/t;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, LR2/a;

    .line 30
    .line 31
    :goto_0
    move-object v10, p1

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    goto :goto_0

    .line 35
    :goto_1
    invoke-direct/range {v0 .. v10}, LM2/g0;-><init>(Lw2/o;Lw2/g$a;Lw2/F;Lq2/x;JLQ2/k;LM2/L$a;ZLR2/a;)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public l()V
    .locals 0

    .line 1
    return-void
.end method

.method public m(LM2/C;)V
    .locals 0

    .line 1
    check-cast p1, LM2/g0;

    .line 2
    .line 3
    invoke-virtual {p1}, LM2/g0;->w()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
