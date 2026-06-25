.class public LE3/o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE3/b3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE3/o$b;,
        LE3/o$c;
    }
.end annotation


# static fields
.field public static final g:I


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LE3/o$c;

.field private final c:Ljava/lang/String;

.field private final d:I

.field private final e:Landroid/app/NotificationManager;

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, LE3/Q6;->a:I

    .line 2
    .line 3
    sput v0, LE3/o;->g:I

    .line 4
    .line 5
    return-void
.end method

.method private constructor <init>(LE3/o$b;)V
    .locals 3

    .line 11
    invoke-static {p1}, LE3/o$b;->a(LE3/o$b;)Landroid/content/Context;

    move-result-object v0

    .line 12
    invoke-static {p1}, LE3/o$b;->b(LE3/o$b;)LE3/o$c;

    move-result-object v1

    .line 13
    invoke-static {p1}, LE3/o$b;->c(LE3/o$b;)Ljava/lang/String;

    move-result-object v2

    .line 14
    invoke-static {p1}, LE3/o$b;->d(LE3/o$b;)I

    move-result p1

    .line 15
    invoke-direct {p0, v0, v1, v2, p1}, LE3/o;-><init>(Landroid/content/Context;LE3/o$c;Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(LE3/o$b;LE3/o$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LE3/o;-><init>(LE3/o$b;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LE3/o$c;Ljava/lang/String;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LE3/o;->a:Landroid/content/Context;

    .line 4
    iput-object p2, p0, LE3/o;->b:LE3/o$c;

    .line 5
    iput-object p3, p0, LE3/o;->c:Ljava/lang/String;

    .line 6
    iput p4, p0, LE3/o;->d:I

    .line 7
    const-string p2, "notification"

    .line 8
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    .line 9
    invoke-static {p1}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    iput-object p1, p0, LE3/o;->e:Landroid/app/NotificationManager;

    .line 10
    sget p1, LE3/P6;->w0:I

    iput p1, p0, LE3/o;->f:I

    return-void
.end method


# virtual methods
.method public final a(LE3/h3;Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method
