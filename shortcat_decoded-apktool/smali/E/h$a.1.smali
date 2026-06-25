.class final LE/h$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE/h;->a(LE/b;Landroidx/compose/ui/e;LE/I;LC/A;ZLC/b$m;LC/b$e;Lz/n;ZLkotlin/jvm/functions/Function1;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE/b;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:LE/I;

.field final synthetic d:LC/A;

.field final synthetic e:Z

.field final synthetic f:LC/b$m;

.field final synthetic g:LC/b$e;

.field final synthetic h:Lz/n;

.field final synthetic i:Z

.field final synthetic j:Lkotlin/jvm/functions/Function1;

.field final synthetic k:I

.field final synthetic l:I


# direct methods
.method constructor <init>(LE/b;Landroidx/compose/ui/e;LE/I;LC/A;ZLC/b$m;LC/b$e;Lz/n;ZLkotlin/jvm/functions/Function1;II)V
    .locals 0

    .line 1
    iput-object p1, p0, LE/h$a;->a:LE/b;

    .line 2
    .line 3
    iput-object p2, p0, LE/h$a;->b:Landroidx/compose/ui/e;

    .line 4
    .line 5
    iput-object p3, p0, LE/h$a;->c:LE/I;

    .line 6
    .line 7
    iput-object p4, p0, LE/h$a;->d:LC/A;

    .line 8
    .line 9
    iput-boolean p5, p0, LE/h$a;->e:Z

    .line 10
    .line 11
    iput-object p6, p0, LE/h$a;->f:LC/b$m;

    .line 12
    .line 13
    iput-object p7, p0, LE/h$a;->g:LC/b$e;

    .line 14
    .line 15
    iput-object p8, p0, LE/h$a;->h:Lz/n;

    .line 16
    .line 17
    iput-boolean p9, p0, LE/h$a;->i:Z

    .line 18
    .line 19
    iput-object p10, p0, LE/h$a;->j:Lkotlin/jvm/functions/Function1;

    .line 20
    .line 21
    iput p11, p0, LE/h$a;->k:I

    .line 22
    .line 23
    iput p12, p0, LE/h$a;->l:I

    .line 24
    .line 25
    const/4 p1, 0x2

    .line 26
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 27
    .line 28
    .line 29
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

    invoke-virtual {p0, p1, p2}, LE/h$a;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 13

    .line 2
    iget-object v0, p0, LE/h$a;->a:LE/b;

    iget-object v1, p0, LE/h$a;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, LE/h$a;->c:LE/I;

    iget-object v3, p0, LE/h$a;->d:LC/A;

    iget-boolean v4, p0, LE/h$a;->e:Z

    iget-object v5, p0, LE/h$a;->f:LC/b$m;

    iget-object v6, p0, LE/h$a;->g:LC/b$e;

    iget-object v7, p0, LE/h$a;->h:Lz/n;

    iget-boolean v8, p0, LE/h$a;->i:Z

    iget-object v9, p0, LE/h$a;->j:Lkotlin/jvm/functions/Function1;

    iget p2, p0, LE/h$a;->k:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v11

    iget v12, p0, LE/h$a;->l:I

    move-object v10, p1

    invoke-static/range {v0 .. v12}, LE/h;->a(LE/b;Landroidx/compose/ui/e;LE/I;LC/A;ZLC/b$m;LC/b$e;Lz/n;ZLkotlin/jvm/functions/Function1;LY/m;II)V

    return-void
.end method
