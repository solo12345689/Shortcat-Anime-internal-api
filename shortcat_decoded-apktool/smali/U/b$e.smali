.class final LU/b$e;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/b;->c(Lie/a;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ls0/E1;JJJJFLandroidx/compose/ui/window/k;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/functions/Function2;

.field final synthetic b:Lkotlin/jvm/functions/Function2;

.field final synthetic c:Lkotlin/jvm/functions/Function2;

.field final synthetic d:Ls0/E1;

.field final synthetic e:J

.field final synthetic f:F

.field final synthetic g:J

.field final synthetic h:J

.field final synthetic i:J

.field final synthetic j:Lkotlin/jvm/functions/Function2;

.field final synthetic k:Lkotlin/jvm/functions/Function2;


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ls0/E1;JFJJJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/b$e;->a:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    iput-object p2, p0, LU/b$e;->b:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    iput-object p3, p0, LU/b$e;->c:Lkotlin/jvm/functions/Function2;

    .line 6
    .line 7
    iput-object p4, p0, LU/b$e;->d:Ls0/E1;

    .line 8
    .line 9
    iput-wide p5, p0, LU/b$e;->e:J

    .line 10
    .line 11
    iput p7, p0, LU/b$e;->f:F

    .line 12
    .line 13
    iput-wide p8, p0, LU/b$e;->g:J

    .line 14
    .line 15
    iput-wide p10, p0, LU/b$e;->h:J

    .line 16
    .line 17
    iput-wide p12, p0, LU/b$e;->i:J

    .line 18
    .line 19
    iput-object p14, p0, LU/b$e;->j:Lkotlin/jvm/functions/Function2;

    .line 20
    .line 21
    iput-object p15, p0, LU/b$e;->k:Lkotlin/jvm/functions/Function2;

    .line 22
    .line 23
    const/4 p1, 0x2

    .line 24
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 25
    .line 26
    .line 27
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

    invoke-virtual {p0, p1, p2}, LU/b$e;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    .line 2
    invoke-interface {v1}, LY/m;->i()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {v1}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "androidx.compose.material3.AlertDialogImpl.<anonymous> (AlertDialog.kt:252)"

    const v5, -0x6e701922

    invoke-static {v5, v2, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    new-instance v2, LU/b$e$a;

    iget-object v3, v0, LU/b$e;->j:Lkotlin/jvm/functions/Function2;

    iget-object v4, v0, LU/b$e;->k:Lkotlin/jvm/functions/Function2;

    invoke-direct {v2, v3, v4}, LU/b$e$a;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    const/16 v3, 0x36

    const v4, 0x455a457c

    const/4 v5, 0x1

    invoke-static {v4, v5, v2, v1, v3}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    move-result-object v2

    .line 6
    iget-object v3, v0, LU/b$e;->a:Lkotlin/jvm/functions/Function2;

    .line 7
    iget-object v4, v0, LU/b$e;->b:Lkotlin/jvm/functions/Function2;

    .line 8
    iget-object v5, v0, LU/b$e;->c:Lkotlin/jvm/functions/Function2;

    .line 9
    iget-object v6, v0, LU/b$e;->d:Ls0/E1;

    .line 10
    iget-wide v7, v0, LU/b$e;->e:J

    .line 11
    iget v9, v0, LU/b$e;->f:F

    .line 12
    sget-object v10, LX/d;->a:LX/d;

    invoke-virtual {v10}, LX/d;->a()LX/c;

    move-result-object v10

    const/4 v11, 0x6

    invoke-static {v10, v1, v11}, LU/m;->h(LX/c;LY/m;I)J

    move-result-wide v10

    .line 13
    iget-wide v12, v0, LU/b$e;->g:J

    .line 14
    iget-wide v14, v0, LU/b$e;->h:J

    move-object/from16 p2, v2

    .line 15
    iget-wide v1, v0, LU/b$e;->i:J

    const/16 v20, 0x0

    const/16 v21, 0x2

    move-wide/from16 v16, v1

    const/4 v2, 0x0

    const/16 v19, 0x6

    move-object/from16 v18, p1

    move-object/from16 v1, p2

    .line 16
    invoke-static/range {v1 .. v21}, LU/b;->a(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ls0/E1;JFJJJJLY/m;III)V

    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LY/w;->T()V

    :cond_3
    return-void
.end method
