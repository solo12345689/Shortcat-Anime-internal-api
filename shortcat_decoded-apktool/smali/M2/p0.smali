.class public abstract LM2/p0;
.super LM2/h;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final l:Ljava/lang/Void;


# instance fields
.field protected final k:LM2/D;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method protected constructor <init>(LM2/D;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LM2/h;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM2/p0;->k:LM2/D;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected final A(Lw2/F;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, LM2/h;->A(Lw2/F;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LM2/p0;->S()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method protected bridge synthetic E(Ljava/lang/Object;LM2/D$b;)LM2/D$b;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LM2/p0;->K(Ljava/lang/Void;LM2/D$b;)LM2/D$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method protected bridge synthetic F(Ljava/lang/Object;JLM2/D$b;)J
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, LM2/p0;->M(Ljava/lang/Void;JLM2/D$b;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method protected bridge synthetic G(Ljava/lang/Object;I)I
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LM2/p0;->O(Ljava/lang/Void;I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method protected bridge synthetic H(Ljava/lang/Object;LM2/D;Lq2/Y;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, LM2/p0;->P(Ljava/lang/Void;LM2/D;Lq2/Y;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected J(LM2/D$b;)LM2/D$b;
    .locals 0

    .line 1
    return-object p1
.end method

.method protected final K(Ljava/lang/Void;LM2/D$b;)LM2/D$b;
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, LM2/p0;->J(LM2/D$b;)LM2/D$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method protected L(JLM2/D$b;)J
    .locals 0

    .line 1
    return-wide p1
.end method

.method protected final M(Ljava/lang/Void;JLM2/D$b;)J
    .locals 0

    .line 1
    invoke-virtual {p0, p2, p3, p4}, LM2/p0;->L(JLM2/D$b;)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    return-wide p1
.end method

.method protected N(I)I
    .locals 0

    .line 1
    return p1
.end method

.method protected final O(Ljava/lang/Void;I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, LM2/p0;->N(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method protected final P(Ljava/lang/Void;LM2/D;Lq2/Y;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p3}, LM2/p0;->Q(Lq2/Y;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method protected abstract Q(Lq2/Y;)V
.end method

.method protected final R()V
    .locals 2

    .line 1
    sget-object v0, LM2/p0;->l:Ljava/lang/Void;

    .line 2
    .line 3
    iget-object v1, p0, LM2/p0;->k:LM2/D;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, LM2/h;->I(Ljava/lang/Object;LM2/D;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method protected S()V
    .locals 0

    .line 1
    invoke-virtual {p0}, LM2/p0;->R()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public a()Lq2/C;
    .locals 1

    .line 1
    iget-object v0, p0, LM2/p0;->k:LM2/D;

    .line 2
    .line 3
    invoke-interface {v0}, LM2/D;->a()Lq2/C;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public j(Lq2/C;)V
    .locals 1

    .line 1
    iget-object v0, p0, LM2/p0;->k:LM2/D;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LM2/D;->j(Lq2/C;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public n()Z
    .locals 1

    .line 1
    iget-object v0, p0, LM2/p0;->k:LM2/D;

    .line 2
    .line 3
    invoke-interface {v0}, LM2/D;->n()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public o()Lq2/Y;
    .locals 1

    .line 1
    iget-object v0, p0, LM2/p0;->k:LM2/D;

    .line 2
    .line 3
    invoke-interface {v0}, LM2/D;->o()Lq2/Y;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
