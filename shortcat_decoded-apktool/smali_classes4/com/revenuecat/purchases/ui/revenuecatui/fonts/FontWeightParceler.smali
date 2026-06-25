.class public final Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontWeightParceler;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LQf/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LQf/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J#\u0010\u000c\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontWeightParceler;",
        "LQf/a;",
        "LY0/L;",
        "<init>",
        "()V",
        "Landroid/os/Parcel;",
        "parcel",
        "create",
        "(Landroid/os/Parcel;)LY0/L;",
        "",
        "flags",
        "LTd/L;",
        "write",
        "(LY0/L;Landroid/os/Parcel;I)V",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontWeightParceler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontWeightParceler;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontWeightParceler;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontWeightParceler;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontWeightParceler;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public create(Landroid/os/Parcel;)LY0/L;
    .locals 1

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, LY0/L;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-direct {v0, p1}, LY0/L;-><init>(I)V

    return-object v0
.end method

.method public bridge synthetic create(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontWeightParceler;->create(Landroid/os/Parcel;)LY0/L;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[LY0/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LQf/a$a;->a(LQf/a;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [LY0/L;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontWeightParceler;->newArray(I)[LY0/L;

    move-result-object p1

    return-object p1
.end method

.method public write(LY0/L;Landroid/os/Parcel;I)V
    .locals 0

    const-string p3, "<this>"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "parcel"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, LY0/L;->v()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public bridge synthetic write(Ljava/lang/Object;Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    check-cast p1, LY0/L;

    invoke-virtual {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontWeightParceler;->write(LY0/L;Landroid/os/Parcel;I)V

    return-void
.end method
