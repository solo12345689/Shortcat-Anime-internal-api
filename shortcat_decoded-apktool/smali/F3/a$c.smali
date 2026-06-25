.class LF3/a$c;
.super LF3/a$b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF3/a$c$a;
    }
.end annotation


# direct methods
.method constructor <init>(Landroid/media/AudioAttributes;)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-direct {p0, p1, v0}, LF3/a$b;-><init>(Landroid/media/AudioAttributes;I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method
