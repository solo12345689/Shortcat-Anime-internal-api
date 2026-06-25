.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderDefaults$fadeAnimationSpec$2;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderDefaults;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lie/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lw/M;",
        "",
        "invoke",
        "()Lw/M;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderDefaults$fadeAnimationSpec$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderDefaults$fadeAnimationSpec$2;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderDefaults$fadeAnimationSpec$2;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderDefaults$fadeAnimationSpec$2;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderDefaults$fadeAnimationSpec$2;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderDefaults$fadeAnimationSpec$2;->invoke()Lw/M;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lw/M;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw/M;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x4

    const/16 v2, 0x258

    const/16 v3, 0xc8

    .line 2
    invoke-static {v2, v3, v0, v1, v0}, Lw/j;->j(IILw/D;ILjava/lang/Object;)Lw/r0;

    move-result-object v4

    .line 3
    sget-object v5, Lw/b0;->b:Lw/b0;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-wide/16 v6, 0x0

    .line 4
    invoke-static/range {v4 .. v9}, Lw/j;->e(Lw/C;Lw/b0;JILjava/lang/Object;)Lw/M;

    move-result-object v0

    return-object v0
.end method
