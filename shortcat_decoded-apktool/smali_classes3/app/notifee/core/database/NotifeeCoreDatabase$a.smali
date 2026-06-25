.class public Lapp/notifee/core/database/NotifeeCoreDatabase$a;
.super LN3/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lapp/notifee/core/database/NotifeeCoreDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LN3/b;-><init>(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(LS3/g;)V
    .locals 1

    .line 1
    const-string v0, "ALTER TABLE work_data ADD COLUMN with_alarm_manager INTEGER NOT NULL DEFAULT 0"

    .line 2
    .line 3
    invoke-interface {p1, v0}, LS3/g;->T(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
