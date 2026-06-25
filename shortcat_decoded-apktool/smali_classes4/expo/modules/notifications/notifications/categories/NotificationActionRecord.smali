.class public final Lexpo/modules/notifications/notifications/categories/NotificationActionRecord;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljc/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$Options;,
        Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$TextInput;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u0006\u0012\u0004\u0008\t\u0010\u0003\u001a\u0004\u0008\u0007\u0010\u0008R \u0010\n\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u0006\u0012\u0004\u0008\u000c\u0010\u0003\u001a\u0004\u0008\u000b\u0010\u0008R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u000f\u0012\u0004\u0008\u0012\u0010\u0003\u001a\u0004\u0008\u0010\u0010\u0011R \u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u0015\u0012\u0004\u0008\u0018\u0010\u0003\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001b"
    }
    d2 = {
        "Lexpo/modules/notifications/notifications/categories/NotificationActionRecord;",
        "Ljc/b;",
        "<init>",
        "()V",
        "",
        "identifier",
        "Ljava/lang/String;",
        "getIdentifier",
        "()Ljava/lang/String;",
        "getIdentifier$annotations",
        "buttonTitle",
        "getButtonTitle",
        "getButtonTitle$annotations",
        "Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$TextInput;",
        "textInput",
        "Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$TextInput;",
        "getTextInput",
        "()Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$TextInput;",
        "getTextInput$annotations",
        "Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$Options;",
        "options",
        "Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$Options;",
        "getOptions",
        "()Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$Options;",
        "getOptions$annotations",
        "TextInput",
        "Options",
        "expo-notifications_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final buttonTitle:Ljava/lang/String;

.field private final identifier:Ljava/lang/String;

.field private final options:Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$Options;

.field private final textInput:Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$TextInput;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lexpo/modules/notifications/notifications/categories/NotificationActionRecord;->identifier:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lexpo/modules/notifications/notifications/categories/NotificationActionRecord;->buttonTitle:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v0, Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$Options;

    .line 11
    .line 12
    invoke-direct {v0}, Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$Options;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lexpo/modules/notifications/notifications/categories/NotificationActionRecord;->options:Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$Options;

    .line 16
    .line 17
    return-void
.end method

.method public static synthetic getButtonTitle$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .annotation runtime Ljc/e;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getIdentifier$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .annotation runtime Ljc/e;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getOptions$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getTextInput$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method


# virtual methods
.method public final getButtonTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/categories/NotificationActionRecord;->buttonTitle:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getIdentifier()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/categories/NotificationActionRecord;->identifier:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOptions()Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$Options;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/categories/NotificationActionRecord;->options:Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$Options;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTextInput()Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$TextInput;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/categories/NotificationActionRecord;->textInput:Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$TextInput;

    .line 2
    .line 3
    return-object v0
.end method
