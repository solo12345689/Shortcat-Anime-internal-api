.class final LG/c$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG/c;->a(Landroidx/compose/ui/e;LG/C;LC/A;ZLz/q;Lz/B;ZIFLG/g;LD0/a;Lkotlin/jvm/functions/Function1;Ll0/e$b;Ll0/e$c;LA/k;Lie/p;LY/m;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:LG/C;

.field final synthetic c:LC/A;

.field final synthetic d:Z

.field final synthetic e:Lz/q;

.field final synthetic f:Lz/B;

.field final synthetic g:Z

.field final synthetic h:I

.field final synthetic i:F

.field final synthetic j:LG/g;

.field final synthetic k:LD0/a;

.field final synthetic l:Lkotlin/jvm/functions/Function1;

.field final synthetic m:Ll0/e$b;

.field final synthetic n:Ll0/e$c;

.field final synthetic o:LA/k;

.field final synthetic p:Lie/p;

.field final synthetic q:I

.field final synthetic r:I

.field final synthetic s:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;LG/C;LC/A;ZLz/q;Lz/B;ZIFLG/g;LD0/a;Lkotlin/jvm/functions/Function1;Ll0/e$b;Ll0/e$c;LA/k;Lie/p;III)V
    .locals 0

    .line 1
    iput-object p1, p0, LG/c$a;->a:Landroidx/compose/ui/e;

    .line 2
    .line 3
    iput-object p2, p0, LG/c$a;->b:LG/C;

    .line 4
    .line 5
    iput-object p3, p0, LG/c$a;->c:LC/A;

    .line 6
    .line 7
    iput-boolean p4, p0, LG/c$a;->d:Z

    .line 8
    .line 9
    iput-object p5, p0, LG/c$a;->e:Lz/q;

    .line 10
    .line 11
    iput-object p6, p0, LG/c$a;->f:Lz/B;

    .line 12
    .line 13
    iput-boolean p7, p0, LG/c$a;->g:Z

    .line 14
    .line 15
    iput p8, p0, LG/c$a;->h:I

    .line 16
    .line 17
    iput p9, p0, LG/c$a;->i:F

    .line 18
    .line 19
    iput-object p10, p0, LG/c$a;->j:LG/g;

    .line 20
    .line 21
    iput-object p11, p0, LG/c$a;->k:LD0/a;

    .line 22
    .line 23
    iput-object p12, p0, LG/c$a;->l:Lkotlin/jvm/functions/Function1;

    .line 24
    .line 25
    iput-object p13, p0, LG/c$a;->m:Ll0/e$b;

    .line 26
    .line 27
    iput-object p14, p0, LG/c$a;->n:Ll0/e$c;

    .line 28
    .line 29
    iput-object p15, p0, LG/c$a;->o:LA/k;

    .line 30
    .line 31
    move-object/from16 p1, p16

    .line 32
    .line 33
    iput-object p1, p0, LG/c$a;->p:Lie/p;

    .line 34
    .line 35
    move/from16 p1, p17

    .line 36
    .line 37
    iput p1, p0, LG/c$a;->q:I

    .line 38
    .line 39
    move/from16 p1, p18

    .line 40
    .line 41
    iput p1, p0, LG/c$a;->r:I

    .line 42
    .line 43
    move/from16 p1, p19

    .line 44
    .line 45
    iput p1, p0, LG/c$a;->s:I

    .line 46
    .line 47
    const/4 p1, 0x2

    .line 48
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 49
    .line 50
    .line 51
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

    invoke-virtual {p0, p1, p2}, LG/c$a;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 21

    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, LG/c$a;->a:Landroidx/compose/ui/e;

    iget-object v2, v0, LG/c$a;->b:LG/C;

    iget-object v3, v0, LG/c$a;->c:LC/A;

    iget-boolean v4, v0, LG/c$a;->d:Z

    iget-object v5, v0, LG/c$a;->e:Lz/q;

    iget-object v6, v0, LG/c$a;->f:Lz/B;

    iget-boolean v7, v0, LG/c$a;->g:Z

    iget v8, v0, LG/c$a;->h:I

    iget v9, v0, LG/c$a;->i:F

    iget-object v10, v0, LG/c$a;->j:LG/g;

    iget-object v11, v0, LG/c$a;->k:LD0/a;

    iget-object v12, v0, LG/c$a;->l:Lkotlin/jvm/functions/Function1;

    iget-object v13, v0, LG/c$a;->m:Ll0/e$b;

    iget-object v14, v0, LG/c$a;->n:Ll0/e$c;

    iget-object v15, v0, LG/c$a;->o:LA/k;

    move-object/from16 v16, v1

    iget-object v1, v0, LG/c$a;->p:Lie/p;

    move-object/from16 v17, v1

    iget v1, v0, LG/c$a;->q:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, LY/g1;->a(I)I

    move-result v18

    iget v1, v0, LG/c$a;->r:I

    invoke-static {v1}, LY/g1;->a(I)I

    move-result v19

    iget v1, v0, LG/c$a;->s:I

    move/from16 v20, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v17

    move-object/from16 v17, p1

    invoke-static/range {v1 .. v20}, LG/c;->a(Landroidx/compose/ui/e;LG/C;LC/A;ZLz/q;Lz/B;ZIFLG/g;LD0/a;Lkotlin/jvm/functions/Function1;Ll0/e$b;Ll0/e$c;LA/k;Lie/p;LY/m;III)V

    return-void
.end method
