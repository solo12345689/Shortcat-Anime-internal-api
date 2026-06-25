.class final LIb/g$k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIb/g;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LIb/g$k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LIb/g$k;

    .line 2
    .line 3
    invoke-direct {v0}, LIb/g$k;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LIb/g$k;->a:LIb/g$k;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Lexpo/modules/image/ExpoImageViewWrapper;Lexpo/modules/image/enums/ContentFit;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    sget-object p2, Lexpo/modules/image/enums/ContentFit;->ScaleDown:Lexpo/modules/image/enums/ContentFit;

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1, p2}, Lexpo/modules/image/ExpoImageViewWrapper;->setPlaceholderContentFit$expo_image_release(Lexpo/modules/image/enums/ContentFit;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/image/ExpoImageViewWrapper;

    .line 2
    .line 3
    check-cast p2, Lexpo/modules/image/enums/ContentFit;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LIb/g$k;->a(Lexpo/modules/image/ExpoImageViewWrapper;Lexpo/modules/image/enums/ContentFit;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    return-object p1
.end method
