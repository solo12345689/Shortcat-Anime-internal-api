.class final LU/b0$h;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/b0;->d(LU/W;Landroidx/compose/ui/e;ZLs0/E1;JJJJJLY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:LU/W;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(JLU/W;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-wide p1, p0, LU/b0$h;->a:J

    .line 2
    .line 3
    iput-object p3, p0, LU/b0$h;->b:LU/W;

    .line 4
    .line 5
    iput-object p4, p0, LU/b0$h;->c:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LU/b0$h;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 13

    move v0, p2

    and-int/lit8 v1, v0, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    .line 2
    invoke-interface {p1}, LY/m;->i()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:216)"

    const v3, -0x5227657f

    invoke-static {v3, p2, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    sget-object v0, LU/i;->a:LU/i;

    iget-wide v3, p0, LU/b0$h;->a:J

    const/16 v10, 0x6000

    const/16 v11, 0xd

    const-wide/16 v1, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    move-object v9, p1

    invoke-virtual/range {v0 .. v11}, LU/i;->r(JJJJLY/m;II)LU/h;

    move-result-object v4

    .line 6
    iget-object v0, p0, LU/b0$h;->b:LU/W;

    invoke-interface {p1, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, LU/b0$h;->b:LU/W;

    .line 7
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_3

    .line 8
    sget-object v0, LY/m;->a:LY/m$a;

    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_4

    .line 9
    :cond_3
    new-instance v2, LU/b0$h$a;

    invoke-direct {v2, v1}, LU/b0$h$a;-><init>(LU/W;)V

    .line 10
    invoke-interface {p1, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 11
    :cond_4
    move-object v0, v2

    check-cast v0, Lie/a;

    .line 12
    new-instance v1, LU/b0$h$b;

    iget-object v2, p0, LU/b0$h;->c:Ljava/lang/String;

    invoke-direct {v1, v2}, LU/b0$h$b;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x36

    const v3, 0x1f0f8424

    const/4 v5, 0x1

    invoke-static {v3, v5, v1, p1, v2}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    move-result-object v1

    const/high16 v11, 0x30000000

    const/16 v12, 0x1ee

    move-object v9, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v10, p1

    .line 13
    invoke-static/range {v0 .. v12}, LU/k;->c(Lie/a;Landroidx/compose/ui/e;ZLs0/E1;LU/h;LU/j;Lx/g;LC/A;LB/m;Lie/o;LY/m;II)V

    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LY/w;->T()V

    :cond_5
    return-void
.end method
