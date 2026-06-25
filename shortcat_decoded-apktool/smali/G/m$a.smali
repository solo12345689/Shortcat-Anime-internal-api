.class final LG/m$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG/m;->a(LG/C;Landroidx/compose/ui/e;LC/A;LG/g;IFLl0/e$c;Lz/B;ZZLkotlin/jvm/functions/Function1;LD0/a;LA/k;Lie/p;LY/m;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LG/C;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:LC/A;

.field final synthetic d:LG/g;

.field final synthetic e:I

.field final synthetic f:F

.field final synthetic g:Ll0/e$c;

.field final synthetic h:Lz/B;

.field final synthetic i:Z

.field final synthetic j:Z

.field final synthetic k:Lkotlin/jvm/functions/Function1;

.field final synthetic l:LD0/a;

.field final synthetic m:LA/k;

.field final synthetic n:Lie/p;

.field final synthetic o:I

.field final synthetic p:I

.field final synthetic q:I


# direct methods
.method constructor <init>(LG/C;Landroidx/compose/ui/e;LC/A;LG/g;IFLl0/e$c;Lz/B;ZZLkotlin/jvm/functions/Function1;LD0/a;LA/k;Lie/p;III)V
    .locals 0

    .line 1
    iput-object p1, p0, LG/m$a;->a:LG/C;

    .line 2
    .line 3
    iput-object p2, p0, LG/m$a;->b:Landroidx/compose/ui/e;

    .line 4
    .line 5
    iput-object p3, p0, LG/m$a;->c:LC/A;

    .line 6
    .line 7
    iput-object p4, p0, LG/m$a;->d:LG/g;

    .line 8
    .line 9
    iput p5, p0, LG/m$a;->e:I

    .line 10
    .line 11
    iput p6, p0, LG/m$a;->f:F

    .line 12
    .line 13
    iput-object p7, p0, LG/m$a;->g:Ll0/e$c;

    .line 14
    .line 15
    iput-object p8, p0, LG/m$a;->h:Lz/B;

    .line 16
    .line 17
    iput-boolean p9, p0, LG/m$a;->i:Z

    .line 18
    .line 19
    iput-boolean p10, p0, LG/m$a;->j:Z

    .line 20
    .line 21
    iput-object p11, p0, LG/m$a;->k:Lkotlin/jvm/functions/Function1;

    .line 22
    .line 23
    iput-object p12, p0, LG/m$a;->l:LD0/a;

    .line 24
    .line 25
    iput-object p13, p0, LG/m$a;->m:LA/k;

    .line 26
    .line 27
    iput-object p14, p0, LG/m$a;->n:Lie/p;

    .line 28
    .line 29
    iput p15, p0, LG/m$a;->o:I

    .line 30
    .line 31
    move/from16 p1, p16

    .line 32
    .line 33
    iput p1, p0, LG/m$a;->p:I

    .line 34
    .line 35
    move/from16 p1, p17

    .line 36
    .line 37
    iput p1, p0, LG/m$a;->q:I

    .line 38
    .line 39
    const/4 p1, 0x2

    .line 40
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 41
    .line 42
    .line 43
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

    invoke-virtual {p0, p1, p2}, LG/m$a;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 19

    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, LG/m$a;->a:LG/C;

    iget-object v2, v0, LG/m$a;->b:Landroidx/compose/ui/e;

    iget-object v3, v0, LG/m$a;->c:LC/A;

    iget-object v4, v0, LG/m$a;->d:LG/g;

    iget v5, v0, LG/m$a;->e:I

    iget v6, v0, LG/m$a;->f:F

    iget-object v7, v0, LG/m$a;->g:Ll0/e$c;

    iget-object v8, v0, LG/m$a;->h:Lz/B;

    iget-boolean v9, v0, LG/m$a;->i:Z

    iget-boolean v10, v0, LG/m$a;->j:Z

    iget-object v11, v0, LG/m$a;->k:Lkotlin/jvm/functions/Function1;

    iget-object v12, v0, LG/m$a;->l:LD0/a;

    iget-object v13, v0, LG/m$a;->m:LA/k;

    iget-object v14, v0, LG/m$a;->n:Lie/p;

    iget v15, v0, LG/m$a;->o:I

    or-int/lit8 v15, v15, 0x1

    invoke-static {v15}, LY/g1;->a(I)I

    move-result v16

    iget v15, v0, LG/m$a;->p:I

    invoke-static {v15}, LY/g1;->a(I)I

    move-result v17

    iget v15, v0, LG/m$a;->q:I

    move/from16 v18, v15

    move-object/from16 v15, p1

    invoke-static/range {v1 .. v18}, LG/m;->a(LG/C;Landroidx/compose/ui/e;LC/A;LG/g;IFLl0/e$c;Lz/B;ZZLkotlin/jvm/functions/Function1;LD0/a;LA/k;Lie/p;LY/m;III)V

    return-void
.end method
