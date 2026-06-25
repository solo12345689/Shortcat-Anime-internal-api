.class final LU/B$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/B;->b(Lx0/d;Ljava/lang/String;Landroidx/compose/ui/e;JLY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx0/d;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroidx/compose/ui/e;

.field final synthetic d:J

.field final synthetic e:I

.field final synthetic f:I


# direct methods
.method constructor <init>(Lx0/d;Ljava/lang/String;Landroidx/compose/ui/e;JII)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/B$a;->a:Lx0/d;

    .line 2
    .line 3
    iput-object p2, p0, LU/B$a;->b:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, LU/B$a;->c:Landroidx/compose/ui/e;

    .line 6
    .line 7
    iput-wide p4, p0, LU/B$a;->d:J

    .line 8
    .line 9
    iput p6, p0, LU/B$a;->e:I

    .line 10
    .line 11
    iput p7, p0, LU/B$a;->f:I

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 15
    .line 16
    .line 17
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

    invoke-virtual {p0, p1, p2}, LU/B$a;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 8

    .line 2
    iget-object v0, p0, LU/B$a;->a:Lx0/d;

    iget-object v1, p0, LU/B$a;->b:Ljava/lang/String;

    iget-object v2, p0, LU/B$a;->c:Landroidx/compose/ui/e;

    iget-wide v3, p0, LU/B$a;->d:J

    iget p2, p0, LU/B$a;->e:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v6

    iget v7, p0, LU/B$a;->f:I

    move-object v5, p1

    invoke-static/range {v0 .. v7}, LU/B;->b(Lx0/d;Ljava/lang/String;Landroidx/compose/ui/e;JLY/m;II)V

    return-void
.end method
