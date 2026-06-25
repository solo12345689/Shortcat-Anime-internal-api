.class public interface abstract LP8/a$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/a$d$a;
    }
.end annotation


# static fields
.field public static final O:LP8/a$d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LP8/a$d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LP8/a$d$a;-><init>(LP8/m;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LP8/a$d;->O:LP8/a$d$a;

    .line 8
    .line 9
    return-void
.end method
