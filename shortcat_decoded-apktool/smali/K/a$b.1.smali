.class final LK/a$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/a;->a(LQ/i;Landroidx/compose/ui/e;JLY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ/i;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:J

.field final synthetic d:I

.field final synthetic e:I


# direct methods
.method constructor <init>(LQ/i;Landroidx/compose/ui/e;JII)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/a$b;->a:LQ/i;

    .line 2
    .line 3
    iput-object p2, p0, LK/a$b;->b:Landroidx/compose/ui/e;

    .line 4
    .line 5
    iput-wide p3, p0, LK/a$b;->c:J

    .line 6
    .line 7
    iput p5, p0, LK/a$b;->d:I

    .line 8
    .line 9
    iput p6, p0, LK/a$b;->e:I

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
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

    invoke-virtual {p0, p1, p2}, LK/a$b;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 7

    .line 2
    iget-object v0, p0, LK/a$b;->a:LQ/i;

    iget-object v1, p0, LK/a$b;->b:Landroidx/compose/ui/e;

    iget-wide v2, p0, LK/a$b;->c:J

    iget p2, p0, LK/a$b;->d:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v5

    iget v6, p0, LK/a$b;->e:I

    move-object v4, p1

    invoke-static/range {v0 .. v6}, LK/a;->a(LQ/i;Landroidx/compose/ui/e;JLY/m;II)V

    return-void
.end method
