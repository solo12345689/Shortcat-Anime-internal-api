.class public final Lv6/d;
.super Ljava/lang/Exception;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv6/d$a;
    }
.end annotation


# static fields
.field public static final c:Lv6/d$a;


# instance fields
.field private final a:Ljava/lang/Integer;

.field private final b:Ldg/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lv6/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lv6/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lv6/d;->c:Lv6/d$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ldg/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv6/d;->a:Ljava/lang/Integer;

    .line 5
    .line 6
    iput-object p2, p0, Lv6/d;->b:Ldg/t;

    .line 7
    .line 8
    return-void
.end method
