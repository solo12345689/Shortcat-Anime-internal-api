.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDBlockQuote$1$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt;->MDBlockQuote-8V94_ZQ(LYh/b;JZLY0/L;Landroidx/compose/ui/e;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lu0/f;",
        "LTd/L;",
        "invoke",
        "(Lu0/f;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $color:J


# direct methods
.method constructor <init>(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDBlockQuote$1$1;->$color:J

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lu0/f;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDBlockQuote$1$1;->invoke(Lu0/f;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lu0/f;)V
    .locals 16

    const-string v0, "$this$drawBehind"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xc

    int-to-float v0, v0

    .line 2
    invoke-static {v0}, Li1/h;->n(F)F

    move-result v2

    const/4 v3, 0x0

    .line 3
    invoke-static {v2, v3}, Lr0/g;->a(FF)J

    move-result-wide v4

    .line 4
    invoke-static {v0}, Li1/h;->n(F)F

    move-result v0

    .line 5
    invoke-interface {v1}, Lu0/f;->f()J

    move-result-wide v2

    invoke-static {v2, v3}, Lr0/l;->g(J)F

    move-result v2

    invoke-static {v0, v2}, Lr0/g;->a(FF)J

    move-result-wide v6

    move-object/from16 v0, p0

    .line 6
    iget-wide v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDBlockQuote$1$1;->$color:J

    const/16 v14, 0x1f0

    const/4 v15, 0x0

    const/high16 v8, 0x40000000    # 2.0f

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 7
    invoke-static/range {v1 .. v15}, Lu0/f;->r1(Lu0/f;JJJFILs0/n1;FLandroidx/compose/ui/graphics/d;IILjava/lang/Object;)V

    return-void
.end method
