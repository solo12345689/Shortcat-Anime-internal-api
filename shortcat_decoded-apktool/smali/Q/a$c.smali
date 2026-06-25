.class final LQ/a$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/a;->b(LQ/i;ZLg1/i;ZJLandroidx/compose/ui/e;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ/i;

.field final synthetic b:Z

.field final synthetic c:Lg1/i;

.field final synthetic d:Z

.field final synthetic e:J

.field final synthetic f:Landroidx/compose/ui/e;

.field final synthetic g:I

.field final synthetic h:I


# direct methods
.method constructor <init>(LQ/i;ZLg1/i;ZJLandroidx/compose/ui/e;II)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ/a$c;->a:LQ/i;

    .line 2
    .line 3
    iput-boolean p2, p0, LQ/a$c;->b:Z

    .line 4
    .line 5
    iput-object p3, p0, LQ/a$c;->c:Lg1/i;

    .line 6
    .line 7
    iput-boolean p4, p0, LQ/a$c;->d:Z

    .line 8
    .line 9
    iput-wide p5, p0, LQ/a$c;->e:J

    .line 10
    .line 11
    iput-object p7, p0, LQ/a$c;->f:Landroidx/compose/ui/e;

    .line 12
    .line 13
    iput p8, p0, LQ/a$c;->g:I

    .line 14
    .line 15
    iput p9, p0, LQ/a$c;->h:I

    .line 16
    .line 17
    const/4 p1, 0x2

    .line 18
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 19
    .line 20
    .line 21
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

    invoke-virtual {p0, p1, p2}, LQ/a$c;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 10

    .line 2
    iget-object v0, p0, LQ/a$c;->a:LQ/i;

    iget-boolean v1, p0, LQ/a$c;->b:Z

    iget-object v2, p0, LQ/a$c;->c:Lg1/i;

    iget-boolean v3, p0, LQ/a$c;->d:Z

    iget-wide v4, p0, LQ/a$c;->e:J

    iget-object v6, p0, LQ/a$c;->f:Landroidx/compose/ui/e;

    iget p2, p0, LQ/a$c;->g:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v8

    iget v9, p0, LQ/a$c;->h:I

    move-object v7, p1

    invoke-static/range {v0 .. v9}, LQ/a;->b(LQ/i;ZLg1/i;ZJLandroidx/compose/ui/e;LY/m;II)V

    return-void
.end method
