.class public final LN4/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN4/a$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method synthetic constructor <init>(LN4/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static b()LN4/a$a;
    .locals 2

    .line 1
    new-instance v0, LN4/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LN4/a$a;-><init>(LN4/q;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method static bridge synthetic c(LN4/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN4/a;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LN4/a;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
