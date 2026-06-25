.class public final Lwd/u$c;
.super Lwd/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwd/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final c:Ljava/util/Date;


# direct methods
.method public constructor <init>(Ljava/util/Date;Lwd/t;)V
    .locals 1

    .line 1
    const-string v0, "commitTime"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, p2, v0}, Lwd/u;-><init>(Lwd/t;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lwd/u$c;->c:Ljava/util/Date;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b()Ljava/util/Date;
    .locals 1

    .line 1
    iget-object v0, p0, Lwd/u$c;->c:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method
