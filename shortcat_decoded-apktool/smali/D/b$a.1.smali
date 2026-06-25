.class final LD/b$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/b;->a(Landroidx/compose/ui/e;LD/B;LC/A;ZLC/b$m;Ll0/e$b;Lz/n;ZLkotlin/jvm/functions/Function1;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:LD/B;

.field final synthetic c:LC/A;

.field final synthetic d:Z

.field final synthetic e:LC/b$m;

.field final synthetic f:Ll0/e$b;

.field final synthetic g:Lz/n;

.field final synthetic h:Z

.field final synthetic i:Lkotlin/jvm/functions/Function1;

.field final synthetic j:I

.field final synthetic k:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;LD/B;LC/A;ZLC/b$m;Ll0/e$b;Lz/n;ZLkotlin/jvm/functions/Function1;II)V
    .locals 0

    .line 1
    iput-object p1, p0, LD/b$a;->a:Landroidx/compose/ui/e;

    .line 2
    .line 3
    iput-object p2, p0, LD/b$a;->b:LD/B;

    .line 4
    .line 5
    iput-object p3, p0, LD/b$a;->c:LC/A;

    .line 6
    .line 7
    iput-boolean p4, p0, LD/b$a;->d:Z

    .line 8
    .line 9
    iput-object p5, p0, LD/b$a;->e:LC/b$m;

    .line 10
    .line 11
    iput-object p6, p0, LD/b$a;->f:Ll0/e$b;

    .line 12
    .line 13
    iput-object p7, p0, LD/b$a;->g:Lz/n;

    .line 14
    .line 15
    iput-boolean p8, p0, LD/b$a;->h:Z

    .line 16
    .line 17
    iput-object p9, p0, LD/b$a;->i:Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    iput p10, p0, LD/b$a;->j:I

    .line 20
    .line 21
    iput p11, p0, LD/b$a;->k:I

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

    invoke-virtual {p0, p1, p2}, LD/b$a;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 12

    .line 2
    iget-object v0, p0, LD/b$a;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LD/b$a;->b:LD/B;

    iget-object v2, p0, LD/b$a;->c:LC/A;

    iget-boolean v3, p0, LD/b$a;->d:Z

    iget-object v4, p0, LD/b$a;->e:LC/b$m;

    iget-object v5, p0, LD/b$a;->f:Ll0/e$b;

    iget-object v6, p0, LD/b$a;->g:Lz/n;

    iget-boolean v7, p0, LD/b$a;->h:Z

    iget-object v8, p0, LD/b$a;->i:Lkotlin/jvm/functions/Function1;

    iget p2, p0, LD/b$a;->j:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v10

    iget v11, p0, LD/b$a;->k:I

    move-object v9, p1

    invoke-static/range {v0 .. v11}, LD/b;->a(Landroidx/compose/ui/e;LD/B;LC/A;ZLC/b$m;Ll0/e$b;Lz/n;ZLkotlin/jvm/functions/Function1;LY/m;II)V

    return-void
.end method
