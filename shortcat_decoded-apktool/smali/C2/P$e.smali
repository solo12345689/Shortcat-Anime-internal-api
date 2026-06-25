.class public interface abstract LC2/P$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC2/P;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "e"
.end annotation


# static fields
.field public static final a:LC2/P$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LC2/W$a;

    .line 2
    .line 3
    invoke-direct {v0}, LC2/W$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, LC2/W$a;->h()LC2/W;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, LC2/P$e;->a:LC2/P$e;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a(IIIIIID)I
.end method
