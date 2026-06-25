.class public final LYa/f;
.super LYa/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYa/f$a;
    }
.end annotation


# static fields
.field public static final c:LYa/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LYa/f$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LYa/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LYa/f;->c:LYa/f$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(II)V
    .locals 2

    .line 1
    const-string v0, "topWillDisappear"

    .line 2
    .line 3
    const-string v1, "onWillDisappear"

    .line 4
    .line 5
    invoke-direct {p0, p1, p2, v0, v1}, LYa/d;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
