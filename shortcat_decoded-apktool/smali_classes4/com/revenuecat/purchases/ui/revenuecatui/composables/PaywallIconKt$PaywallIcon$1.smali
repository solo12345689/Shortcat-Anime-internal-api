.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIcon$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt;->PaywallIcon-FNF3uiM(Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;Landroidx/compose/ui/e;JLY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$default:I

.field final synthetic $icon:Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;

.field final synthetic $modifier:Landroidx/compose/ui/e;

.field final synthetic $tintColor:J


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;Landroidx/compose/ui/e;JII)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIcon$1;->$icon:Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIcon$1;->$modifier:Landroidx/compose/ui/e;

    .line 4
    .line 5
    iput-wide p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIcon$1;->$tintColor:J

    .line 6
    .line 7
    iput p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIcon$1;->$$changed:I

    .line 8
    .line 9
    iput p6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIcon$1;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIcon$1;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 7

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIcon$1;->$icon:Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;

    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIcon$1;->$modifier:Landroidx/compose/ui/e;

    iget-wide v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIcon$1;->$tintColor:J

    iget p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIcon$1;->$$changed:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v5

    iget v6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIcon$1;->$$default:I

    move-object v4, p1

    invoke-static/range {v0 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt;->PaywallIcon-FNF3uiM(Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;Landroidx/compose/ui/e;JLY/m;II)V

    return-void
.end method
